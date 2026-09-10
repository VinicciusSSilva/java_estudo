public class CamisaApp {
    public static void main(String[] args) {
        Camisa c1 = new Camisa("Vermelha","G","polo");
        Camisa c2 = new Camisa("Verde","XGG","oversized");

        System.out.println("====Primeira camisa====\nCor: "+c1.getCor()+"\nTamanho: "+c1.getTamanho()+"\nTipo: "+c1.getTipo());
        System.out.println();
        System.out.println("====Segunda camisa====\nCor: "+c2.getCor()+"\nTamanho: "+c2.getTamanho()+"\nTipo: "+c2.getTipo());

        c2.setTamanho("M");
        c1.setCor("Branca");

        System.err.println("\n******Pós Alterações*********\n");

        System.out.println("====Primeira camisa====\nCor: "+c1.getCor()+"\nTamanho: "+c1.getTamanho()+"\nTipo: "+c1.getTipo());
        System.out.println();
        System.out.println("====Segunda camisa====\nCor: "+c2.getCor()+"\nTamanho: "+c2.getTamanho()+"\nTipo: "+c2.getTipo());
    }
}
