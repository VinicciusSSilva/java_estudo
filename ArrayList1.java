import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
    ArrayList<String> nomes = new ArrayList<>();

    // adicionar

    nomes.add("Ana");
    nomes.add("Carlos");
    nomes.add("Marcos");

    //Listar

        System.out.println("Lista: ");
        for (String nome: nomes){
            System.out.println(nome);
        }


    //Alterar

    nomes.set(1,"joao");
    
    //Remover

    nomes.remove(0);
}
}
