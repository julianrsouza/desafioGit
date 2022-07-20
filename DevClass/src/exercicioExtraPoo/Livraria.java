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
				produtos.set(i, produtoAlteracao);
			}
		}
	}
	
	public void listaProdutosResumidos() {
		this.produtos.forEach(produto -> {
			if(produto instanceof Livro) {
				((Livro)produto).toStringResumido();
			}
			else if(produto instanceof Revista) {
				((Revista)produto).toStringResumido();
			} else {
				((Jornal)produto).toStringResumido();
			}
		});
	}
	
	public void listaProdutos() {
		this.produtos.forEach(produto ->{
			produto.toString();
		});
	}
	
	public void vendaProduto(Integer codProduto, ModalidadeVendaEnum modalidadeVenda) {
		for (int i = 0; i < this.produtos.size(); i++) {
			if(produtos.get(i).getCodigo() == codProduto) {
				Float precoProduto;
				switch (modalidadeVenda) {
					case Estudante:
						precoProduto = produtos.get(i).getPrecoVenda()*0.5f;
						produtos.remove(i);
						break;
					case Demais:
						precoProduto = produtos.get(i).getPrecoVenda();
						produtos.remove(i);
						break;
				}
			}
		}
	}
}
