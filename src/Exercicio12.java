import java.util.Scanner;

public class Exercicio12 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Digite o valor do produto");
        double valor = sc.nextDouble();
        System.out.println("Tabela de Código de Condições de Pagamento\n" +
                "\n" +
                " \n" +
                "\n" +
                " 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto\n" +
                "\n" +
                " 2 - À Vista no cartão de crédito, recebe 10% de desconto\n" +
                "\n" +
                " 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros\n" +
                "\n" +
                " 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        System.out.println("Forma de pagamento?");

        int forma =sc.nextInt();
        double calculo = valor ;
        if(forma ==1){
            calculo=valor*0.85;
            System.out.println("Valor final do produto: "+calculo);
        }else if(forma ==2){
            calculo=valor*0.90;
            System.out.println("Valor final do produto: "+calculo);
        }else if(forma==3){
            calculo=calculo;
            System.out.println("Valor final do produto: "+calculo);
        }else if(valor==4){
            calculo=valor*1.10;
            System.out.println("Valor final do produto: "+calculo);
        }
    }
}
