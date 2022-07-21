package exercicioExtraPoo;

import java.util.ArrayList;
import java.util.List;

public class Livraria {
	private List<Produto> produtos = new ArrayList<>();
	private Integer seqCodProduto = 1;
	
	public void incluiProduto(Produto produto) {
		produto.setCodigo(seqCodProduto);
		seqCodProduto++;
		this.produtos.add(produto);
	}
	
	public void editaProduto(Integer codProduto, Produto produtoAlteracao) {
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getCodigo() == codProduto) {
				produtoAlteracao.setCodigo(codProduto);
				produtos.set(i, produtoAlteracao);
			}
		}
	}
	
	public void listaProdutoPorId(Integer codProduto) {
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getCodigo() == codProduto) {
				System.out.println(produtos.get(i).toString());
			}
		}	
	}
	
	public void listaProdutosResumidos() {
		this.produtos.forEach(produto -> {
			if(produto instanceof Livro) {
				System.out.println(((Livro)produto).toStringResumido());
			}
			else if(produto instanceof Revista) {
				System.out.println(((Revista)produto).toStringResumido());
			} else {
				System.out.println(((Jornal)produto).toStringResumido());
			}
			System.out.println();
		});
	}
	
	public void listaProdutos() {
		this.produtos.forEach(produto ->{
			System.out.println(produto.toString());
			System.out.println();
		});
	}
	
	public void vendaProduto(Integer codProduto, Pessoa comprador, ModalidadeVendaEnum modalidadeVenda) {
		for (int i = 0; i < this.produtos.size(); i++) {
			if(produtos.get(i).getCodigo() == codProduto) {
				Double precoProduto = 0.0;
				switch (modalidadeVenda) {
					case Estudante:
						precoProduto = produtos.get(i).getPrecoVenda()*0.5;
						break;
					case Demais:
						precoProduto = produtos.get(i).getPrecoVenda();
						break;
				}
				if(comprador.getSaldo() < precoProduto) {
					System.out.println("Saldo insuficiente para a compra.");
					break;
				}
				comprador.setSaldo(comprador.getSaldo() - precoProduto);
				produtos.get(i).setQuantidade(produtos.get(i).getQuantidade() - 1);
			}
		}
	}
}
