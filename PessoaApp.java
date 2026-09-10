public class PessoaApp {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Roberto"); 
        Pessoa p2 = new Pessoa(2,"Carla");

        System.out.println("O nome é: "+p1.getNome()+ "\nO código é: "+ p1.getCodigo());

        p1.setNome("Rivaldo");
        System.out.println("O nome é: "+p1.getNome()+ "\nO código é: "+ p1.getCodigo());



        
        System.out.println("O nome é: "+p2.getNome()+ "\nO código é: "+ p2.getCodigo());

        p2.setNome("Sophia");
        System.out.println("O nome é: "+p2.getNome()+ "\nO código é: "+ p2.getCodigo());
    }
    }

