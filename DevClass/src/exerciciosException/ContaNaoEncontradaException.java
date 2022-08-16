package exerciciosException;

public class ContaNaoEncontradaException extends Exception {

	 public ContaNaoEncontradaException() {
		 super( "Conta não encontrada pelo CPF." );
	 }
}
