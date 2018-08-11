package aula4;

import java.util.Scanner;

import aula2.ListaEncadeada;

public class Mainnnnn {

	public static void main(String[] args) {
		ListaDupla lista = new ListaDupla();
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
				lista.imprimir();
				break;
			case '2':
				lista.addFim(lerNum.nextInt());
				lista.imprimir();
				break;
			case '3':
				lista.add(lerNum.nextInt(),lerNum.nextInt());
				lista.imprimir();
				break;
			case '4':
				lista.remover(lerNum.nextInt());
				lista.imprimir();
				break;

			default:
				break;
			}
		} while (op != '5');

	}

}

	


