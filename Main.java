import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op;
        do {
            System.out.println("===Sistemas de Veiculos===");
            System.out.println("1 - Cadastrar Carro");
            System.out.println("2 - Cadastrar Moto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();
            while (!sc.hasNextInt(op)) {
                System.err.println("Opção inválida! Digite 1, 2 ou 0.");
                sc.nextLine();
            }
            ;

            switch (op) {
                case 1:
                    System.out.print("Digite a marca do carro: ");
                    String marcaCarro = sc.next();
                    System.out.print("Digite o ano do carro: ");
                    int anoCarro = sc.nextInt();
                    System.out.print("Digite o número de portas do carro: ");
                    int portasCarro = sc.nextInt();
                    
                    Carro carro = new Carro(marcaCarro, anoCarro, portasCarro);
                    carro.setMarca(marcaCarro);
                    carro.setAno(anoCarro);
                    carro.setPortas(portasCarro);

                    System.out.println("===Informações do Carro===");
                    carro.exibirInfo();
                    break;
                case 2:
                    System.out.print("Digite a marca da moto: ");
                    String marcaMoto = sc.next();
                    System.out.print("Digite o ano da moto: ");
                    int anoMoto = sc.nextInt();
                    System.out.print("Digite o número de cilindradas da moto: ");
                    int cilindradasMoto = sc.nextInt();

                    Moto moto = new Moto(marcaMoto, anoMoto, cilindradasMoto);


                    moto.setMarca(marcaMoto);
                    moto.setAno(anoMoto);
                    moto.setCilindradas(cilindradasMoto);

                    System.out.println("===Informações da Moto===");
                    moto.exibirInfo();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.err.println("Opção inválida! Digite 1, 2 ou 0.");
                    break;
            }

            sc.close();
        } while (op != 0);
    }
}
