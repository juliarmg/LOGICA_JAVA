import java.util.Scanner;

public class Exercicio2 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Digite um valor:");
         double num = sc.nextDouble();
            if(num%2==0){
                System.out.println(num+" é par");
            }else {
                System.out.println(num+" é impar");
            }

            if(num>0){
                System.out.println(num+" é positivo");
            }else{
                System.out.println(num+" é negativo");
            }
         sc.close();
    }

}

