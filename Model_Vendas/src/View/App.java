package View;

import java.time.LocalDate;
import java.util.Scanner;

import Controlador.EspecificacaoProdutoController;
import Controlador.ItemVendaController;
import Controlador.VendaController;
import Dominio.EspecificacaoProduto;

public class App {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Informe a quantidade de produtos : ");
		int qtd = ler.nextInt();
		ler.nextLine();
		
		EspecificacaoProdutoController epc = new EspecificacaoProdutoController();
		ItemVendaController ivc = new ItemVendaController();
		VendaController vc = new VendaController();
		
		for (int i = 0; i < qtd; i++)
		{
			System.out.printf("Informe a descrição do produto " + (i + 1) + " : ");
			String prodDescricao = ler.nextLine();
			
			System.out.printf("Informe o valor do produto " + (i + 1) + " : ");
			double valorProd = ler.nextDouble();
			ler.nextLine();
			
			System.out.printf("Informe a quantidade vendida : ");
			int qtdVendido = ler.nextInt();
			ler.nextLine();
			
			epc.CriarEspecificacaoProduto(prodDescricao, valorProd);
			ivc.CriarItemVenda(qtdVendido, epc.RetornarEspecificacaoProduto(i));
		}
		
		LocalDate dataAtual = LocalDate.now();
		
		vc.CriarVenda(dataAtual, ivc.GetItensVendas());
		
		System.out.printf("Imprimindo nota...........\n");
		System.out.printf("Item      Descricao     Valor Unitário   Quantidade     ValorTotal\n");
		System.out.printf("-------------------------------------------------------------------\n");
		for (int j = 0; j < qtd ; j++ ) {
			String nomeProd = epc.ReceberDescricaoProduto(j);
			double precoProd = epc.ReceberValorProduto(j);
			double subTotalProd = ivc.SubTotalVendido(j);
			System.out.printf((j+1) + "          " + nomeProd + "           " + precoProd + "              " + ivc.QtdVendidos(j) + "              " + subTotalProd + "\n");
		}
		System.out.printf("-------------------------------------------------------------------");
		System.out.printf("\nValor total R$ : " + vc.retornarTotal());
	}

}
