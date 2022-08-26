package exerciciosLambdaOptionalStream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static List<Integer> ordenaNumeros(List<Integer> numeros){
		return numeros.stream().sorted().collect(Collectors.toList());
	}
	
	public static List<String> filtraNomesPorCaractere(List<String> nomes, char caractere){
		return nomes.stream().filter(nome -> {
			char charInicial = nome.charAt(0);
			return charInicial == caractere;
		}).collect(Collectors.toList());
	}
	
	public static List<Pessoa> filtraMaioresDeIdade(List<Pessoa> pessoas) {
		return pessoas.stream().filter(pessoa -> pessoa.getIdade() >= 18).collect(Collectors.toList());
	}
	
	public static Optional<Veiculo> buscaPorChassi(List<Veiculo> veiculos, String chassi) {
		return veiculos.stream().filter(veiculo -> veiculo.getChassi() != null)
				.filter(veiculo -> veiculo.getChassi().equals(chassi)).findFirst();
	}
	
	public static List<String> filtraCidadesPorEstado(List<Pessoa> pessoas, String estado) {
		List<String> cidadeResultado = new ArrayList<>();
		pessoas.stream()
				.filter(pessoa -> pessoa.getCidadeEstado().contains(estado))
				.forEach(pessoa -> cidadeResultado.add(pessoa.getCidadeEstado()));
		return cidadeResultado;
	}
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(4, 12, 32, 64, 5, 1, 9);
		List<String> nomes = Arrays.asList("Cleiton", "Renan", "Carlos", "Betina");
		
		List<Pessoa> pessoas = Arrays.asList(new Pessoa("Claudio", "Souza", LocalDate.of(1990, 03, 12), "Canoas - RS")
				,new Pessoa("Bruno", "Scherer", LocalDate.of(2004, 10, 20), "Porto Alegre - RS")
				,new Pessoa("Julian", "Souza", LocalDate.of(1993, 05, 24), "Montenegro - RS")
				,new Pessoa("Ricardo", "Silva", LocalDate.of(2010, 12, 05), "Sao Paulo - SP")
				,new Pessoa("Batata", "Potato", LocalDate.of(2010, 12, 05), "Guarulhos - SP"));
		
		List<Veiculo> veiculos = Arrays.asList(new Veiculo("ABCD1212", "Volkswagen", "Voyage")
				,new Veiculo("BCDE2323", "Chevrolet", "Celta")
				,new Veiculo("CDEF3434", "Hyundai", "HB20")); 
		
		System.out.println(ordenaNumeros(numeros));
		System.out.println();
		System.out.println(filtraNomesPorCaractere(nomes, 'C'));
		System.out.println();
		System.out.println(filtraMaioresDeIdade(pessoas));
		System.out.println();
		System.out.println(buscaPorChassi(veiculos, "BCDE2323"));
		System.out.println();
		System.out.println(filtraCidadesPorEstado(pessoas, "RS"));
		System.out.println(filtraCidadesPorEstado(pessoas, "SP"));

	}

}
