package atividade_4;

public class CursoPresencial extends Curso implements Matricula {
    protected String sala;
    protected String turno;

    public CursoPresencial(int codigo, String nome, int cargaHoraria, double valor, String sala, String turno) {
        super(codigo, nome, cargaHoraria, valor);
        this.sala = sala;
        this.turno = turno;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSala: " + getSala() +
                "\nTurno: " + getTurno();
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