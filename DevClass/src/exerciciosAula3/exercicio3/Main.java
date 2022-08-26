package exerciciosAula3.exercicio3;


public class Main {

	public static void main(String[] args) {
		Concessionaria comauto = new Concessionaria();
		CompradorVeiculo julian = new CompradorVeiculo("Julian", 200000.0);
		CompradorVeiculo artur = new CompradorVeiculo("Artur", 100000.0);

		comauto.incluiVeiculo(new Moto(2, 150.0f, "Vermelho", "Hyundai", "H150", 2020, 12000.0, TipoVeiculoEnum.NOVO, 150, 10));
		comauto.incluiVeiculo(new Moto(2, 220.0f, "Branco", "Mitsubishi", "CB600", 2018, 15000.0, TipoVeiculoEnum.SEMINOVO, 600, 10));
		comauto.incluiVeiculo(new Carro(4, 800.0f, "Amarelo", "Fiat", "Uno", 2005, 35000.0, TipoVeiculoEnum.SEMINOVO,5));
		comauto.incluiVeiculo(new Carro(4, 1200.0f, "Prata", "Volkswagen", "UP", 2022, 80000.0, TipoVeiculoEnum.NOVO,5));
		comauto.incluiVeiculo(new Caminhao(12, 10000.0f, "Azul", "Mercedes", "B12", 2000, 100000.0, TipoVeiculoEnum.SEMINOVO, TipoCarroceriaEnum.BAU, 2));
		comauto.incluiVeiculo(new Caminhao(14, 12000.0f, "Verde", "Mercedes", "B14", 2005, 120000.0, TipoVeiculoEnum.SEMINOVO, TipoCarroceriaEnum.BAU_FRIGORIFICO, 2));
		comauto.incluiVeiculo(new Caminhao(12, 10000.0f, "Rosa", "Mercedes", "B12B", 2020, 300000.0, TipoVeiculoEnum.NOVO, TipoCarroceriaEnum.PLATAFORMA, 2));

	    comauto.mostraCarrosPorTipo("novos");
	    System.out.println();
 	    comauto.mostraCarrosPorTipo("seminovos");
	    System.out.println();
		comauto.mostraCarrosPorTipo("ambos");
		System.out.println();
		comauto.mostraMotosPorCilindrada(150);
		System.out.println();
		comauto.mostraMotosPorCilindrada(600);
		System.out.println();
		comauto.mostraCaminhoesPorTipoCarroceria(TipoCarroceriaEnum.PLATAFORMA);
		System.out.println();
		comauto.mostraCaminhoesPorTipoCarroceria(TipoCarroceriaEnum.BAU);
		System.out.println();
		comauto.mostraCaminhoesPorTipoCarroceria(TipoCarroceriaEnum.BAU_FRIGORIFICO);
		System.out.println();
		System.out.println(julian.getSaldo());
		comauto.vendaVeiculo(5, julian, ModalidadeVendaVeiculoEnum.DEMAIS);
		System.out.println(julian.getSaldo());
		System.out.println();
		comauto.mostraVeiculosPorId(5);
		System.out.println();
		System.out.println(artur.getSaldo());
		comauto.vendaVeiculo(2, artur, ModalidadeVendaVeiculoEnum.AGRICULTOR);
		System.out.println(artur.getSaldo());
		comauto.mostraVeiculosPorId(2);
	}

}
