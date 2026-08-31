import java.util.Scanner;

public class SunStay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        int maxQuartos = 5;
        String[] quarto = new String[5];
        int[] cama = new int[5];
        int totalQuartos = 0;

        int maxReserva = 25;
        String[] reservaNome = new String[maxReserva];
        String[] reservaQuarto = new String[maxReserva];
        int totalReservas = 0;

        while (op != 6) {
            System.out.println("\n ========SunStay========" +
                    "\n1-Registrar número dos quartos (max.: 5)" +
                    "\n2-Registrar quantidade de camas" +
                    "\n3-Reservar quarto" +
                    "\n4-Consultar reservas por quarto" +
                    "\n5-Consultar reservas por hóspede" +
                    "\n6-Encerrar o sistema" +
                    "\n============================");
            System.out.print("\nEscolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine();



        
        switch (op) {
            case 1: // Registrar número dos quartos
                if (totalQuartos >= maxQuartos) {
                    System.out.println("Limite de 5 quartos atingido! Escolha outra opção");
                    break;
                }
                int vagasDisp = maxQuartos - totalQuartos;
                System.out.println("Quantos quartos deseja cadastrar? (Disponíveis " + vagasDisp + " )");
                int qtd = sc.nextInt();
                sc.nextLine();

                if (qtd < 1 || qtd > vagasDisp) {
                    System.out.println("Quantidade inválida!");
                    break;
                }

                for (int i = 0; i < qtd; i++) {
                    System.out.println("Informe o número do Quarto " + (totalQuartos + 1) + ": ");
                    String numNovo = sc.nextLine();
                    boolean tem = false;
                    for (int x = 0; x < totalQuartos; x++) {
                        if (quarto[x] != null && quarto[x].equalsIgnoreCase(numNovo)){
                        tem = true;
                        break;
                        }
                    }
                    if (tem) {
                        System.out.println("Este quarto já está cadastrado. Tente outro.");
                        i--;
                    } else {
                        quarto[totalQuartos] = numNovo;
                        totalQuartos++;
                    }
                    

                }
                System.out.println(
                        "Quartos registrados com sucesso! Total cadastrado: " + totalQuartos + "/" + maxQuartos);

                break;

            case 2: // Registrar quantidade de camas
                    if(totalQuartos == 0){
                        System.out.println("Cadastre um quarto antes de registrar uma cama!");
                        break;
                    }
                    for(int i = 0; i <totalQuartos; i++){
                        System.out.println("Informe a quantidade de camas do quarto"+ quarto[i]+": ");
                        cama[i] = sc.nextInt();
                        sc.nextLine();
                    }
                    System.out.println("Quantidade registrada!");
                break;
            case 3:// Reservar quarto
                    if(totalReservas>=maxReserva){
                        System.out.println("Limite de reservas atingido!");
                        break;
                    }

                    System.out.println("Informe o número do quarto: ");
                    String numQuarto = sc.nextLine();

                    int verQuarto = -1;
                    for(int i = 0; i < totalQuartos; i++){
                        if(quarto[i] != null && quarto[i].equalsIgnoreCase((numQuarto))){
                            verQuarto = i;
                            break;
                        }
                    }
                    if(verQuarto == -1){
                        System.out.println("Este quarto não existe.");
                    }else if(cama[verQuarto] <= 0) {
                        System.out.println("Não há camas disponíveis neste quarto!");
                    }else{
                        System.out.println("Informe o nome do hóspede: ");
                        String nomeHospede = sc.nextLine();

                        reservaNome[totalReservas] = nomeHospede;
                        reservaQuarto[totalReservas] = quarto[verQuarto];
                        cama[verQuarto]--;
                        totalReservas++;

                        System.out.println("Reserva realizada!");
                    }
                break;
            case 4: // Consultar reservas por quarto
                    System.out.println("Informe o número do quarto: ");
                    String quartoC = sc.nextLine();

                    boolean quartoExiste = false;
                    for(int i = 0 ; i < totalQuartos; i++){
                        if(quarto[i] != null && quarto[i].equalsIgnoreCase(quartoC)){
                            quartoExiste = true;
                            break;
                        }
                    }
                    if(!quartoExiste){
                        System.out.println("Este quarto não Existe");
                    }else{
                        boolean reserva = false;
                        for (int i = 0; i<totalReservas; i++){
                            if(reservaQuarto[i].equalsIgnoreCase(quartoC)){
                                System.out.println("Hóspede: "+reservaNome[i]);
                                reserva = true;
                            }
                        }
                        if(!reserva){
                            System.out.println("Não há reservas.");
                        }
                    }
                break;
            case 5:// Consultar reservas por hóspede
                    System.out.print("Informe o nome do hóspede: ");
                    String hospedeC = sc.nextLine();

                    boolean temHospede = false;
                    for (int i = 0; i < totalReservas; i++) {
                        if (reservaNome[i].equalsIgnoreCase(hospedeC)) {
                            System.out.println("Quarto reservado: " + reservaQuarto[i]);
                            temHospede = true;
                        }
                    }

                    if (!temHospede) {
                        System.out.println("Não há reservas para este hóspede!");
                    }
                break;
            case 6:
                System.out.println("Encerrado....");
                break;

            default:
                System.out.println("Opção Inválida.");
                break;
        }
    }
        sc.close();
    }
}
