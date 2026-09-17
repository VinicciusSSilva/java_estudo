import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");

        String nome = sc.nextLine();

        Cliente cliente = new Cliente(nome);
        cliente.mostrarDados();

        System.out.println("Digite o nome produto: ");
        String produto = sc.nextLine();

        System.out.println("Digite a quantidade: ");
        int quant = sc.nextInt();

        System.out.println("Digite o valor: ");
        double valor = sc.nextDouble();

        System.out.println("\n<<<<<COMPRAS>>>>");
        cliente.comprar(produto);

        System.out.println();

        cliente.comprar(produto, quant);
        System.out.println();
        cliente.comprar(produto, quant, valor);

        double total = quant * valor;

        System.out.println("======Pagamento======");
        cliente.pagar(total);

        sc.close();
    }
}
