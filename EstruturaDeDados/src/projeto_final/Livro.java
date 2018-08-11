package projeto_final;

public class Livro {
	private String nome;
	private String autor;
	private String volumeDoLivro;
	private Univercidade campuLivro;

	public Livro() {
		this.campuLivro = new Univercidade();
	}

	public Univercidade getCampuLivro() {
		return campuLivro;
	}

	public void setCampuLivro(String campus) {
		this.campuLivro.setNome(campus);
		;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getVolumeDoLivro() {
		return volumeDoLivro;
	}

	public void setVolumeDoLivro(String volumeDoLivro) {
		this.volumeDoLivro = volumeDoLivro;
	}


}
