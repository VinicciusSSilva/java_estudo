package atividade_4;

public class CursoOnline extends Curso implements Matricula {
    protected String plataforma;
    protected String codigoAcesso;

    public CursoOnline(int codigo, String nome, int cargaHoraria, double valor, String plataforma, String codigoAcesso) {
        super(codigo, nome, cargaHoraria, valor);
        this.plataforma = plataforma;
        this.codigoAcesso = codigoAcesso;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getCodigoAcesso() {
        return codigoAcesso;
    }

    public void setCodigoAcesso(String codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPlataforma: " + getPlataforma() +
                "\nCódigo de Acesso: " + getCodigoAcesso();
    }

    @Override
    public double matricular() {
        return getValor();
    }

    @Override
    public double matricular(double desconto) {
        return getValor() - desconto;
    }
}