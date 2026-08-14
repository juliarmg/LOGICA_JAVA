import java.util.Scanner;
public class Exercicio1 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor A: ");
        int A = sc.nextInt();
        System.out.println("Insira o valor B: ");
        int B = sc.nextInt();
        System.out.println("Insira o valor C:");
        int C = sc.nextInt();

        int soma = A + B;
        System.out.println("O soma entre " + A + " e " + B + " é igual a " + soma);
        if (soma < C) {
            System.out.println("A soma entre A e B" + soma + " é menor que " + C);

            sc.close();
        }
    }
}