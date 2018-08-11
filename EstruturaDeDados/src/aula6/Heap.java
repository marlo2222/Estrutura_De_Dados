package aula6;

public class Heap {
	public int[] heap;
	private int cont;
	
	public Heap(int tamanho) {
		this.heap = new int[tamanho];
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

	private void heapUp(int v) {// v é uma posicao.
		if (v == 1)
			return;

		int p = pai(v);
		System.out.println(p);
		if (heap[v] > heap[p]) {
			int aux = heap[v];
			heap[v] = heap[p];
			heap[p] = aux;
			heapUp(p);
		}
	}
	private void heapDown(int v) {//v é uma posicao
		int d = direito(v);
		int e = esquerdo(v);
		int maior = v;
		
		if(d <= cont && heap[d] > heap[v])
			maior = d;
		if(e <= cont && heap[e] > heap[maior])
			maior = e;
		
		if(maior != v) {
			int aux = heap[v];
			heap[v] = heap[maior];
			heap[maior] = aux;
			heapDown(maior);
		}
		
	}
	public void add(int valor) {
		cont++;
		heap[cont] = valor;
		heapUp(cont);
	}
	public void remove(int posicao) {
		if(posicao > 0 || posicao <= cont) {
		int aux = heap[posicao];
		heap[posicao] = heap[cont];
		heap[cont]=aux;
		cont--;
		heapDown(posicao);
		}else {
			System.out.println("posicao invalida!!");
		}
		
	}
	
	public void imprimir() {
		for(int i = 1; i <= cont; i++)
			System.out.print("["+"("+i+")"+heap[i]+"]");
	}
}
