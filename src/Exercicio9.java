import java.util.Scanner;


public class Exercicio9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu peso");
        double peso = sc.nextDouble();
        System.out.println("Digite a sua altura");
        double altura = sc.nextDouble();

        double imc = peso/ (altura*altura);
        if(imc<18.5){
            System.out.println("Você está abaixo do peso");
        }else if(imc>=18.6 && imc<24.9){
            System.out.println("Voce esta no peso ideal, parabéns!");
        }else if(imc>=25 && imc<29.9){
            System.out.println("Voce está levemente acima do peso");
        }else if(imc>=30 && imc<34.9){
            System.out.println("Obesidade grau I");
        }else if(imc>=35 && imc<39.9){
            System.out.println("Obesidade grau II(severa");
        }else if(imc>=40){
            System.out.println("Obesidade grau III(mórbida");
        }

    }
}
