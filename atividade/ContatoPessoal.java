package atividade;

public class ContatoPessoal extends Contato {
    
    private String parentesco;
    public ContatoPessoal(String nome, String numero, String tipo, String parentesco) {
        super(nome, numero,tipo);
        this.parentesco = parentesco;
    }
    
    public String getParentesco() {
        return parentesco;
    }
    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
    @Override
    public String toString() {
        return "Nome : "+getNome() + "\nNúmero: " + getNumero() +"\nTipo: "+getTipo()+ "\nParentesco: " + parentesco ;
    }
    
    
}
