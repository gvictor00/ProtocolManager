package protocols;

public class DisciplinaIsolada extends Protocolo{
	String disciplina;
	String IES;
	int cargaHoraria;
	
	public DisciplinaIsolada(String curso, String nome, String endereco, String email, String telefone, String cpf,
			String disciplina, String iES, int cargaHoraria) {
		super(curso, nome, endereco, email, telefone, cpf);
		this.disciplina = disciplina;
		this.IES = iES;
		this.cargaHoraria = cargaHoraria;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getIES() {
		return IES;
	}

	public void setIES(String iES) {
		IES = iES;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}	
}
