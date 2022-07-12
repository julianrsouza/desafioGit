package exerciciosAula1;

public class Exercicio1 {

	public static int calculaExtrato (int primeiroValor, int segundoValor, int terceiroValor) {
		return primeiroValor + segundoValor + terceiroValor;
	}
	
	public static double calculaMediaGastos (int primeiroValor, int segundoValor, int terceiroValor) {
		double somaValores = (double) primeiroValor + (double) segundoValor + (double) terceiroValor;
		return somaValores / 3;
	}
	
	
	public static void main(String[] args) {
		int gastoJaneiro = 15000;
		int gastoFevereiro = 23000;
		int gastoMarco = 17000;
		
		System.out.println("O gasto total da empresa no primeiro trimestre foi de:");
		System.out.println(calculaExtrato(gastoJaneiro, gastoFevereiro, gastoMarco));
		System.out.println("A média de gastos da empresa por mês foi de:");
		System.out.println((double)calculaMediaGastos(gastoJaneiro, gastoFevereiro, gastoMarco));

	}

}
