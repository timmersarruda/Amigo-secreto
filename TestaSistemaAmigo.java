package amigosec;

import java.util.List;

import javax.swing.JOptionPane;

public class TestaSistemaAmigo {
	
	public static void main(String [] args) {
		SistemaAmigo sistema = new SistemaAmigo();
		try {
			sistema.cadastraAmigo("José", "jose@goo.com");
			sistema.cadastraAmigo("Maria","maria@goo.com");
		
			sistema.configuraAmigoSecretoDe("jose@goo.com", "maria@goo.com");
			sistema.configuraAmigoSecretoDe("maria@goo.com", "jose@goo.com");
			
			sistema.enviarMensagemParaAlguem("Oi José", "maria@goo.com", "jose@goo.com", true);
			sistema.enviarMensagemParaTodos("Oi pessoal", "maria@goo.com", true);
			
			List<Mensagem> mensagensAnonimas = sistema.pesquisaMensagensAnonimas();
			for(Mensagem m: mensagensAnonimas) {
				System.out.println(m.getTextoCompletoAExibir());
			}
			
		
		} catch (AmigoJaExisteException | AmigoInexistenteException e) {
			JOptionPane.showMessageDialog(null, "Houve um problema");
			e.printStackTrace();
		}

		// Cadastrar dois amigos: josé e maria com seus emails 
		
	}

}
