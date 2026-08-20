import java.util.Scanner;

public class Repeticao3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Informe o numero");
        int limite = sc.nextInt();

        int numero = 1;

        while (numero <= limite ) {

            System.out.println(numero);
            numero++;
            
        }



        sc.close();
    }
}
