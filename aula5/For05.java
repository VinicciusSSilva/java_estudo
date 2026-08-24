package aula5;

import java.util.Scanner;

public class For05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=1;i<=3;i++){
            System.out.println("Informe o "+i+"º numero");
            int numero = sc.nextInt();

            System.out.println("o numero informado é: "+ numero);
        }

        sc.close();
    }
}
