package atividade_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "", tipoCurso = "", nomeAluno = "", sala = "", turno = "", plataforma = "", codigoAcesso = "";
        int codigo = 0, cargaHoraria = 0, op = -1;
        double valor = 0, valorFinal = 0;
        Curso curso = null;

        while (true) {
            System.out.println("\n======= SISTEMA DE CURSOS =======" +
                    "\n1 - Cadastrar curso" +
                    "\n2 - Escolher curso presencial ou online" +
                    "\n3 - Cadastrar nome do aluno" +
                    "\n4 - Realizar matrícula" +
                    "\n5 - Realizar matrícula com desconto" +
                    "\n6 - Mostrar dados do curso" +
                    "\n7 - Mostrar dados da matrícula" +
                    "\n0 - Encerrar o programa");
            System.out.print("Escolha uma opção: ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Insira o código do curso: ");
                    codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Insira o nome do curso: ");
                    nome = sc.nextLine();
                    System.out.print("Insira a carga horária (horas): ");
                    cargaHoraria = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Insira o valor do curso: R$ ");
                    valor = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Dados do curso registrados!");
                    break;

                case 2:
                    System.out.print("Escolha o tipo (1 - Presencial | 2 - Online): ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    if (tipo == 1) {
                        System.out.print("Insira o nome da sala: ");
                        sala = sc.nextLine();
                        System.out.print("Insira o turno (Manhã/Tarde/Noite): ");
                        turno = sc.nextLine();
                        tipoCurso = "Presencial";
                        curso = new CursoPresencial(codigo, nome, cargaHoraria, valor, sala, turno);
                        System.out.println("Curso Presencial cadastrado com sucesso!");
                    } else if (tipo == 2) {
                        System.out.print("Insira o endereço da plataforma: ");
                        plataforma = sc.nextLine();
                        System.out.print("Insira o código de acesso: ");
                        codigoAcesso = sc.nextLine();
                        tipoCurso = "Online";
                        curso = new CursoOnline(codigo, nome, cargaHoraria, valor, plataforma, codigoAcesso);
                        System.out.println("Curso Online cadastrado com sucesso!");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 3:
                    System.out.print("Insira o nome do aluno: ");
                    nomeAluno = sc.nextLine();
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 4:
                    if (curso != null) {
                        if (!nomeAluno.isEmpty()) {
                            Matricula m = (Matricula) curso;
                            valorFinal = m.matricular();
                            System.out.println("Matrícula realizada com sucesso! Valor total: R$ " + valorFinal);
                        } else {
                            System.out.println("Cadastre o nome do aluno na opção 3!");
                        }
                    } else {
                        System.out.println("Cadastre o curso e escolha o tipo primeiro!");
                    }
                    break;

                case 5:
                    if (curso != null) {
                        if (!nomeAluno.isEmpty()) {
                            System.out.print("Insira a percentagem de desconto (%): ");
                            double pctDesconto = sc.nextDouble();
                            sc.nextLine();

                            double valorDesconto = curso.getValor() * (pctDesconto / 100.0);

                            Matricula m = (Matricula) curso;
                            valorFinal = m.matricular(valorDesconto);
                            System.out.println("Matrícula com desconto realizada! Valor final: R$ " + valorFinal);
                        } else {
                            System.out.println("Cadastre o nome do aluno na opção 3!");
                        }
                    } else {
                        System.out.println("Cadastre o curso e escolha o tipo primeiro!");
                    }
                    break;

                case 6:
                    if (curso != null) {
                        System.out.println(curso + "\nTipo de Curso: " + tipoCurso);
                    } else {
                        System.out.println("Nenhum curso cadastrado!");
                    }
                    break;

                case 7:
                    if (valorFinal > 0 && !nomeAluno.isEmpty()) {
                        System.out.println("\n========== DADOS DA MATRÍCULA ==========" +
                                "\nNome do Aluno: " + nomeAluno +
                                "\n" + curso +
                                "\nTipo de Curso: " + tipoCurso +
                                "\nValor Final Pago: R$ " + valorFinal);
                    } else {
                        System.out.println("Nenhuma matrícula realizada ainda!");
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