package exerciciosException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main (String[] args) throws ContaNaoEncontradaException, SaldoNegativadoException {
		List< Conta > contas = Arrays.asList( new Conta( "01252568090","Claudio", "Banco do Brasil", 0630, 128596, 1200.0 )
				, new Conta( "06089676888", "Jurema", "Caixa Economica Federal", 0530, 898998, 530.0 )
				, new Conta( "12965055520", "Cleiton", "Itau", 1222, 456328, -250.0 )
				, new Conta( "56589812010", "Ana", "Banrisul", 0620, 630580, 5000.0) );
		
		System.out.println("Exercício 1");
		try {
		System.out.println( consultaPorCPF( contas, "06089676888" ) );
		System.out.println();
		System.out.println( consultaPorCPF( contas, "00012312344" ) );
		} catch ( Exception e ) {
			System.out.println( e.getMessage() );
		}
		System.out.println();
		System.out.println("Exercício 2");
		try {
			consultaSaldoPorCPF(contas, "56589812010");
			System.out.println();
			consultaSaldoPorCPF(contas, "12965055520");
		} catch ( Exception e ) {
			System.out.println( e.getMessage() );
		}
		System.out.println();
		System.out.println("Exercício 3");
		try {
			saque(contas.get(0), 1000.0);
			System.out.println();
			saque(contas.get(0), 1000.0);
		} catch ( Exception e ) {
			System.out.println( e.getMessage() );
		}
}
	

	private static List< Conta > consultaPorCPF( List< Conta > contas, String cpf ) throws ContaNaoEncontradaException {
		if ( contas.stream().noneMatch( conta -> conta.getCpfTitular().equals( cpf ) ) ) {
			throw new ContaNaoEncontradaException();
		}
		return contas.stream().filter( conta -> conta.getCpfTitular().equals( cpf ) ).collect( Collectors.toList() );
	}
	
	private static void consultaSaldoPorCPF( List< Conta > contas, String cpf ) throws SaldoNegativadoException, ContaNaoEncontradaException {
		if ( consultaPorCPF( contas, cpf ).stream().anyMatch( conta -> conta.getSaldo() < 0 )  ) {
			throw new SaldoNegativadoException();
		}
		contas.stream().filter( conta -> conta.getCpfTitular().equals( cpf ) ).forEach( conta -> System.out.println( conta.getSaldo() ) ); 
	}
	
	private static void saque( Conta conta, Double valor ) throws SaldoInsuficienteException {
		if ( conta.getSaldo() < valor ) {
			throw new SaldoInsuficienteException();
		}
		conta.setSaldo( conta.getSaldo() - valor );
		System.out.println( conta.getSaldo() );
	}
	
}
