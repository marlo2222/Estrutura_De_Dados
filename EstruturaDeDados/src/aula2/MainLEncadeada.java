package aula2;

import java.util.Scanner;

public class MainLEncadeada {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		Scanner ler = new Scanner(System.in);
		Scanner lerNum = new Scanner(System.in);
		char op = 0;
		do {
			System.out.println("1- addInicio");
			System.out.println("2 - addFim");
			System.out.println("3 - addMeio");
			System.out.println("4 - apagar");
			System.out.println("5 -sair");
			op = ler.nextLine().charAt(0);
			switch (op) {
			case '1':
				lista.addInicio(lerNum.nextInt());
				lista.emprime();
				break;
			case '2':
				lista.addFim(lerNum.nextInt());
				lista.emprime();
				break;
			case '3':
				lista.addAli(lerNum.nextInt(),lerNum.nextInt());
				lista.emprime();
				break;
			case '4':
				lista.remover(lerNum.nextInt());
				lista.emprime();
				break;

			default:
				break;
			}
		} while (op != '5');

	}

}
