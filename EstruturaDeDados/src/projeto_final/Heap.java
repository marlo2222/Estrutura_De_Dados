package projeto_final;
public class Heap {
	public Documento[] heap;
	private int cont;

	public Heap(int tamanho) {
		this.heap = new Documento[tamanho];
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	private int pai(int i) {
		return i / 2;
	}

	private int direito(int i) {
		return i * 2 + 1;
	}

	private int esquerdo(int i) {
		return i * 2;
	}

	private void heapUp(int v) {
		if (v == 1)
			return;

		int p = pai(v);
		if (heap[v].getPrioridade() > heap[p].getPrioridade()) {
			Documento aux = heap[v];
			heap[v] = heap[p];
			heap[p] = aux;
			heapUp(p);
		}
	}

	private void heapDown(int v) {
		int d = direito(v);
		int e = esquerdo(v);
		int maior = v;

		if (d <= cont && heap[d].getPrioridade() > heap[v].getPrioridade())
			maior = d;
		if (e <= cont && heap[e].getPrioridade() > heap[maior].getPrioridade())
			maior = e;

		if (maior != v) {
			Documento aux = heap[v];
			heap[v] = heap[maior];
			heap[maior] = aux;
			heapDown(maior);
		}

	}

	public void add(Documento documento) {
		cont++;
		heap[cont] = documento;
		heapUp(cont);
	}

	public Documento remove() {
		Documento documento = null;
		documento = heap[1];
		heap[1] = heap[cont];
		heap[cont] = documento;
		cont--;
		heapDown(1);
		return documento;
	}

	public void imprimir() {
		for (int i = 1; i <= cont; i++)
			System.out.print("[" + "(" + i + ")" + heap[i].getPrioridade() + "] ");
	}
}
