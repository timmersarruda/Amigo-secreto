package amigosec;

public abstract class MensagemParaTodos extends Mensagem{
	
	public MensagemParaTodos(String texto, String emailRemetente, boolean anonima) {
		super(texto, emailRemetente, anonima);
	}
	public String getTextoAExibir(){
		if (super.ehAnonima()) {
			return "Mensagem para todos, Texto: "+super.getTexto();
		}else {
			return "Mensagem para" + super.getEmailRemetente()+"Texto: "+ super.getTexto()+""; 
		}
	}

}
