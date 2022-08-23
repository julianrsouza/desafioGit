package gerenciador;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import entity.Conta;
import exceptions.ContaNaoEncontradaException;
import exceptions.SaldoInsuficienteException;

public class GerenciadorConta {
	
	public List< Conta > buscaPorCpfTitular( List< Conta > contas, String cpf ) throws ContaNaoEncontradaException {
		List< Conta > contasBuscadas = contas.stream()
				.filter( conta -> cpf.equals( conta.getTitular().getCpf() ) )
				.collect( Collectors.toList() );
		if ( contasBuscadas.isEmpty() ) {
			throw new ContaNaoEncontradaException( "Conta não encontrada pelo CPF" );
		}
		return contasBuscadas;
	}
	
	public Conta buscaConta( List< Conta > contas, String banco, Integer agencia, Integer numConta ) throws ContaNaoEncontradaException {
		Optional< Conta > contaRetorno = Optional.ofNullable( contas.stream().filter( conta -> banco.equals( conta.getBanco().getNome() ) )
				.filter( conta -> agencia.equals( conta.getAgencia() ) )
				.filter( conta -> numConta.equals( conta.getNumConta() ) )
				.findFirst().orElseThrow( () -> new ContaNaoEncontradaException( "Conta não encontrada" ) ) );
		return contaRetorno.get();
	}
	
	public Conta saque( List< Conta > contas, String banco, Integer agencia, Integer numConta, Double valor ) throws ContaNaoEncontradaException, SaldoInsuficienteException {
		Conta conta = this.buscaConta( contas, banco, agencia, numConta );
		if (  conta.getSaldo() < valor ) {
			throw new SaldoInsuficienteException( "Saldo insuficiente para o saque. \nSaldo da conta: " + conta.getSaldo() );
		} else {
			conta.setSaldo( conta.getSaldo() - valor );
			System.out.println( "Saque efetuado com sucesso! \nSaldo da conta: " + conta.getSaldo() );
		}
		return conta;
	}
	
}
