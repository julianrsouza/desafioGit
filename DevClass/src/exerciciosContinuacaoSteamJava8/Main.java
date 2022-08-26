package exerciciosContinuacaoSteamJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List< Veiculo > veiculos = Arrays.asList( 
				new Veiculo( "Volkswagen", "Gol", "IUV1E32", "BATATINHA", 55000.0 )
				, new Veiculo( "Hyundai", "HB20", "QUB2C04", "POTATO", 80000.0 )
				, new Veiculo( "Fiat", "Uno", "CCC2C22", "CHASSIUNO", 50000.0 ) 
				, new Veiculo( "Chevrolet", "Celta", "DDD5I02" , "CHASSICELTA", 25000.0 ) );
		
		List< Veiculo > veiculosVW = Arrays.asList( 
				new Veiculo( "Volkswagen", "Tiguan", "BBB2018", "CHASSITIGUAN", 200000.0 )
				, new Veiculo( "Volkswagen", "Jetta", "III2B11", "CHASSIJETTA", 130000.0 )
				, new Veiculo( "Volkswagen", "Fusca", "IUB2D14", "CHASSIFUSCA", 10000.0 )
				, new Veiculo( "Volkswagen", "Santana", "DDC2B11", "CHASSISANTANA", 130000.0 ) );
		
		System.out.println( validaListaSomenteVW( veiculos ) );
		System.out.println( validaListaSomenteVW( veiculosVW ) );
		System.out.println();
		System.out.println( validaListaSemGol( veiculos ) );
		System.out.println( validaListaSemGol( veiculosVW ) );
		System.out.println();
		System.out.println( validaSeListaContemJetta( veiculos ) );
		System.out.println( validaSeListaContemJetta( veiculosVW ) );
		System.out.println();
		System.out.println( somaValoresVeiculos( veiculos ) );
		System.out.println();
		alteraPlacaVeiculo( veiculos, "ABC1234" );
		listaVeiculos( veiculos );
		System.out.println();
		listaVeiculos( duplicaVeiculos( veiculosVW ) );
		System.out.println(listaPlacasVeiculos( veiculosVW ) );
		System.out.println();
		listaVeiculos( ordenaVeiculosPorValor( veiculosVW ) );
	}
	
	//Exercício #1
	private static Boolean validaListaSomenteVW( List< Veiculo > veiculos ) {
		return veiculos.stream().allMatch( veiculo -> veiculo.getMarca().equals( "Volkswagen" ) );
	}
	
	private static Boolean validaListaSemGol( List< Veiculo > veiculos ) {
		return veiculos.stream().noneMatch( veiculo -> veiculo.getModelo().equals( "Gol" ) );
	}
	
	private static Boolean validaSeListaContemJetta( List< Veiculo > veiculos ) {
		return veiculos.stream().anyMatch( veiculo -> veiculo.getModelo().equals( "Jetta" ) );
	}  
	
	//Exercício #2
	private static Double somaValoresVeiculos( List< Veiculo > veiculos ) {
		return veiculos.stream().map( veiculo -> veiculo.getValor() ).reduce( ( total , atual ) -> total + atual ).get();
	}
	
	//Exercício #3 
	private static void alteraPlacaVeiculo( List< Veiculo > veiculos, String placa ) {
		veiculos.stream().forEach( veiculo -> veiculo.setPlaca( placa ) );
	}
	
	//Metodo para printar a lista com as placas alteradas
	private static void listaVeiculos( List< Veiculo > veiculos ) {
		veiculos.stream().forEach( veiculo -> { System.out.println( veiculo );
		System.out.println();
		});
	}
	
	//Exercício #4
	private static List< Veiculo > duplicaVeiculos( List< Veiculo > veiculos ) {
		return veiculos.stream().flatMap( veiculo -> Stream.of( veiculo, veiculo ) )
				.collect( Collectors.toList() );
	}
	
	//Exercício #5
	private static List< String > listaPlacasVeiculos( List< Veiculo > veiculos ) {
		return veiculos.stream().map( veiculo -> veiculo.getPlaca() ).collect( Collectors.toList() );
	}
	
	//Exercício #6
	private static List< Veiculo > ordenaVeiculosPorValor( List< Veiculo > veiculos ) {
		return veiculos.stream().sorted(
				( primeiroVeiculo, segundoVeiculo ) -> primeiroVeiculo.getValor()
				.compareTo( segundoVeiculo.getValor() ) ).collect( Collectors.toList() );
	}
	
}
