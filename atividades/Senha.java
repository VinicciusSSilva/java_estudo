package atividades;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String senha = "";

        while(!senha.equals("2024")){
            System.out.println("informe a senha");
            senha = sc.nextLine();
        }

        System.out.println("Acesso permitido!");

        sc.close();
    }
}
