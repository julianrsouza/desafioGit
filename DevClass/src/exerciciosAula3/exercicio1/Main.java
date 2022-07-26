package exerciciosAula3.exercicio1;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Julian", LocalDate.of(1993, 05, 24), 1.90f);
		System.out.println(pessoa1.toString());
		System.out.println();
		pessoa1.calculaIdade(pessoa1.getDataNasc());
		System.out.println(pessoa1.toString());
	}

}
