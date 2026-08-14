import java.util.Scanner;

public class Exercicio24 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Qual o tempo do percurso?");
       int tempo = sc.nextInt();

       System.out.println("Qual a velocidade média?");
       int velocidade = sc.nextInt();

       int distancia = tempo * velocidade;
       int litros = distancia / 12;

       System.out.println("Tempo do percurso: "+tempo);
       System.out.println("Velocidade: "+ velocidade);
       System.out.println("Distância: "+ distancia);
       System.out.println("litros: "+ litros);


       System.out.println();
    }
}
