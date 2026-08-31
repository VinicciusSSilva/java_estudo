import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        int max = 10;
        int[] numeros = new int[max];
        int total = 0;
        int op = 0;

        while (op != 4) {
            System.out.println("\n=====GERENCIADOR DE NÚMEROS======"+
                                "\n1 - Inserir número"+
                                "\n2 - Listar números"+
                                "\n3 - Remover número"+
                                "\n4 - Sair"+
                                "\n\nEscolha uma opção:"+
                                "\n===========================");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    if (total >= max) {
                        System.out.println("O array está lotado.");
                    } else {
                        System.out.print("Digite o número: ");
                        int num = sc.nextInt();
                        numeros[total] = num;
                        total++;
                        System.out.println("Inserido com sucesso!");
                    }
                    break;

                case 2:
                    if (total == 0) {
                        System.out.println("Nenhum número cadastrado.");
                    } else {
                        System.out.println("\n===Lista de Números===");
                        for (int i = 0; i < total; i++) {
                            System.out.println("Índice [" + i + "]: " + numeros[i]);
                        }
                    }
                    break;

                case 3:
                    if (total == 0) {
                        System.out.println("Não tem numeros para remover");
                    } else {
                        System.out.print("Informe o índice do número que deseja remover: ");
                        int indice = sc.nextInt();

                        if (indice < 0 || indice >= total) {
                            System.out.println("Índice inválido! Informe um índice entre 0 e " + (total - 1) + ".");
                        } else {
                            for (int i = indice; i < total - 1; i++) {
                                numeros[i] = numeros[i + 1];
                            }
                            total--;
                            System.out.println("Removido com sucesso!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        sc.close();
    }
}
