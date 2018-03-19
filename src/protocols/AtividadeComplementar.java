package protocols;

public class AtividadeComplementar {
	int cargaHoraria;
	String descricao;
	
	public AtividadeComplementar(int cargaHoraria, String descricao) {
		super();
		this.cargaHoraria = cargaHoraria;
		this.descricao = descricao;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
}
