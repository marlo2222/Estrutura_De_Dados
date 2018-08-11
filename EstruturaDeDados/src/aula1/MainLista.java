package aula1;
import java.util.Scanner;

public class MainLista {

	public static void main(String[] args) {
		Vetor lita = new Vetor();
		Scanner ler = new Scanner(System.in);
		char menu;
		do {
			System.out.println("1 - adicionar fim \n 2- adicionar inicio \n 3- adicionar meio");
			System.out.println("4 - imprimir \n 5- remover \n 6- buscar \n 7-alterar 8-sair");
			menu = ler.nextLine().charAt(0);
			switch (menu) {
			case '1':
				lita.adFim(new Aluno(ler.nextLine()));
				break;
			case '2':
				lita.adInicio(new Aluno(ler.nextLine()));
				break;
			case '3':
				lita.adMeio(ler.nextInt(),new Aluno(ler.nextLine()));
				break;
			case '4':
				System.out.println(lita.toString());
				break;
			case '5':
				lita.remover(ler.nextInt());
				break;
			case '6':
				lita.buscar(new Aluno(ler.nextLine()));
				break;
			case '7':
				lita.alterar(new Aluno(ler.nextLine()),ler.nextInt());
				break;
			case '8':
				break;
			default:
				System.out.println("opção invalida!!");
				break;

			}

		} while (menu != '8');

	}

}
