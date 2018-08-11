package projeto_final;


public class ListaEncadeada {
	public No inicio;
	public No fim;
	public int contador;

	public void adicionar(Documento doc) {
		No novo = new No(doc);
		if (contador == 0) {
			fim = inicio = novo;
		} else {
			fim.prox = novo;
			novo.ant = fim;
			fim = novo;
		}
		contador++;
	}

	public Documento removes(){
		Documento documento = null;
		if(contador > 1) {
			documento = inicio.documento;
			inicio = inicio.prox;
			inicio.ant = null;
			contador--;
		}else if(contador == 1) {
			documento = inicio.documento;
			inicio = fim = null;
			contador--;
		}else {
			System.out.println("Nenhum documento cadastrado");
		}
		return documento;
	}

	public void visualizar() {
	for(No aux = inicio; aux != null; aux = aux.prox) {
		System.out.println(aux.documento.getCodigoId()); 
				System.out.println(aux.documento.getAluno().getNome());
	}

	}

	
}