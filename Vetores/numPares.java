package exVetor;
import java.util.Scanner;

public class numPares {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int i=0, a[];
		
		a = new int [10];
		
		for (int j = 0; j<10; j++) {
			
			a[j] = ler.nextInt();
			
			do {
				System.out.println(i);
				i = i+2;

			}while (i<a[j]);
		
		}
		
		ler.close();
		
		
	}

}
