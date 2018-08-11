package projeto_final;

public class Hash {
	private ListaEcHash[] hash = new ListaEcHash[11];

	private int h(int chave) {
		int a, b, c;
		a = chave / 100;
		b = chave % 100;
		a = a * a;
		b = b * b;
		c = a + b;
		c = c % hash.length;
		return c;
	}

	public void adicionar(Usuario usuario) {
		int indice = h(usuario.getCpf());
		
		if (hash[indice] == null)
			hash[indice] = new ListaEcHash();
		hash[indice].adicionar(usuario);

	}

	public Usuario buscar(int cpf, int senha, String usuario) {
		int indice = h(cpf);
		if (hash[indice] != null) {
			for (NoHash aux = hash[indice].inicio; aux != null; aux = aux.prox) {
				if (aux.usuario.getSenha() == senha && aux.usuario.getCredencial().equals(usuario))
					return aux.usuario;
			}
		}
		return null;
	}

}
