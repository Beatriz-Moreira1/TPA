package lista02;
import java.util.Scanner;

public class Dependentes {
   public static void main (String args[]) {
        Scanner ler = new Scanner(System.in);
        double salario, dependentes, total;
        //leia(salario)
        System.out.println("Digite o sal�rio:");
        salario = ler.nextDouble();
        //leia(dependentes)
        System.out.println("Digite o n�mero de dependentes:");
        dependentes = ler.nextDouble();
        //Calcule(total)
        total = dependentes*55.00+salario;
        //Apresente(total)
        System.out.println("O total �:" + total);
        ler.close();
    }
}