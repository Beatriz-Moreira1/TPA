import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int b =0, a = 1, c, n, i = 2;
		
		System.out.println("Digite um n�mero");
		n = ler.nextInt();
		
		while ( i <= n) {
			c = b + a;
			b = a;
			a = c;
			i ++;
			System.out.println("A sequ�ncia Fibonacci ser�: " + a);
		}
		
		ler.close();
	
	}

}
