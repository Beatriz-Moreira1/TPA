import java.util.Scanner;
public class Meses {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int n;
	System.out.println("Digite o n�mero correspondente ao m�s escolhido:");
	n = ler.nextInt();
	switch(n) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Seu m�s tem 31 dias");
				break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Seu m�s tem 30 dias");
				break;
		case 2:
			System.out.println("Seu m�s tem 28 dias");
				break;
		default:
			System.out.println("M�s inv�lido!!");
	}
	ler.close();
}
}
