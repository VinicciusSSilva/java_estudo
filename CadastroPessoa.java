import java.util.Scanner;

public class CadastroPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes;
        int[] idades;

        System.out.println("Quantidade de pessoas que deseja cadastrar?: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        nomes = new String[quantidade];
        idades = new int[quantidade];

        for(int i=0;i<quantidade;i++){
            System.out.println("Digite o nome: ");
            nomes[i] = sc.nextLine();

            System.out.println("Digite a idade: ");
            idades[i] = sc.nextInt();
        }
        sc.close();
    }
}
