package amigosec;

public abstract class MensagemParaAlguem extends Mensagem{
	
	private String emailDestinatario;
	
	public MensagemParaAlguem(String emailRemetente, String emailDestinatario, boolean anonima) {
		super(emailRemetente, emailDestinatario, anonima);
		this.setEmailDestinatario(emailDestinatario);
	}

	public String getEmailDestinatario() {
		return emailDestinatario;
	}

	public void setEmailDestinatario(String emailDestinatario) {
		this.emailDestinatario = emailDestinatario;
	}
	
	public String getTextoCompletoAExibir() {
		if (super.ehAnonima()) {
			return "Mensagem para: "+this.emailDestinatario+"Texto: "+ super.getTexto();
		}else {
			return "Mensagem de" + super.getEmailRemetente()+"Para: "+this.emailDestinatario+"Texto: "+ super.getTexto(); 
		}
	
	}
	

}
