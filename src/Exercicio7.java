import java.util.Scanner;

public class Exercicio7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor booleano:");
        int input1 = sc.nextInt();
        boolean valor1 = (input1 == 1);
        System.out.println("Digite o segundo valor booleano");
        int input2 = sc.nextInt();
        boolean valor2 = (input2 == 1);
        if (valor1 && valor2) {
            System.out.println("Ambos sao verdadeiros");
        } else if (!valor1 && !valor2) {
            System.out.println("Ambos sao falsos");
        } else {
            System.out.println("Um é verdadeiro e o outro é falso");
        }

    }
}
