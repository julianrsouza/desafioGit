package exerciciosAula3.exercicio2;

public class Main {

	public static void main(String[] args) {
		IElevador elevador = new Elevador(15,6);
		for(int i = 0; i < 7; i++) {
			elevador.entra();
		}
		System.out.println();
		for(int i = 0; i < 7; i++) {
			elevador.sai();
		}
		System.out.println();
		for(int i = 0; i < 16; i++) {
			elevador.sobe();
		}
		System.out.println();
		for(int i = 0; i < 16; i++) {
			elevador.desce();
		}
	}
}
