package estruturas;

public class EstruturaEstatica<T> {
	protected T[] elementos;
	protected int tamanho;

	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	public EstruturaEstatica() {
		this(10);
	}

	public boolean adiciona(T elemento) {
		if (tamanho < elementos.length) {
			this.elementos[tamanho] = elemento;
			tamanho++;
			return true;
		}
		this.aumentacapacidade();
		return false;

	}
	public boolean estaVazio() {
		return this.tamanho == 0;
	}
	public boolean adiciona(int posicao, T elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			return false;
		}
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		this.aumentacapacidade();
		return false;
	}

	public void aumentacapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public int tamanho() {
		return this.tamanho;
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i < this.tamanho; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}
		s.append("]");
		return s.toString();
	}
	public boolean remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			return false;
		}
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
		return true;
	}
}
