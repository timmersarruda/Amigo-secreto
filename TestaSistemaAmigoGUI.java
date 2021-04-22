package amigosec;

import java.util.List;

import javax.swing.JOptionPane;

public class TestaSistemaAmigoGUI {
	public static void main(String [] args) {
		int maxMensagens = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade máxima de mensagens?"));
		SistemaAmigo sistema = new SistemaAmigo(maxMensagens);
		int numAmigos = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de participantes?"));
		for(int k = 0; k < numAmigos; k++) {
			String nomeAmigo = JOptionPane.showInputDialog("Digite o nome da pessoa: ");
			String emailAmigo = JOptionPane.showInputDialog("Digite o email da pessoa: ");
			try {
				sistema.cadastraAmigo(nomeAmigo, emailAmigo);
			} catch (AmigoJaExisteException e) {
				JOptionPane.showMessageDialog(null, "Não foi possível cadastrar");
				e.printStackTrace();
			}
		}
		
		List<Amigo> todosOsParticipantes= sistema.pesquisaTodosOsParticipantes();
		for(Amigo a: todosOsParticipantes) {
			String emailSorteado = JOptionPane.showInputDialog("Quem é o amigo de "+ a.getEmail()+"?");
			try {
				sistema.configuraAmigoSecretoDe(a.getEmail(), emailSorteado);
			} catch (AmigoInexistenteException e) {
				JOptionPane.showMessageDialog(null, "Houve um problema no sorteio");
				e.printStackTrace();
			}
		}
		String texto = JOptionPane.showInputDialog("Qual o texto da mensagem?");
		String emailRemetente = JOptionPane.showInputDialog("Qual o seu email cadastrado no sistema?");
		String mensagemEhAnonima = JOptionPane.showInputDialog("Quer enviar anonimamente? Sim (S) ou Não (N)");
		boolean ehAnonima = false;
		if(mensagemEhAnonima.equals("S")) {
			ehAnonima = true;
		}
		sistema.enviarMensagemParaTodos(texto, emailRemetente, ehAnonima);
	}

}
