package atividade;

public class ContaCorrente extends Conta {
    protected double dinheiro;
    protected double pix;
    protected double cartao;
    
    public ContaCorrente(String nomeAgencia, int numeroAgencia, int numeroConta, String nomeConta, double saldo,
            double dinheiro, double pix, double cartao) {
        super(nomeAgencia, numeroAgencia, numeroConta, nomeConta, saldo);
        this.dinheiro = dinheiro;
        this.pix = pix;
        this.cartao = cartao;
    }
    
}
