package run;

import protocols.DispensaDisciplina;
import protocols.Transferencia;
import protocols.Enum.Tipo;
import protocols.Enum.cursoDestino;

public class main {

	public static void main(String[] args) {
		
		String[] discip = {"a","b","c"};
		DispensaDisciplina disciplina = new DispensaDisciplina("George", "08123", "Computacao", "R.A", "9999", "a@c.c.b",discip,1233,"dispensar");
		disciplina.mostraTudo();
		
		Transferencia trans = new Transferencia("Boyd","1231", "Eletronica", "R.A", "0000", "1@2.3", Tipo.ExternaGuia, cursoDestino.Computacao, "Imaculado", "ens. Medio");
		trans.mostraTudo();

	}
}
