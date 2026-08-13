import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira peso");
        int peso = sc.nextInt();
        System.out.println("Insira altura em cm");
        int alturacm = sc.nextInt();

        double altura = (double) alturacm/100;

        double imc = (double) peso/Math.pow(altura, 2);

        System.out.printf("Seu imc é : %.2f%n", imc ) ;


        sc.close();
    }
}
