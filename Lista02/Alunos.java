package lista02;
import java.util.Scanner;

public class Alunos {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double feminino, masculino, total, pfeminino, pmasculino;
		//leia(feminino)
		System.out.println("digite o n�mero de meninas:");
		feminino = ler.nextDouble();
		//Leia(masculino)
		System.out.println("digite o n�mero de meninos:");
		masculino = ler.nextDouble();
		//Calcule(total)
		total = (feminino+masculino);
		//Calcule(pfeminino)
		pfeminino = (feminino*100/total);
		//Calcule(pmasculino)
		pmasculino = (masculino*100/total);
		//Apresente(pfeminino, pmasculino)
		System.out.println("A porcentagem feminina �:" + pfeminino);
		System.out.println("A porcentagem masculina �:" + pmasculino);
		ler.close();
	}


}
