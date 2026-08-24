    package aula5;

    import java.util.Scanner;

    public class Q6 {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int op = 0;
            while(op != 3){
                System.out.println("\n =====Menu====");
                System.out.println("1-Calculadora");
                System.out.println("2-Regressiva");
                System.out.println("3-Sair");
                System.out.println("Escolha uma opção");

                op = sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("=====Calculadora=====");
                        System.out.println("Informe o número:");
                        int numero = sc.nextInt();

                        for(int i=1;i<=10;i++){
                                System.out.println("Tabuada do "+numero+" por "+i);
                                System.out.println(numero+" x "+i+" = "+(numero*i));
                                System.out.println(numero+" + "+i+" = "+(numero+i));
                                System.out.println(numero+" - "+i+" = "+(numero-i));
                                System.out.println(numero+" / "+i+" = "+((double)numero/i));
                            };
                            
                
                    break;
                    case 2:
                        System.out.println("Informe o número:");
                        int inicio = sc.nextInt();
                        
                            for(int i = inicio; i >= 0; i--){
                            System.out.println(i);
                            };
                    break;
                    case 3:
                        System.out.println("saindo..");
                    break;
                    default:
                        System.out.println("Opção Inválida");
                        break;
                }
            
            } sc.close();
            
    }
}

