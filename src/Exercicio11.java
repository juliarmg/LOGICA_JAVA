import java.util.Scanner;

public class Exercicio11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno(a)");
        String nome = sc.next();
        System.out.println("Digite a primeira nota ");
        double n1 = sc.nextInt();
        System.out.println("Digite a segunda nota ");
        double n2 = sc.nextInt();
        System.out.println("Digite a terceira nota ");
        double n3 = sc.nextInt();
        System.out.println("Digite a quarta nota ");
        double n4 = sc.nextInt();

        double media = (n1+n2+n3+n4)/4;
        if(media>=7){
            System.out.printf("Parabéns "+nome+" você foi aprovado(a) com media: "+ "%.2f",media);
        }
    }
}
