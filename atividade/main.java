package atividade;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Contato> contatos = new ArrayList<>();


            while (true) {
            System.out.println("============AGENDA CONTATOS==============="+
            "\nEscolha a opção: "+ 
            "\n1 - Cadastrar Contato Pessoal"+
            "\n2 - Cadastrar Contato Profissional"+
            "\n3 - Listar Contato"+ 
            "\n4 - Excluir Contato+"+
            "\n5 - Alterar Contato"+
            "\n6 - Pesquisar Contato"+
            "\n7 - Sair");
            System.out.print("Opção: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Informe o nome");
                    String nomePf = sc.nextLine();

                    System.out.println("Informe o telefone");
                    String numeroPf = sc.nextLine();


                    System.out.println("Informe o parentenco");
                    String parentesco = sc.nextLine();

                    String tipo = "Pessoal";

                    contatos.add(new ContatoPessoal(nomePf, numeroPf, tipo, parentesco));
                    System.out.println("Cadastro realizado");
                    break;
                case 2:
                    System.out.println("Informe o nome");
                    String nomePj = sc.nextLine();

                    System.out.println("Informe o telefone");
                    String numeroPj = sc.nextLine();

                    String tipoPj = "Profissional";

                    System.out.println("Informe a empresa");
                    String empresa = sc.nextLine();

                    System.out.println("Informe o cargo");
                    String cargo = sc.nextLine();


                    contatos.add(new ContatoProfissional(nomePj, numeroPj, tipoPj, empresa, cargo));
                    System.out.println("Cadastro realizado");
                    break;
                case 3:
                    System.out.println("Nomes cadastrados: ");
                    for (int i = 0; i < contatos.size(); i++) {
                        System.out.println();
                        System.out.println((i+1) + " - " + contatos.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Informe o indice do contato para remover: ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    if(index > 0 && index <= contatos.size()){
                        contatos.remove(index-1);
                        System.out.println("Contanto removido");
                        
                    }else{
                        System.out.println("Contato Inválido");
                    }
                    break;
                case 5:
                    System.out.println("Informe o número para alterar");
                    int pos = sc.nextInt();
                    sc.nextLine();
                    if (pos>0 && pos <= contatos.size()){
                        System.out.println("Novo nome");
                        String novoNome = sc.nextLine();

                        System.out.println("Novo numero");
                        String novoNumero = sc.nextLine();

                        contatos.get(pos - 1).setNome(novoNome);
                        contatos.get(pos - 1).setNumero(novoNumero);

                    }else{
                        System.out.println("Contato Inválido");
                    }
                    break;
                case 6:
                    System.out.println("Informe o nome para pesquisar");
                    String busca = sc.nextLine();
                    
                    boolean encontrado = false;

                    for(int i = 0; i < contatos.size(); i++){
                        if (contatos.get(i).getNome().equalsIgnoreCase(busca)){
                            System.out.println("Encontrado: "+contatos.get(i));
                        encontrado = true;
                        }
                    }
                    if(!encontrado){
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                    case 7:
                    System.out.println("Sistema encerrado!");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção Invalida");;
                    break;
            }
        }
    
    }
}
