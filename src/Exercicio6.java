import java.util.Scanner;

public class Exercicio6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira um valor qualquer ");
        double valor = sc.nextDouble();
        double ajuste = valor*1.05;
        System.out.println("Valor "+valor+" com 5% ajustado: "+ajuste);
        sc.close();
    }
}
