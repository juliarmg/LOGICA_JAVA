import java.util.Scanner;

public class Exercicio17 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Digite a temperatura em Fahrenheit ");
       double F = sc.nextDouble();

       double c =(5 * ( F-32) / 9);

       System.out.println("Temperatura em Fahrenheit "+F);
       System.out.printf("Temperatura em Celsius "+"%.2f",c);
   }
}
