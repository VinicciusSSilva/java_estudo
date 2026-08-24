package aula5;

import java.util.Scanner;

public class For06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        for(int i=1;i<=3;i++){
            System.out.println("informe os nomes: "+i);
            String nome=sc.nextLine();
            System.out.println("o nome cadastrado é: "+nome);

        }

        sc.close();
    }
}
