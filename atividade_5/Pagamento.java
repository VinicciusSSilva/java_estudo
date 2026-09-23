package atividade_5;

public interface Pagamento {
    public double pagar(double valor);
    public double pagar(double valor, String chavePix);
    public double pagar(double valor, int parcelas);
}