import java.util.Scanner;

public class Exercicio14 {
  public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);

      System.out.println("Digite o valor A ");
      int A=sc.nextInt();

      System.out.println("Digite o valor B ");
      int B= sc.nextInt();
      int aux;

      aux=A;
      A=B;
      B=aux;

      System.out.println("Valores trocados");
      System.out.println("A: "+A);
      System.out.println("B: "+B);

    }
}
