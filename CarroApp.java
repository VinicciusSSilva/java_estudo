import java.util.Scanner;

public class CarroApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro c = new Carro(null, null, 0);

        System.out.println("Infome a marca: ");
        c.setMarca(sc.nextLine());


        System.out.println("\nInfome o  modelo: ");
        c.setModelo(sc.nextLine());

        System.out.println("\nInforme o ano de fabricação: ");
        c.setAnoFabricacao(sc.nextInt());

        System.out.println("Marca: "+ c.getMarca()+
                            "\nModelo: "+ c.getModelo()+
                            "\nAno: " +c.getAnoFabricacao()          
        );


    

        sc.close();
    }
}
