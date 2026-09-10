public class MetodoPoo {
    // sem parametro e sem retorno
    public static void mensagem() {
        System.out.println("Hello, World!");
    }


    //com parametroe e sem retorno
    public static void mostrarNome(String nome){
        System.out.println("Nome: "+nome);
    }

    // sem parametro e com retorno
    public static int obterNumero(){
        return 10;
    }


    // com parametro e com retorno
    public static int somar(int n1, int n2){
        return n1+n2;
    }


    // saidas
    public static void main(String[] args) {
        mensagem();

        mostrarNome("Vinicius");

        int numero = obterNumero();
        System.out.println("Numero: "+numero);

        int resultado = somar(10, 5);
        System.out.println("Resultado: "+resultado);

    }
}
