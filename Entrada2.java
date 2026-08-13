import java.util.Scanner;

public class Entrada2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Seu sexo (F ou M): ");
        char sexo = sc.next().charAt(0);

        sc.close();

        System.out.println("Olá "+nome+", seu sexo é." +sexo);
    }

}

