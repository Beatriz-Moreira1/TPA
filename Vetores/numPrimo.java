package exVetor;
import java.util.Scanner;

public class numPrimo {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int numDivisores = 0, a[];
		
		a = new int [10];
		
		for (int j = 0; j<10; j++) {
			System.out.println("Digite um número para obter sua tabuada: ");
			a[j] = ler.nextInt();
			
			for (int i = 0; i<10; i++) {
				while ( i <= a[i]) {
					if (a[i] % i ==  0) {
						numDivisores ++;
					}
				}
				
				if (numDivisores == 2) {
					System.out.println("É um número primo");
				} else {
					System.out.println("Não é um número primo");
				}
			}
		}
		
		ler.close();
	}

}
