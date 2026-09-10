import java.util.Scanner;

public class LojaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Loja l = new Loja(null, 0, 0);

        System.out.println("Digite o nome do produto: ");
        l.setNome(sc.nextLine());

        System.out.println("Qual o valor?: ");
        l.setPreco(sc.nextDouble());

        System.out.println("Qual a quantidade? :");
        l.setQuant(sc.nextInt());

        System.out.printf("Produto: %s%nPreço:%.2f%nQuantidade: %d",l.getNome(),l.getPreco(),l.getQuant() );




        sc.close();
    }
}
