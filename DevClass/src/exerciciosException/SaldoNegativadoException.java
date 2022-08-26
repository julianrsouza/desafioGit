package exerciciosException;

public class SaldoNegativadoException extends Exception{

	public SaldoNegativadoException() {
		super( "O saldo da conta está negativo." );
	}
}
