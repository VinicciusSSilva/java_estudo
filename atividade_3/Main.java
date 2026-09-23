package atividade_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "",
                tipoProduto = "";
        int codigo = 0,
                quantidade = 0,
                op = -1;
        double preco = 0,
                frete = 0,
                valorFinal = 0;
        Produto produto = null;

        while (true) {
            System.out.println("\n======= SISTEMA DE PRODUTOS =======" +
                    "\n1 - Cadastrar produto" +
                    "\n2 - Escolher produto físico ou digital" +
                    "\n3 - Mostrar dados do produto" +
                    "\n4 - Informar quantidade" +
                    "\n5 - Realizar venda" +
                    "\n6 - Realizar venda com desconto" +
                    "\n7 - Mostrar valor final" +
                    "\n0 - Encerrar o programa");
            System.out.print("Escolha uma opção: ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Insira o código do produto: ");
                    codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Insira o nome do produto: ");
                    nome = sc.nextLine();
                    System.out.print("Insira o preço do produto: R$ ");
                    preco = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Dados do produto registados!");
                    break;
                case 2:
                    System.out.print("Escolha o tipo (1 - Físico | 2 - Digital): ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    if (tipo == 1) {
                        System.out.print("Insira o valor do frete: R$ ");
                        frete = sc.nextDouble();
                        sc.nextLine();
                        tipoProduto = "Físico";
                        produto = new ProdutoFisico(codigo, nome, preco, frete, quantidade);
                        System.out.println("Produto Físico cadastrado com sucesso!");
                    } else if (tipo == 2) {
                        tipoProduto = "Digital";
                        produto = new ProdutoDigital(codigo, nome, preco, quantidade);
                        System.out.println("Produto Digital cadastrado com sucesso!");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 3:
                    if (produto != null) {
                        System.out.println(produto +
                                "\nTipo de Produto: " + tipoProduto +
                                "\nQuantidade Selecionada: " + quantidade);
                    } else {
                        System.out.println("Nenhum produto cadastrado!");
                    }

                    break;
                case 4:
                    System.out.print("Insira a quantidade de unidades: ");
                    quantidade = sc.nextInt();
                    sc.nextLine();
                    if (produto != null) {
                        if (tipoProduto.equals("Físico")) {
                            ((ProdutoFisico) produto).setQuant(quantidade);
                        } else if (tipoProduto.equals("Digital")) {
                            ((ProdutoDigital) produto).setQuant(quantidade);
                        }
                    }
                    System.out.println("Quantidade atualizada com sucesso!");
                    break;
                case 5:
                    if (produto != null) {
                        if (quantidade > 0) {
                            Venda v = (Venda) produto;
                            valorFinal = v.venda();
                            System.out.println("Venda realizada! Valor total: R$ " + valorFinal);
                        } else {
                            System.out.println("Informe a quantidade na opção 4!");
                        }
                    } else {
                        System.out.println("Cadastre o produto e escolha o tipo primeiro!");
                    }

                    break;

                case 6:
                    if (produto != null) {
                        if (quantidade > 0) {
                            System.out.print("Insira a percentagem de desconto (%): ");
                            double pctDesconto = sc.nextDouble();
                            sc.nextLine();

                            Venda v = (Venda) produto;
                            double valorTotalSemDesconto = v.venda();

                            double valorDesconto = valorTotalSemDesconto * (pctDesconto / 100.0);

                            valorFinal = v.venda(valorDesconto);
                            System.out.println(produto +
                                "\nTipo de Produto: " + tipoProduto +
                                "\nQuantidade Selecionada: " + quantidade+
                                "\nValor Final da Operação: R$ " + valorFinal);
                        } else {
                            System.out.println("Informe a quantidade na opção 4!");
                        }
                    } else {
                        System.out.println("Cadastre o produto e escolha o tipo primeiro!");
                    }
                    break;
                case 7:
                    if (valorFinal > 0) {
                        System.out.println(produto +
                                "\nTipo de Produto: " + tipoProduto +
                                "\nQuantidade Selecionada: " + quantidade+
                                "\nValor Final da Operação: R$ " + valorFinal);
                    } else {
                        System.out.println("Nenhuma venda foi realizada!");
                    }
                    break;
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
