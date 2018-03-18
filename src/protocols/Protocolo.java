package protocols;

import java.util.Random;

public abstract class Protocolo {
	private long numero;
	private String curso;
	private String nomeDoAluno;
	private String endereco;
	private String email;
	private String telefone;
	private String cpf;
		
	public Protocolo(String curso, String nome, String endereco, String email, String telefone, String cpf) {
		this.numero = new Random().nextInt(10000);
		this.curso = curso;
		this.nomeDoAluno = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
	}

	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getNomeDoAluno() {
		return nomeDoAluno;
	}
	public void setNomeDoAluno(String nomeDoAluno) {
		this.nomeDoAluno = nomeDoAluno;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void mostraBase() {
		System.out.println("Sumário do protocolo");
		System.out.println("Numero do protocolo: "+this.getNumero());
		System.out.println("Nome: "+this.getNomeDoAluno());
		System.out.println("CPF: "+this.getCpf());
		System.out.println("Curso: "+this.getCurso());
		System.out.println("========================================");
		
	}
}
