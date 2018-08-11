package projeto_final;

public class Usuario {
	private String nome;
	private int cpf;
	private int senha;
	private String credencial;
	
	public Usuario(String nome, int cpf, int senha, String credencial){
		this.setNome(nome);
		this.setCpf(cpf);
		this.setSenha(senha);
		this.setCredencial(credencial);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public String getCredencial() {
		return credencial;
	}
	public void setCredencial(String credencial) {
		this.credencial = credencial;
	}
	
	

}
