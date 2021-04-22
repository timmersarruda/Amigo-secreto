package amigosec;

public class Amigo {
	private String nome;
	private String email;
	private String emailAmigoSorteado;
	
	public Amigo(String nomeAmigo, String emailAmigo) {
		this.setNome(nomeAmigo);
		this.email = emailAmigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailAmigoSorteado() {
		return emailAmigoSorteado;
	}

	public void setEmailAmigoSorteado(String emailAmigoSorteado) {
		this.emailAmigoSorteado = emailAmigoSorteado;
	}

}