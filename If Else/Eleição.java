import java.util.Scanner;
public class Elei��o {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int nasc, idade;
		
		System.out.println("Digite seu ano de nascimento: ");
		nasc = ler.nextInt ();
		
		idade = 2026-nasc;
		
		System.out.println("Sua idade na pr�xima elei��o ser�: "+idade);
		
		if(idade<16) {
			System.out.println("Voc� ainda n�o poder� votar");
		}else {
			System.out.println("Voc� poder� votar");
		}
		ler.close();
	}

}
