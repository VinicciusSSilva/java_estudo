package atividade_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String placa = "", modelo = "", tipoVeiculo = "";
        int ano = 0, dias = 0, op = -1;
        double valorDiaria = 0;
        Veiculo veiculo = null;

        while (true) {
            System.err.println("=======SISTEMA DE ALUGUEL========" +
                    "\n1 - Cadastrar um veículo;" +
                    "\n2 - Escolher entre carro ou moto" +
                    "\n3 - Mostrar os dados do veículo" +
                    "\n4 - Informar a quantidade de dias" +
                    "\n5 - Calcular o valor do aluguel" +
                    "\n6 - Calcular o aluguel com desconto" +
                    "\n0 - Encerrar o Sistema");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Insira a placa do veículo: ");
                    placa = sc.nextLine();
                    System.out.print("Insira o modelo do veículo: ");
                    modelo = sc.nextLine();
                    System.out.print("Insira o ano do veículo: ");
                    ano = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Digite valor da diária: ");
                    valorDiaria = sc.nextDouble();
                    sc.nextLine();
                    break;

                case 2:
                    System.out.println("Qual o tipo do veículo(1 - Moto | 2 - Carro): ");
                    int tipoV = sc.nextInt();
                    sc.nextLine();

                    if (tipoV == 1) {
                        tipoVeiculo = "Moto";
                        veiculo = new Moto(placa, modelo, ano, valorDiaria, tipoVeiculo);
                    } else if (tipoV == 2) {
                        tipoVeiculo = "Carro";
                        veiculo = new Carro(placa, modelo, ano, valorDiaria, tipoVeiculo);
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
                case 3:
                    if (veiculo != null) {
                        System.out.println(veiculo);
                    } else {
                        System.out.println("Não existem veículo cadastrados.");
                    }

                    break;
                case 4:
                    System.out.print("Insira a quantidade de dias alugados: ");
                    dias = sc.nextInt();
                    sc.nextLine();
                    break;
                case 5:
                    if (veiculo != null) {
                        if (dias > 0) {
                            Aluguel a = (Aluguel) veiculo;
                            double total = a.valorAluguel(dias);
                            System.out.println("Valor total do aluguel: R$ " + total);
                        } else {
                            System.out.println("Dias insuficientes para alugar");
                        }
                    } else {
                        System.out.println("Não existem veículo cadastrados.");
                    }
                    break;
                case 6:
                    if (veiculo != null) {
                        if (dias > 0) {
                            System.out.println("Insira o desconto: R$ ");
                            double desconto = sc.nextDouble();
                            sc.nextLine();

                            Aluguel a = (Aluguel) veiculo;
                            double totalDesconto = a.valorAluguel(dias, desconto);
                            System.out.println("Valor total do aluguel: R$ " + totalDesconto);
                        } else {
                            System.out.println("Dias insuficientes para alugar");
                        }
                    } else {
                        System.out.println("Não existem veículo cadastrados.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrrando o sistema.");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção Invalida!");
                    break;

            }
        }

    }
}
