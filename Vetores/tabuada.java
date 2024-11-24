package exVetor;
import java.util.Scanner;

public class tabuada {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int a[], result;
		
		a = new int [5];
		
		for (int j = 0; j<5; j++) {
			System.out.println("Digite um número para obter sua tabuada: ");
			a[j] = ler.nextInt();
			
			for (int i = 0; i<=10; i++) {
				result = i*a[j];
				System.out.println(a[j] + "x" + i + "=" + result);
				
			}
			

			
		}
		
		ler.close();
		
	}

}
