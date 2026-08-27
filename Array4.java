import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] nomes = new String[3];
        //adicionando via Scanner
        for(int i=0;i<nomes.length;i++){
            System.out.println("Informe o nomes: ");
            nomes[i] = sc.nextLine();
        }
        //System.out.println("Os nomes cadastrados são "+nomes);//nao funfa assim

        System.out.println("Os nomes cadastrados são ");
        for(String nome:nomes){
            System.out.println(nome);
        }
        //pode ser assim
        for(int i=0;i<nomes.length;i++){
            System.out.println(nomes[i]);
        };
        

        sc.close();
    }
}
