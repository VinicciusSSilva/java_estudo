import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[3];
        System.out.println("=====CADASTRO DE NOMES=====");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("informe os nomes: ");
            nomes[i] = sc.nextLine();
        }
        System.out.println("\nLista de nomes atual");
        for (String nome : nomes) {
            System.out.println(nome);

        }
        System.out.println("\nDigite a posição para alterar: ");
        int posAlterar = sc.nextInt();
        sc.nextLine();
        //Alterar
        if (posAlterar >= 0 && posAlterar < nomes.length) {
            System.out.println("Digite o novo nome: ");
            nomes[posAlterar] = sc.nextLine();
        } else {
            System.out.println("Posição inválida");
        }

        System.out.println("\nLista de nomes atual");

        for (String nome : nomes) {

            System.out.println(nome);
        }
        //Remover
        System.out.println("\nDIgite o numero correspondente a posicao do nome para remover: ");
        int posRemover = sc.nextInt();

        if (posRemover >= 0 && posRemover < nomes.length) {
            for(int i = posRemover;i<nomes.length -1; i++){
                nomes[i] = nomes[i+1];
            }
            nomes[nomes.length-1] = null;
        } else {
            System.out.println("Posição inválida");
        }
        System.out.println("\nLista de nomes atual");

        for (String nome : nomes) {

            System.out.println(nome);
        }


        sc.close();

    }
}
