public class Exercicio18 {
    public static void main(String[] args) {
        double altFran =1.50;
        double altSara = 1.10;
        int i=0;

        while(altFran>altSara){
            altFran+=0.02;
            altSara+=0.03;
            i++;
        }

        System.out.println("Serao necessarios "+i+" anos para que Sarah fique maior que Francisco");
    }
}
