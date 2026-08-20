package dowhile;

import java.util.Scanner;

public class DoWhile4 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);


    String senha = "";
    do{
        System.out.println("Digite a Senha");
        senha=sc.nextLine();
    }while(!senha.equals("1234"));

    System.out.println("Acesso Liberado.");

    sc.close();
    }
}
