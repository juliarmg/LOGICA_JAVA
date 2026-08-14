import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero qualquer");
        int num = sc.nextInt();
        int ant =num-1;
        int suc = num+1;
        System.out.println("O antecessor de "+num+" é "+ant);
        System.out.println("O sucessor de "+num+" é "+suc);
        sc.close();

    }
}
