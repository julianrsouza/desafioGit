package exerciciosAula1;

public class Exercicio2 {

	public static int somaPares(int numeroMaximo) {
		int somador = 0;
		int resultadoSoma = 0;
		while (somador <= numeroMaximo) {
			if(somador % 2 == 0) {
				resultadoSoma += somador;
				somador++;
			} else {
				somador++;
			}
		}
		return resultadoSoma;
	}
	
	public static int somaImpares(int numeroMaximo) {
		int somador = 0;
		int resultadoSoma = 0;
		while (somador<= numeroMaximo) {
			if(somador % 2 == 0) {
				somador++;
			} else {
				resultadoSoma += somador;
				somador++;
			}
		}
		return resultadoSoma;
	}
		
	
	public static void main(String[] args) {
		int numero = 10;
		
		System.out.println(somaPares(numero));
		System.out.println(somaImpares(numero));

	}

}
