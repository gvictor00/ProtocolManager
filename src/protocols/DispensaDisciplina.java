package protocols;

public class DispensaDisciplina extends Protocolo{
	private String[] disciplinas;
	private double valorPago;
	private String descricao;

	// Bloco de cadastro completo
	public DispensaDisciplina(String nome, String cpf, String curso, String endereco, String telefone, String email, 
			String[] disciplinas, double valorPago, String descricao) {
		
		super(curso, nome, endereco, email, telefone, cpf);
		
		this.setDisciplinas(disciplinas);
		this.setValorPago(valorPago);
		this.setDescricao(descricao);
	}
	
	public String[] getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}
	public double getValorPago() {
		return valorPago;
	}
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void mostraTudo() {
		super.mostraBase();
		System.out.println("Descricao: "+getDescricao());
		System.out.println("Disciplinas: "+getDisciplinas());
	}
}
