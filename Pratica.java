import java.util.Scanner;

public class Pratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        String[] produto = new String[5];
        int[] quantP = new int[5];
        int qtd = 0;

        while (op != 6) {
            System.out.println("\n ========PRODUTOS========" +
                    "\n1-Cadastrar produto" +
                    "\n2-Listar produtos" +
                    "\n3-Pesquisar produto" +
                    "\n4-Alterar Produto" +
                    "\n5-Remover produto" +
                    "\n6-Sair do sistema");
            System.out.print("\nEscolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    if (qtd < 5) {  
                            System.out.println("Digite o nome do produto");
                            produto[qtd] = sc.nextLine();
                            System.out.println("Digite a quantidade do produto");
                            quantP[qtd] = sc.nextInt();
                            sc.nextLine();
                            qtd++;
                        

                    } else {
                        System.out.println("Quantidade máxima de produtos cadastrados atingidos");
                    }
                    break;
                case 2:
                    if (qtd == 0) {
                        System.out.println("Nenhum Produto Cadastrado");
                    } else {
                        for (int i = 0; i < qtd; i++) {
                            System.out.println(
                                    "Id: " + i +
                                            "| Nome: " + produto[i] +
                                            "| Quantidade: " + quantP[i]);
                        }
                        ;
                    }
                    break;  
                case 3:
                    System.out.println("Digite o nome do produto: ");
                    String busca = sc.nextLine();
                    int posBusca = -1;
                    for (int i = 0; i < qtd; i++) {
                        if (produto[i].equalsIgnoreCase(busca)) {
                        posBusca=1;
                        break;
                    }
                    }
                    if(posBusca ==-1){
                        System.out.println("Produto não encontrado");
                    }else{
                         System.out.println("Produto Encontrado: " +
                                    "| Nome: " + produto[posBusca] +
                                    "| Quantidade: " + quantP[posBusca]);
                                    
                    }
                    break;
                case 4:
                    System.out.println("Digite o nome do produto: ");
                    String buscaAlt = sc.nextLine();
                    for (int i = 0; i < qtd; i++) {

                        if (produto[i].equalsIgnoreCase(buscaAlt)) {
                            System.out.println("Digite o novo nome:");
                            produto[i] = sc.nextLine();
                            System.out.println("Digite a quantidade: ");
                            quantP[i] = sc.nextInt();
                        } else {
                            System.out.println("Não Encontrado!");
                        }
                    }

                    break;
                case 5:
                    System.out.println("Digite o nome do produto: ");
                    String buscaDel = sc.nextLine();
                    for (int i = 0; i < qtd; i++) {

                        if (produto[i].equalsIgnoreCase(buscaDel)) {
                            int remove = i;
                            for (int j = remove; j < qtd - 1; j++) {

                                produto[j] = produto[j + 1];
                                quantP[j] = quantP[j + 1];

                            }
                            produto[qtd - 1] = null;
                            quantP[qtd - 1] = 0;

                            qtd--;

                        } else {
                            System.out.println("Não Encontrado!");
                        }
                    }

                    break;
                case 6:
                    System.out.println("Saindo....");
                    break;

                default:
                    System.out.println("Opção Inválida.");
                    break;
            }
        }

        sc.close();
    }
}
