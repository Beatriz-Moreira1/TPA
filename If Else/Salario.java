import java.util.Scanner;
public class Salario {
	public static void main(String args[]) {
	Scanner ler = new Scanner(System.in);
	double s;
	System.out.println("Digite seu sal�rio:");
	s=ler.nextDouble();
	if (s>=1302) {
		System.out.println("Acima do sal�rio m�nimo");
	}else {
		System.out.println("Abaixo do sal�rio m�nimo"); 
	ler.close();
		}
	}
}