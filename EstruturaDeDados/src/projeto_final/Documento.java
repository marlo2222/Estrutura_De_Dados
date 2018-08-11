package projeto_final;

public class Documento {
	private int codigoId;
	private int prioridade;
	private String responsavel;
	public Aluno aluno;
	private Livro livro;

	public Documento(int codigoId) {
		this.codigoId = codigoId;
		this.aluno = new Aluno();
		this.livro = new Livro();
	}
	
	public Documento() {
		
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public int getCodigoId() {
		return codigoId;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	public void conteudoDocumento() {
		System.out.println("<>------Documento-------<>");
		System.out.println("<>-Codigo identificador:" +codigoId);
		System.out.println("<>-Prioridade: " +prioridade);
		System.out.println("<>-Nome do aluno: " +aluno.getNome());
		System.out.println("<>-Campus do aluno: "+aluno.getCampus());
		System.out.println("<>-Campos atual do livro: "+livro.getCampuLivro());
		System.out.println("<>-Responsavel encomenda: " +responsavel);
		System.out.println("<>-Nome livro: "+livro.getNome());
		System.out.println("<>-Autor: "+livro.getAutor());
		System.out.println("<>-Volume: "+livro.getVolumeDoLivro());
		
	}


}
