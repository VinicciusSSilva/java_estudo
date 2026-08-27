public class Array {
    public static void main(String[] args) {
        int[] numero = new int[5]; // criando array com tamanho definido sem dados

        int quantidade = 5;
        int posicao = 0;

        numero[0] = 10; //adiciona na posição do array
        numero[1] = 20;
        System.out.println(numero[0]);
        for (int i = posicao; i < quantidade - 1; i++) {
            numero[i] = numero[i + 1];
        }
        System.out.println(numero[0]);

        for (int i = 0; i < quantidade; i++) {
            System.out.println(numero[i]);
        }
        
        quantidade--;

    }
}
