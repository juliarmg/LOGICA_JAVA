import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade total de dias que você já viveu:");
        int totalDias = sc.nextInt();

        int anos = totalDias / 365;
        int restoDias = totalDias % 365;
        int meses = restoDias / 30;
        int dias = restoDias % 30;

        System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias de vida");
    }
}
