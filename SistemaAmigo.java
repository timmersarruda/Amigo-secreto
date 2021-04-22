package amigosec;

import java.util.ArrayList;
import java.util.List;

public class SistemaAmigo {
	
	private List<Amigo> amigos;
	private List<Mensagem> mensagens;
	private int maxMensagens;
	
	public static final int DEFAULT_MAX_MENSAGENS = 1000;
	
	public SistemaAmigo() {
		this(DEFAULT_MAX_MENSAGENS);
	}
	
	public SistemaAmigo(int maxMensagens) {
		this.amigos = new ArrayList<>();
		this.mensagens = new ArrayList<>();
		this.setMaxMensagens(maxMensagens);
	}
	
	public void enviarMensagemParaTodos(String texto, String emailRemetente, boolean ehAnonima) {
		//TODO
	}
	
	public void enviarMensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima) {
		//TODO
	}
	
	public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException {
		
	}
	
	public void cadastraAmigo(String nomeAmigo, String emailAmigo) throws AmigoJaExisteException{
		
	}
	
	public List<Mensagem> pesquisaMensagensAnonimas(){
		//TODO
		return null;
	}
	
	public List<Mensagem> pesquisaTodasMensagens(){
		//TODO
		return null;
	}
	 
	public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws AmigoInexistenteException {
		//TODO
		return null;
		
	}

	public int getMaxMensagens() {
		return maxMensagens;
	}

	public void setMaxMensagens(int maxMensagens) {
		this.maxMensagens = maxMensagens;
	}

	public List<Amigo> pesquisaTodosOsParticipantes() { 
		return null;
	}

	

}
