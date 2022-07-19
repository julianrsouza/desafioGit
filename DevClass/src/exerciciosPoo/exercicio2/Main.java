package exerciciosPoo.exercicio2;

public class Main {

	public static void main(String[] args) {
		Contato contato1 = new Contato("Jovisnei", "996282322", "jovis@nei.com.br");
		Contato contato2 = new Contato("Claudionete", "989441232", "claudionete@nete.com.br");
		
		SMS torpedo = new SMS("Claudionete, me paga o que me deve!",contato1, contato2);
		Email email = new Email("Olá Jovisnei!\nVocê foi convidado para participar da reunião da Hinodê. \n\n [CLIQUE AQUI]", contato2, contato1);
		
		System.out.println(torpedo.envioSMS());
		System.out.println("\n-------------------------\n");
		System.out.println(email.envioEmail());
	}

}
