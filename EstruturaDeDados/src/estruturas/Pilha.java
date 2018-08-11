package estruturas;

public class Pilha<T> extends EstruturaEstatica<T> {

	public Pilha(int capacidade) {
		super(capacidade);
	}

	public void empilha(T elemento) {
		this.aumentacapacidade();
		this.elementos[tamanho++] = elemento;
	}

	public T topo() {
		if (this.estaVazio()) {
			return null;
		}
		return this.elementos[tamanho - 1];
	}

	public T desempilha() {
		if (this.estaVazio()) {
			return null;
		}
		return this.elementos[--tamanho];

	}
}
