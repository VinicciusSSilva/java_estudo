package atividade_4;

public class Curso {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private double valor;

    public Curso(int codigo, String nome, int cargaHoraria, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.valor = valor;
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "========== DADOS DO CURSO ==========" +
                "\nCódigo: " + getCodigo() +
                "\nNome: " + getNome() +
                "\nCarga Horária: " + getCargaHoraria() + "h" +
                "\nValor: R$ " + getValor();
    }
}