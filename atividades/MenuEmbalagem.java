package atividades;

import java.util.Scanner;

public class MenuEmbalagem {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int op = 0;
        while(op != 4){
            System.out.println("\n Escolha a opção para exibir a descrição");
            System.out.println("1-Caixa de papelão");
            System.out.println("2-Sacola plástica");
            System.out.println("3-Embalagem de vidro");
            System.out.println("4-Sair");
        

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ideal para transporte e armazenamento");
                break;
                case 2:
                    System.out.println(" Leve e prática, mas pouco sustentável ");
                break;
                case 3:
                    System.out.println("Resistente e reutilizável ");
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

