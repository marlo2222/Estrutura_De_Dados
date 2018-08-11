package aula1;

public class Vetor {
	private Aluno[] alunos;
	private int contador;

	public Vetor() {
		this.alunos = new Aluno[100];
		this.contador = 0;
	}

	public void adFim(Aluno aluno) {
		if (contador < alunos.length) {
			this.alunos[contador++] = aluno;
		} else {
			System.out.println("esta cheio!!!");
		}
	}

	public void adInicio(Aluno aluno) {
		if (contador < alunos.length) {
			for (int i = contador; i > 0; i--) {
				alunos[i] = alunos[i - 1];
			}
			this.alunos[contador++] = aluno;
		} else {
			System.out.println("esta cheio!!!");
		}

	}

	public void adMeio(int posicao, Aluno aluno) {
		if (contador < alunos.length) {
			for (int i = contador; i > posicao; i--) {
				alunos[i] = alunos[i - 1];
			}
			this.alunos[contador++] = aluno;
		} else {
			System.out.println("esta cheio!!!");
		}
	}

	public String toString() {
		String fila = "";
		for(int i = 0; i < this.contador; i++) {
			fila += " "+this.alunos[i];
		}
		return fila;
	}

	public void remover(int posicao) {
		if ((posicao >= 0 && posicao < this.contador)) {
			for (int i = posicao; i < this.contador - 1; i++) {
				this.alunos[i] = this.alunos[i + 1];
			}
			this.contador--;
		}
	}

	public boolean buscar(Aluno nome) {
		for (int i = 0; i < contador; i++) {
			if (alunos[i].equals(nome))
				return true;
		}
		return false;
	}

	public void alterar( Aluno aluno,int posicao) {
		if ((posicao >= 0 && posicao < this.contador)) {
			this.alunos[posicao] = aluno;
		}else {
			System.out.println("posicao invalida");
		}
	}
}
