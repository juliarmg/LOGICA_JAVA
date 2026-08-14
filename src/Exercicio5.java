import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salMin = 1293.20;
        System.out.println("Qual o seu salário?");
        double salUsu = sc.nextDouble();
        int qntSal = (int) (salUsu/salMin);
        System.out.println("Você ganha "+ qntSal+ " salários minimos inteiros ");
        sc.close();
    }
}
