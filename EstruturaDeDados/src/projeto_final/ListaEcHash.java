package projeto_final;

public class ListaEcHash {
	public NoHash inicio;
	public NoHash fim;
	public int contador;

	public void adicionar(Usuario usuario) {
		NoHash novo = new NoHash(usuario);
		if (contador == 0) {
			fim = inicio = novo;
		} else {
			fim.prox = novo;
			novo.ant = fim;
			fim = novo;
		}
		contador++;
	}
}
