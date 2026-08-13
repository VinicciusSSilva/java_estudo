import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Sua Idade: ");
        int idade = sc.nextInt();

        sc.close();

        System.out.println("Olá "+nome+", você tem "+idade+" anos.");
    }
    
}
