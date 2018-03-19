package run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import protocols.DispensaDisciplina;
import protocols.Transferencia;
import protocols.Enum.Tipo;
import protocols.Enum.cursoDestino;

public class main {

	public static void main(String[] args) {

		boolean parar = false;
		Scanner in = new Scanner(System.in);

		List<Transferencia> transferencias = new ArrayList<Transferencia>();
		List<DispensaDisciplina> dispensas = new ArrayList<DispensaDisciplina>();

		while (!parar) {
			int opt = 0;

			opt = in.nextInt();

			switch (opt) {
			case 1:
				System.out.println("Dispensa de disciplinas");
				String[] discip = { "a", "b", "c" };
				DispensaDisciplina disciplina = new DispensaDisciplina("George", "08123", "Computacao", "R.A", "9999",
						"a@c.c.b", discip, 1233, "dispensar");

				dispensas.add(disciplina);
				break;
			case 2:
				System.out.println("Transferencia");
				Transferencia trans = new Transferencia("Boyd", "1231", "Eletronica", "R.A", "0000", "1@2.3",
						Tipo.ExternaGuia, cursoDestino.Computacao, "Imaculado", "ens. Medio");

				transferencias.add(trans);
				break;
			case 3:
				System.out.println("Disciplina isolada");

				break;
			case 4:
				System.out.println("Atividade complementar");

				break;
			case 5:
				System.out.println("Algum outro protocolo");
			case 7:
				System.out.println("Pagina anterior");
				break;
			case 8:
				System.out.println("Proxima pagina");

				break;
			case 9:
				System.out.println("Imprimindo todos");

				for (DispensaDisciplina d : dispensas) {
					d.mostraTudo();
				}

				for (Transferencia t : transferencias) {
					t.mostraTudo();
				}
				break;
			case 0:
				System.out.println("Sair");
				parar = true;
				break;
			default:
				System.out.println("Opcao invalida!");
			}
			in.close();
		}

	}
	
	public void imprimeMenu() {
		if
		System.out.println("Bem vindo ao cadastro de protocolos!");
		System.out.println("1\t-\tDispensa de disciplinas");
		System.out.println("2\t-\tTransferencia");
		System.out.println("3\t-\tDisciplina isolada");
		System.out.println("4\t-\tAtividade complementar");
		System.out.println("9\t-\tImprime todos");
		System.out.println("0\t-\tSair");
		System.out.print("Opcao: ");
	}
}
