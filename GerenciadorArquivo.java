import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GerenciadorArquivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File arquivo = new File("arquivo.txt");
        int op = 0;

        do {
            System.out.println("=== GERENCIADOR DE ARQUIVO ===" +
                    "\n1 - Criar arquivo" +
                    "\n2 - Escrever no arquivo" +
                    "\n3 - Ler arquivo" +
                    "\n4 - Alterar arquivo" +
                    "\n5 - Remover arquivo" +
                    "\n6 - Sair" +
                    "\n==============================");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                op = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Por favor, digite um número válido.\n");
                scanner.nextLine();
                continue;
            }

            switch (op) {
                case 1:
                    try {
                        if (arquivo.createNewFile()) {
                            System.out.println("Arquivo '" + arquivo.getName() + "' criado com sucesso!");
                        } else {
                            System.out.println("O arquivo '" + arquivo.getName() + "' já existe.");
                        }
                    } catch (IOException e) {
                        System.out.println("Erro ao criar o arquivo: " + e.getMessage());
                    }
                    break;

                case 2:
                    if (!arquivo.exists()) {
                        System.out.println("O arquivo não existe. Crie-o primeiro usando a opção 1.");
                        break;
                    }

                    System.out.print("Digite o texto a ser adicionado: ");
                    String conteudoAdicional = scanner.nextLine();

                    
                    try (FileWriter writer = new FileWriter(arquivo, true)) {
                        writer.write(conteudoAdicional + System.lineSeparator());
                        System.out.println("Conteúdo gravado com sucesso!");
                    } catch (IOException e) {
                        System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
                    }
                    break;

                case 3:
                    if (!arquivo.exists()) {
                        System.out.println("O arquivo não existe.");
                        break;
                    }

                    System.out.println("\n Conteúdo de " + arquivo.getName());
                    try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
                        String linha;
                        boolean vazio = true;

                        while ((linha = reader.readLine()) != null) {
                            System.out.println(linha);
                            vazio = false;
                        }

                        if (vazio) {
                            System.out.println("O arquivo está vazio");
                        }
                    } catch (IOException e) {
                        System.out.println("Erro ao ler o arquivo: " + e.getMessage());
                    }
                    break;

                case 4:
                    if (!arquivo.exists()) {
                        System.out.println("O arquivo não existe.");
                        break;
                    }

                    System.out.println("Atenção: A alteração irá sobrescrever todo o conteúdo atual.");
                    System.out.print("Digite o novo texto: ");
                    String novoConteudo = scanner.nextLine();

                    
                    try (FileWriter writer = new FileWriter(arquivo, false)) {
                        writer.write(novoConteudo + System.lineSeparator());
                        System.out.println("Arquivo alterado com sucesso!");
                    } catch (IOException e) {
                        System.out.println("Erro ao alterar o arquivo: " + e.getMessage());
                    }
                    break;

                case 5:
                    if (!arquivo.exists()) {
                        System.out.println("O arquivo não existe.");
                        break;
                    }

                    if (arquivo.delete()) {
                        System.out.println("Arquivo '" + arquivo.getName() + "' removido com sucesso!");
                    } else {
                        System.out.println("Falha ao remover o arquivo.");
                    }
                    break;

                case 6:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            System.out.println();
        } while (op != 6);

        scanner.close();
    }
}