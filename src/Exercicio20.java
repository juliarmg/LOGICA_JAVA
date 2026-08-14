import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero que deseja descobrir a tabuada");
        int n = sc.nextInt();
        int i =1;
        while(i<=10){
            System.out.println(n+" X "+i+" = "+ n*i);
            i++;
        }

    }
}
