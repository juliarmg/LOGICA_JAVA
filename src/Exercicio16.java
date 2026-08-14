import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado 1 do triangulo:");
        int l1 = sc.nextInt();

        System.out.println("Digite o lado 2 do triangulo:");
        int l2 = sc.nextInt();

        System.out.println("Digite o lado 3 do triangulo:");
        int l3 = sc.nextInt();

        if(l1==l2 && l2==l3){
            System.out.println("O triangulo é equilatero");
        }else if(l1==l2 || l1==l3 || l2==l3){
            System.out.println("O triangulo é isosceles");
        }else {
            System.out.println("O triangulo é escaleno");
        }
    }
}
