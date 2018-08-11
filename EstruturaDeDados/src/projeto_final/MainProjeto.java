package projeto_final;
import java.util.Scanner;

public class MainProjeto {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner inputS = new Scanner(System.in);
		Control control = new Control();
		int opcao;

		do {
			control.limpar();
			System.out.println("1 - cadastro inicial");
			System.out.println("2 - remover ");
			System.out.println("3 - transportar");
			System.out.println("4 - extra");
			System.out.println("5 - sair");
			opcao = input.nextInt();
			switch (opcao) {
			case 1:
				control.documentacaoInicial();
				break;
				
			case 2:
				control.autenticarSecretario();
				break;
			case 3:
				control.autenticarTransportador();
				break;
			case 4:
				System.out.println("estado da heap: ");
				control.getHeap().imprimir();
				System.out.println("\n precione enter para continuar");
				inputS.nextLine();
				
				break;
			default:
				System.out.println("opção invalida");
				break;
			}
		} while (opcao != 5);

	}

}