package exerciciosAula1;

public class Exercicio3 {

		
	public static void main(String[] args) {
		String texto = "Este eh um texto de exemplo";
		
		String texto2 = texto.replaceAll("[aeiouAEIOU]", "");
		
		System.out.println(texto2);
		
	}

}
