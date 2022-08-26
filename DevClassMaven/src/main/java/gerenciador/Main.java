package gerenciador;

import java.util.Arrays;
import java.util.List;

import entity.Banco;
import entity.Conta;
import entity.Titular;
import enums.TipoContaEnum;
import exceptions.ContaNaoEncontradaException;
import exceptions.SaldoInsuficienteException;
import gerenciador.GerenciadorConta;

public class Main {

	public static void main(String[] args) {
		
		GerenciadorConta gerenciador = new GerenciadorConta();
		
		List< Banco > bancos = Arrays.asList( new Banco( "Itau" , "I01" )
				, new Banco( "Caixa" , "C01" )
				, new Banco( "Bradesco", "B01" ) );
		List< Titular > titulares = Arrays.asList( new Titular( "Julian", "02968553089" )
				, new Titular( "Bruno", "99999988888" )
				, new Titular( "Cleiton", "12312312322") );
		List< Conta > contas = Arrays.asList( new Conta( 0530, bancos.get( 2 ), 893225, 250.0, titulares.get( 0 ), TipoContaEnum.SALARIO )
				, new Conta( 1282, bancos.get( 0 ), 9852525, 3000.0, titulares.get( 1 ), TipoContaEnum.CORRENTE )
				, new Conta( 1212, bancos.get( 1 ), 12365445, 10.0, titulares.get( 2 ), TipoContaEnum.POUPANCA ) );

		try {
			System.out.println( gerenciador.buscaPorCpfTitular( contas, "02968553089" ) );
			System.out.println( gerenciador.buscaPorCpfTitular( contas, "12968553089" ) );
		} catch (ContaNaoEncontradaException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println( gerenciador.buscaConta( contas, "Bradesco", 0530, 893225 ) );
			System.out.println( gerenciador.buscaConta( contas, "Batata", 0530, 893225 ) );
    	} catch (ContaNaoEncontradaException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println( contas.get( 0 ).getSaldo() );
			System.out.println( gerenciador.saque( contas, "Bradesco", 0530, 893225, 200.0 ) );
			System.out.println( gerenciador.saque( contas, "Bradesco", 0530, 893225, 200.0 ) );
		} catch ( ContaNaoEncontradaException | SaldoInsuficienteException e ) {
			e.printStackTrace();
		}
	}

}
