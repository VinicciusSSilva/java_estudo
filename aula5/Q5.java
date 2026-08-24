package aula5;

import java.util.Scanner;

public class Q5{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Informe o número:");
        int numero = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println("Tabuada do "+numero+" por "+i);
            System.out.println(numero+" x "+i+" = "+(numero*i));
            System.out.println(numero+" + "+i+" = "+(numero+i));
            System.out.println(numero+" - "+i+" = "+(numero-i));
            System.out.println(numero+" / "+i+" = "+(numero/i));
        }

        sc.close();
    }
}
