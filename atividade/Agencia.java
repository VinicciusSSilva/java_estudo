package atividade;

public class Agencia {
    private String nomeAgencia;
    private int numeroAgencia;
    public Agencia(String nomeAgencia, int numeroAgencia) {
        this.nomeAgencia = nomeAgencia;
        this.numeroAgencia = numeroAgencia;
    }
    public String getNomeAgencia() {
        return nomeAgencia;
    }
    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }
    public int getNumeroAgencia() {
        return numeroAgencia;
    }
    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }
    public String mostraDados() {
        return "Agência: " + nomeAgencia + " - " + numeroAgencia;
    }

    
}
