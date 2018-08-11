package aula3;

public class MainTeste {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		

		lista.addInicio(10);
		lista.addInicio(30);
		lista.addInicio(40);
		lista.addInicio(88);
		lista.addFinal(1);
		lista.addMeio(2, 7);
		lista.addMeio(1, 99);
		lista.emprime();
	}

}
