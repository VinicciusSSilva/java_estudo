public class Pessoa{
    protected String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void mostrarDados(){
        System.out.println("Nome: "+nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}