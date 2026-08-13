import java.util.Scanner;

public class Calc {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número: ");
        int a = sc.nextInt();
             System.out.println("Digite outro número: ");
        int b= sc.nextInt();
        int soma = a+b;
        int sub = a-b;
        int mult = a*b;
        double div = (double) a/b;

            System.out.println("A soma é: "+soma);
            System.out.println("A subtração é: "+sub);
            System.out.println("A multiplicação é: "+mult);
            System.out.printf("A divisão é : %.2f%n", div )    ;
            sc.close();
    }
    
}

