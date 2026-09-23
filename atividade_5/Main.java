package atividade_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeCliente = "", endereco = "", tipoPedido = "", chavePix = "";
        int numeroPedido = 0, parcelas = 0, op = -1;
        double valorPedido = 0, taxaEntrega = 0, valorFinal = 0;
        Pedido pedido = null;

        while (true) {
            System.out.println("\n======= SISTEMA DE PEDIDOS =======" +
                    "\n1 - Cadastrar pedido" +
                    "\n2 - Escolher pedido local ou delivery" +
                    "\n3 - Mostrar dados do pedido" +
                    "\n4 - Escolher forma de pagamento" +
                    "\n5 - Pagar em dinheiro" +
                    "\n6 - Pagar via PIX" +
                    "\n7 - Pagar com cartão" +
                    "\n8 - Encerrar o programa");
            System.out.print("Escolha uma opção: ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Insira o número do pedido: ");
                    numeroPedido = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Insira o nome do cliente: ");
                    nomeCliente = sc.nextLine();
                    System.out.print("Insira o valor do pedido: R$ ");
                    valorPedido = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Dados do pedido registrados!");
                    break;

                case 2:
                    System.out.print("Escolha o tipo (1 - Local | 2 - Delivery): ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    if (tipo == 1) {
                        tipoPedido = "Local";
                        pedido = new PedidoLocal(numeroPedido, nomeCliente, valorPedido);
                        System.out.println("Pedido Local cadastrado com sucesso!");
                    } else if (tipo == 2) {
                        System.out.print("Insira o endereço de entrega: ");
                        endereco = sc.nextLine();
                        System.out.print("Insira a taxa de entrega: R$ ");
                        taxaEntrega = sc.nextDouble();
                        sc.nextLine();
                        tipoPedido = "Delivery";
                        pedido = new PedidoDelivery(numeroPedido, nomeCliente, valorPedido, endereco, taxaEntrega);
                        System.out.println("Pedido Delivery cadastrado com sucesso!");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 3:
                    if (pedido != null) {
                        System.out.println(pedido);
                    } else {
                        System.out.println("Nenhum pedido cadastrado!");
                    }
                    break;

                case 4:
                    if (pedido != null) {
                        System.out.println("\n=== FORMAS DE PAGAMENTO DISPONÍVEIS ===");
                        System.out.println("5 - Pagar em Dinheiro");
                        System.out.println("6 - Pagar via PIX");
                        System.out.println("7 - Pagar com Cartão");
                        System.out.println("Selecione uma das opções no menu principal.");
                    } else {
                        System.out.println("Cadastre o pedido e escolha o tipo primeiro!");
                    }
                    break;

                case 5:
                    if (pedido != null) {
                        Pagamento p = (Pagamento) pedido;
                        valorFinal = p.pagar(pedido.getValorPedido());
                        System.out.println("\n--- Pagamento em Dinheiro Realizado ---");
                        System.out.println("Valor do Pedido: R$ " + pedido.getValorPedido());
                        System.out.println("Valor Total a Pagar: R$ " + valorFinal);
                    } else {
                        System.out.println("Cadastre o pedido e escolha o tipo primeiro!");
                    }
                    break;

                case 6:
                    if (pedido != null) {
                        System.out.print("Insira a chave PIX: ");
                        chavePix = sc.nextLine();

                        Pagamento p = (Pagamento) pedido;
                        valorFinal = p.pagar(pedido.getValorPedido(), chavePix);
                        System.out.println("\n--- Pagamento via PIX Realizado ---");
                        System.out.println("Chave PIX: " + chavePix);
                        System.out.println("Valor Total a Pagar: R$ " + valorFinal);
                    } else {
                        System.out.println("Cadastre o pedido e escolha o tipo primeiro!");
                    }
                    break;

                case 7:
                    if (pedido != null) {
                        System.out.print("Insira a quantidade de parcelas: ");
                        parcelas = sc.nextInt();
                        sc.nextLine();

                        Pagamento p = (Pagamento) pedido;
                        valorFinal = p.pagar(pedido.getValorPedido(), parcelas);
                        double valorParcela = valorFinal / parcelas;

                        System.out.println("\n--- Pagamento com Cartão Realizado ---");
                        System.out.println("Quantidade de Parcelas: " + parcelas + "x de R$ " + valorParcela);
                        System.out.println("Valor Total a Pagar: R$ " + valorFinal);
                    } else {
                        System.out.println("Cadastre o pedido e escolha o tipo primeiro!");
                    }
                    break;

                case 8:
                case 0:
                    System.out.println("Sistema encerrado!");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}