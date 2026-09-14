package atividade;

public class Contato {
    private String nome;
    private String numero;
    private String tipo;

    public Contato(String nome, String numero, String tipo) {
        this.nome = nome;
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Nome=" + nome + "- Numero:" + numero;
    }

}
