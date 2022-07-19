package exerciciosPoo.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		List<Imovel> listaImoveis = new ArrayList<>();
		listaImoveis.add(new Imovel(42.2,60000.00));
		listaImoveis.add(new Casa(78.0, 150000.0, 6, 110.0));
		listaImoveis.add(new Terreno(65.0,60000.0));
		listaImoveis.add(new Apartamento(56.0, 100000.0, 5, true));
		listaImoveis.add(new Apartamento(50.0, 85000.0, 4, false));
		
		//Feito para pratica
		Optional.ofNullable(listaImoveis).ifPresent(list -> list.forEach(imovel -> {
			System.out.println(imovel);
			System.out.println();
		}));
	}
}
