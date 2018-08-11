package aula4;

public class ListaDupla {
	private No inicio, fim;
	private int cont;

	public void addInicio(int valor) {
		No novo = new No(valor);
		if (cont == 0) {
			fim = novo;
			inicio = novo;
		} else {
			novo.prox = inicio;
			inicio.ant = novo;
			inicio = novo;
		}
		cont++;
	}

	public void addFim(int valor) {
		No novo = new No(valor);
		if (cont == 0) {
			fim = novo;
			inicio = novo;
		} else {
			fim.prox = novo;
			novo.ant = fim;
			fim = novo;
		}
		cont++;
	}

	public void add(int posicao, int valor) {
		if (posicao == 0) {
			this.addFim(valor);
		} else if (posicao == this.cont) {
			this.addFim(valor);
		} else {
			No aux = inicio;
			for (int i = 0; i < posicao-1; i++)
				aux = aux.prox;
			No novo = new No(valor);
			novo.prox = aux.prox;
			aux.prox.ant = novo;
			novo.ant = aux;
			aux.prox = novo;
			cont++;
		}
	}

	public void removerInicio() {
		inicio = inicio.prox;
		inicio.ant = null;
		cont--;
	}

	public void removerFim() {
		fim = fim.ant;
		fim.prox = null;
		cont--;
	}

	public void remover(int posicao) {
		if(posicao == 0) {
			this.removerInicio();
		}
		if(posicao == cont) {
			this.removerFim();
		}else {
			No aux = inicio;
			for (int i = 0; i < posicao-1; i++)
				aux = aux.prox;
			aux.prox.ant = aux.ant;
			aux.ant.prox = aux.prox;
			cont--;
		}

	}
	public void imprimir() {
		String nume = ""; 
	
		for(No aux = inicio; aux != null; aux = aux.prox)
				nume += "-> "+"["+aux.valor+"] ";
		System.out.println(nume);
	}
	}
