package atividades;

import java.util.Scanner;

public class OnlyPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        while (numero >= 0){
            System.out.println("Digite um número inteiro");
            numero = sc.nextInt();
    }
    System.out.println("Número negativo detectado, sistema encerrado.");
    sc.close();
}
}
