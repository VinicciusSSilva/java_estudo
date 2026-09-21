package atividade_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        String cpf = "";
        String nome = "";
        double salario = 0;
        double bonus = 0;
        Funcionario funcionario = null;

        while (true) {
            System.err.println("=======SISTEMA DE FUNCIONÁRIO========" +
                    "\n1 - Cadastrar o funcionário" +
                    "\n2 - Escolher o tipo de funcionário" +
                    "\n3 - Mostrar os dados cadastrados" +
                    "\n4 - Calcular o pagamento" +
                    "\n5 - Calcular o pagamento com bônus" +
                    "\n6 - Consultar os dados do funcionário" +
                    "\n0 - Encerrar o Sistema");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:// cadastrar
                    System.out.print("Insira o nome do funcionário: ");
                    nome = sc.nextLine();
                    System.out.print("Insira o CPF do funcionário: ");
                    cpf = sc.nextLine();
                    System.out.print("Digite o salário/valor da hora: ");
                    salario = sc.nextDouble();
                    sc.nextLine();

                    break;
                case 2: // tipo funcionario
                    System.err.println("1 - CLT | 2 - Freelancer");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    if (tipo == 1) {

                        Funcionario funcionarioCLT = new FuncionarioCLT(nome, cpf, salario, 0);
                        System.out.println("Cadastrado com sucesso!");
                    } else if (tipo == 2) {
                        System.out.println("Digite a quantidade de horas trabalhadas: ");
                        int horas = sc.nextInt();
                        sc.nextLine();
                        Funcionario funcionarioFreelancer = new FuncionarioFreelancer(nome, cpf, salario, horas);
                        System.out.println("Cadastrado com sucesso!");
                    }
                    break;

                case 3:// consultar dados
                    if (funcionario != null) {
                        System.err.println("=====DADOS DO FUNCIONÁRIO===" +
                                "\nNome: " + funcionario.getNome() +
                                "\nCpf: " + funcionario.getCpf() +
                                "\nSalário Base/Valor da hora: " + funcionario.getSalario());

                    } else {
                        System.out.println("Nenhum funcionário cadastrado!");
                    }
                    break;
                case 4:
                    if (funcionario != null) {
                        Pagamento p = (Pagamento) funcionario;
                        double valor = p.calcPagamento();

                        System.out.println("Valor pagamento: R$" + valor);
                    } else {
                        System.out.println("Nenhum funcionário cadastrado!");
                    }
                    break;
                case 5:
                    if (funcionario != null) {
                        System.out.println("Qual o valor do bônus: R$ ");
                        bonus = sc.nextDouble();
                        sc.nextLine();

                        Pagamento p = (Pagamento) funcionario;

                        System.out.println("Valor do pagamento com o bônus " + p.calcPagamento(bonus));

                    } else {
                        System.out.println("Nenhum funcionário cadastrado!");
                    }
                    break;
                case 6:
                    if (funcionario != null) {
                        System.out.println("\n=== CONSULTA DE DADOS DO FUNCIONÁRIO ===");
                        System.out.println("Nome: " + funcionario.getNome());
                        System.out.println("CPF: " + funcionario.getCpf());
                        System.out.println("Salário Base / Valor por Hora: R$ " + funcionario.getSalario());

                        Pagamento p = (Pagamento) funcionario;
                        System.out.println("Pagamento Base Atual: R$ " + p.calcPagamento());
                    } else {
                        System.out.println("Nenhum funcionário cadastrado!");
                    }
                    break;
                case 7:
                    System.out.println("Sistema encerrado!");
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            sc.close();
        }

    }
}
