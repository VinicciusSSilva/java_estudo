package atividades;

import java.util.Scanner;

public class ValidarNome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String resp  = "";

        while(!resp.equals("anderson")){
            System.out.println("Quem é o professor mais fofo do Senai?");
            resp = sc.nextLine().toLowerCase();
        }

        System.out.println("Acertou");

        sc.close();
    }
}
