import java.util.Scanner;
public class NumerosPrimos {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num, i = 1, numDivisores = 0;
		
		System.out.println("Digite o n�mero");
		num = ler.nextInt();
		
		while ( i <= num) {
			if (num % i ==  0) {
				numDivisores ++;
			}
		}
		
		if (numDivisores == 2) {
			System.out.println("� um n�mero primo");
		} else {
			System.out.println("N�o �um n�mero primo");
		}
		ler.close();
	}

}
