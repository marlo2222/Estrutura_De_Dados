package aula2;

public class ListaEncadeada {
	private No inicio;
	private No fim;
	private int contador;

	public ListaEncadeada() {
		this.contador = 0;
	}

	public void addInicio(int valor) {
		No novo = new No(valor);
		if (contador == 0) {
			inicio = novo;
			fim = novo;
		} else {
			novo.prox = inicio;
			inicio = novo;
		}
		this.contador++;
	}

	public void addFim(int valor) {
		No novo = new No(valor);

		if (contador == 0) {
			inicio = novo;
			fim = novo;
		} else {
			fim.prox = novo;
			fim = novo;
		}
		this.contador++;
	}

	public void addAli(int posicao, int valor) {
		contador++;
		No novo = new No(valor);
		if (posicao <= 1) {
			this.addInicio(valor);
			return;
		} else if (posicao > contador) {
			this.addFim(valor);
			return;
		}
		No noAux = inicio.prox;
		for (int i = 0; i < posicao; i++)
			novo.prox = (noAux.prox);
		noAux.prox = novo;
		noAux = noAux.prox;

	}

	public void remover(int valor) {
		No noAux = inicio;
		No noAnt = null;

		if (noAux.valor == valor) {
			inicio = inicio.prox;
			this.contador--;
		} else {
			while (noAnt != null && !(noAnt.valor == valor)) {
				noAnt = noAux;
				noAux = noAux.prox;
			}
			if (noAux != null) {
				noAnt.prox = noAux.prox;
				this.contador--;
			}
			if (noAux == fim) {
				fim = noAnt;
			}
		}
	}

	public void emprime() {
		String listinha = "";
		for (No aux = this.inicio; aux != null; aux = aux.prox) {
			listinha += " -> " + "[" + aux.valor + "]";
		}
		System.out.println(listinha);
	}
}
