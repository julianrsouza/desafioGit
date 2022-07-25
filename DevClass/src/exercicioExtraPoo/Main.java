package exercicioExtraPoo;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Pessoa comprador = new Pessoa("Jerenelson", 1500.00);
		
		Livraria livrariaProgresso = new Livraria();
		livrariaProgresso.incluiProduto(
				new Jornal("22/05/2022", 50.00, "Montenegro Times", Arrays.asList(
				new Reportagem("Julian faz exercício do curso de dev", 
						"O garoto Juliboy fez a grande façanha de terminar o exercício de dev. Mesmo após se bater por muito tempo, ele conseguiu.",
						Arrays.asList("Juliboy", "Cleiton"))), 15));
		
		livrariaProgresso.incluiProduto(new Livro("As peripécias de Julian", Arrays.asList("Carlos"), "Montenegro Publisher", "10/03/2021", 100.00, 50));
		livrariaProgresso.incluiProduto(
				new Revista("01/02/2001", 15.00, "Montenegro Publisher", 1, Arrays.asList(
				new Artigo("Montenegro está crescendo!", "A cidade está cada vez maior, isso se deve ao aumento do número de pessoas, parece brincadeira mas é verdade.",
				Arrays.asList("Pablo"))), 150));
		
		livrariaProgresso.listaProdutosResumidos();
		System.out.println();
		livrariaProgresso.listaProdutos();
		
		livrariaProgresso.listaProdutoPorId(2);
		
		livrariaProgresso.editaProduto(2, new Livro("As peripécias de Julian", Arrays.asList("Carlos", "Cleiton"), "Montenegro Publisher", "10/05/2021", 150.00, 50));
		System.out.println();
		livrariaProgresso.listaProdutoPorId(2);
		System.out.println();
		System.out.println(comprador);
		System.out.println();
		livrariaProgresso.vendaProduto(2, comprador, ModalidadeVendaEnum.Estudante);
		
		livrariaProgresso.listaProdutoPorId(2);
		System.out.println();
		System.out.println(comprador);
		System.out.println();
		livrariaProgresso.vendaProduto(2, comprador, ModalidadeVendaEnum.Demais);
		livrariaProgresso.listaProdutoPorId(2);
		System.out.println();
		System.out.println(comprador);
	}

}
