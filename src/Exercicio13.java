import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        String nome = sc.next();

        System.out.println("Digite a sua idade ");
        int idade = sc.nextInt();

        if(idade>=18){
            System.out.println("Você é maior de idade!");
        }else{
            System.out.println("Voce é menor de idade!");
        }

    }
}
