import java.util.Scanner;

public class Exercicio22 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Digite o valor A ");
       int A = sc.nextInt();
       System.out.println("Digite o valor B");
       int B = sc.nextInt();

       int quociente = A/B;
       int resto = A%B;

       System.out.println("O quociente da divisao: "+quociente);
       System.out.println("O resto da divisao: "+resto);
    }
}
