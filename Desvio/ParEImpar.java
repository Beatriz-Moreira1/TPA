import java.util.Scanner;
public class ParEImpar {
	public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n,resto;
    
    System.out.println("Digite seu n�mero: ");
    n = ler.nextInt();
    resto = n%2;
    if(resto == 0) {
    	System.out.println("Seu n�mero � par.");
    }else {
    	System.out.println("Seu n�mero � impar.");
    }
       ler.close();
	}

}
