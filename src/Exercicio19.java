public class Exercicio19 {
    public static void main(String[] args) {
        int i =1;
        while(i<=10) {
            int n=1;
            while (n <= 10) {
                System.out.println(i + " X " + n + " = " + i * n);
                n++;
            }
            System.out.println("_________________________");
            i++;
        }
    }
}
