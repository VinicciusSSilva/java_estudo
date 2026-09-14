import java.util.ArrayList;

public interface ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
          // adicionar

    numeros.add(1);
    numeros.add(20);
    numeros.add(30);

    //Listar

        System.out.println("Lista: ");
        for (int n: numeros){
            System.out.println(n);
        }


    //Alterar

    numeros.set(1,55);
    
    //Remover

    numeros.remove(0);
}
}
