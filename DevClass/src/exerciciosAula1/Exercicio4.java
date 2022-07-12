package exerciciosAula1;

public class Exercicio4 {

	static boolean ehPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		for (int i =2; i < numero; i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int numero1 = 7;
		int numero2 = 10;
		int numero3 = 43;
		
		System.out.println(ehPrimo(numero1));
		System.out.println(ehPrimo(numero2));
		System.out.println(ehPrimo(numero3));

	}

}
