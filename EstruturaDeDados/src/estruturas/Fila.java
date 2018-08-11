package estruturas;

public class Fila<T> extends EstruturaEstatica<T> {
	
	
	public Fila() {
		super();
	}
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void emfileira(T elemento) {
		this.adiciona(elemento);
	}
	
	public T espiar() {
		if(this.estaVazio()) {
			return null;
		}
		return this.elementos[0];
	}
	public T desinfileira() {
		final int pos = 0;
		if(this.estaVazio()) {
			return null;
		}
		T elementoParaRemover = this.elementos[pos];
		this.remove(pos);
		return elementoParaRemover;
	}
}
