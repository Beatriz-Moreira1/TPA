package exVetor;
import java.util.Scanner;

public class numPares {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int a[];
		
		a = new int [10];
		
		System.out.println("Digite os 10 elementos: ");
		
		for (int i = 0; i<10; i++) {
			
			a[i] = ler.nextInt();
			
		}
		
		for (int i = 0; i<10; i++) {
			System.out.println("elemento a[ " + i + "] = " + a[i]);
			System.out.println("Os pares são: ");
			
			for (int j = 0; j<=a[i]; j++) {
				
				if (j % 2 ==  0) {
					System.out.println(j + " ");
					
				}
			}
			
			ler.close();
		}
		
		
		
		
		
		
		
		
		
		
	}

}


