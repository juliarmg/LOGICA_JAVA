import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor A");
        double A =sc.nextDouble();
        System.out.println("Digite o valor B");
        double B = sc.nextDouble();;
        if(A==B){
            double C =A+B;
            System.out.println("A soma entre "+A+" e "+ B+" = "+C);
        }else{
            double C = A*B;
            System.out.println("A multiplicação entre "+A+" e "+ B+" = "+C);
            sc.close();
        }
    }
}
