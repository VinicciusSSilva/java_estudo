package model;

public class Cliente {
    private int codigo;
    private String nome;
    private String numero;
    private String email;

    public Cliente() {

    }

    public Cliente(int codigo, String nome, String numero, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.numero = numero;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
