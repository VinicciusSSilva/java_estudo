package dowhile;

import java.util.Scanner;

public class DoWhile5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int op;

        do{
            System.out.println("1-Iniciar Jogo");
            System.out.println("2-Carregar jogo");
            System.out.println("3-Configuração");
            System.out.println("0-Sair");
            System.out.println("Escolha uma opção: ");
            op=sc.nextInt();

            switch (op) {
                case 1:

                System.out.println("Iniciar");
                    
                    break;
                case 2:

                System.out.println("Carregando");

                break;
                case 3:
                    System.out.println("Configurar");
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
            
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while(op!=0);

        sc.close();
    }
}
