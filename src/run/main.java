package run;

import java.util.Scanner;

import protocols.DispensaDisciplina;
import protocols.Transferencia;
import protocols.Enum.Tipo;
import protocols.Enum.cursoDestino;

public class main {

	public static void main(String[] args) {
		
		boolean parar = false;
		Scanner in = new Scanner(System.in);
		
		while(!parar)
		{
			int opt = 0;
			System.out.println("Bem vindo ao cadastro de protocolos!");
			System.out.println("1\t-\tDispensa de disciplinas");
			System.out.println("2\t-\tTransferencia");
			System.out.println("0\t-\tSair");
			System.out.print("Opcao: ");
			
			opt = in.nextInt();
			
			switch(opt) {
				case 1:
					System.out.println("Dispensa de disciplinas");
					break;
				case 2:
					System.out.println("Transferencia");
					break;
				case 0:
					System.out.println("Sair");
					parar = true;
					break;
				default:
					System.out.println("Opcao invalida!");			
			}
			
			String[] discip = {"a","b","c"};
			DispensaDisciplina disciplina = new DispensaDisciplina("George", "08123", "Computacao", "R.A", "9999", "a@c.c.b",discip,1233,"dispensar");
			disciplina.mostraTudo();
			
			Transferencia trans = new Transferencia("Boyd","1231", "Eletronica", "R.A", "0000", "1@2.3", Tipo.ExternaGuia, cursoDestino.Computacao, "Imaculado", "ens. Medio");
			trans.mostraTudo();
			
			in.close();
		}

	}
}
