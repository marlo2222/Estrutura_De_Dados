package projeto_final;

public class Aluno {
	private String nome;
	private Univercidade campus;

	public Aluno(){
		this.campus = new Univercidade();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome!= null)this.nome = nome;
	}

	public Univercidade getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus.setNome(campus);
	}

	
}
