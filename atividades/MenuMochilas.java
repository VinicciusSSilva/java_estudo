package atividades;

import java.util.Scanner;

public class MenuMochilas {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int op = 0;
        while(op != 4){
            System.out.println("\n Escolha a opção para exibir a descrição");
            System.out.println("1-Mochila Escolar");
            System.out.println("2-Mochila de Viagem");
            System.out.println("3-Mochila Esportiva");
            System.out.println("4-Sair");
        

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Compacta e ideal para estudantes");
                break;
                case 2:
                    System.out.println("Espaçosa, ideal para longas jornadas");
                break;
                case 3:
                    System.out.println("Leve, resistente e ergonômica");
                break;
                case 4:
                    System.out.println("Saind0..........");
                break;
                            
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        }


        sc.close();
    }
}
