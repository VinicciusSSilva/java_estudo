package atividade;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====CADASTRO=====");
        System.out.print("Número da agência: ");

        int numAgencia = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome da Agência: ");
        String nomeAgencia = sc.nextLine();

        System.out.print("Número da conta: ");
        int numConta = sc.nextInt();
        sc.nextLine();

        System.out.print("Titular: ");
        String titular = sc.nextLine();

        System.out.print("Saldo Inicial: R$ ");
        double saldoInicial = sc.nextDouble();

        Agencia agencia = new Agencia(nomeAgencia, numAgencia);
        ContaCorrente conta = new ContaCorrente(numConta, titular, saldoInicial, agencia);
        
        int op = -1;

        do{

            System.out.println("\n========MENU========="+
                                "\n1 - Mostrar dado da conta"+
                                "\n2 - Consultar saldo"+
                                "\n3 - Depositar"+
                                "\n4 - Pagar com Pix"+
                                "\n5 - Pagar com cartão"+
                                "\n6 - Pagar em dinheiro"+
                                "\n7 - Tranferir"+
                                "\n0 - Sair"                               

            );
            System.out.print("Escolhe uma opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1: //mostrar dados da conta
                    conta.mostrarDados();
                    break;
                
                case 2: //consultar dados da conta
                    conta.consultarSaldo();
                    break;
                case 3://depositar
                    System.out.println("Informe o valor depósito: R$ ");
                    conta.depositar(sc.nextDouble());
                    break;
                case 4://pix
                    System.out.println("Informe o valor do PIX: R$");
                    double valorPix = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Informe a chave Pix: ");
                    String chave = sc.nextLine();
                    conta.pagar(valorPix, chave);
                    break;
                case 5:// cartao
                    System.out.println("Informe o valor do pagamento: R$");
                    double valorCartao = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Informe a quantidade de parcelas: ");
                    int parcelas = sc.nextInt();
                    conta.pagar(valorCartao, parcelas);
                    break;
                case 6://dinheiro
                    System.out.println("Informe o valor do pagamento: R$");
                    double valorDinheiro = sc.nextDouble();
                    sc.nextLine();
                    conta.pagar(valorDinheiro);
                    break;
                case 7:
                    System.out.println("Número da conta de destino: ");
                    int contaDestino = sc.nextInt();
                    System.out.println("Digite o valor da tranferência: R$ ");
                    double valorTransferencia = sc.nextDouble();
                    conta.transfer(contaDestino, valorTransferencia);
                    break;
                case 0:
                    System.err.println("Encerrando o progama.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }while(op!=0);



        sc.close();
    }
}
