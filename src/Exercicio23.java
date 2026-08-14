import java.util.Scanner;

public class Exercicio23 {
   public  static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Qual o valor da hora aula?");
       int valHoraAula = sc.nextInt();

       System.out.println("Qual o numero de aulas lecionadas no mês");
       int numAulas = sc.nextInt();

       System.out.println("Qual o percentual de desconto do INSS?");
       int perDes =sc.nextInt();

       int sal = valHoraAula*numAulas;
       int salLiquido = sal * (100-perDes)/100;

       System.out.println("O salário liquído do professor é: "+salLiquido);
    }
}
