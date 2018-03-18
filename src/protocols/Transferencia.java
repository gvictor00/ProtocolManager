package protocols;

import protocols.Enum.Tipo;
import protocols.Enum.cursoDestino;

public class Transferencia extends Protocolo {
	private Tipo tipo;
	private cursoDestino cursoDestino;
	private String instituicaoDeOrigem;
	private String cursoOrigem;
	
	public Transferencia(String nome, String cpf, String curso, String endereco, String telefone, String email, 
			Tipo tipo, cursoDestino cursoDestino, String instituicaoDeOrigem, String cursoOrigem) {
		
		super(curso, nome, endereco, email, telefone, cpf);
		
		this.tipo = tipo;
		this.cursoDestino = cursoDestino;
		this.instituicaoDeOrigem = instituicaoDeOrigem;
		this.cursoOrigem = cursoOrigem;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public cursoDestino getCursoDestino() {
		return cursoDestino;
	}
	public void setCursoDestino(cursoDestino cursoDestino) {
		this.cursoDestino = cursoDestino;
	}
	public String getInstituicaoDeOrigem() {
		return instituicaoDeOrigem;
	}
	public void setInstituicaoDeOrigem(String instituicaoDeOrigem) {
		this.instituicaoDeOrigem = instituicaoDeOrigem;
	}
	public String getCursoOrigem() {
		return cursoOrigem;
	}
	public void setCursoOrigem(String cursoOrigem) {
		this.cursoOrigem = cursoOrigem;
	}
	public void mostraTudo()
	{
		super.mostraBase();
		System.out.println("Tipo: "+getTipo());
		System.out.println("Curso Origem: "+getCursoOrigem());
		System.out.println("IES Origem: "+getInstituicaoDeOrigem());
		System.out.println("Curso Destino: "+getCursoDestino());
	}
	
	
}
