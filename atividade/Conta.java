package atividade;

public class Conta extends Agencia {
    private int numeroConta;
    private String titular;
    private double saldo;

    

    public Conta(String nomeAgencia, int numeroAgencia, int numeroConta, String titular, double saldo) {
        super(nomeAgencia, numeroAgencia);
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setNomeConta(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("O Valor do depósito deve ser maior que R$0,00");
            return;

        }
        this.saldo += valor;
        System.out.println("Depósito de R$"+valor+" realizado com sucesso.\nSaldo atual R$"+saldo);
    }

    public void consultarSaldo(String saldo){
        System.out.printf("Saldo atual: R$ %.2f\n", this.saldo);
    }

    @Override 
    public String mostrarDados() {
        System.out.println("\n=== DADOS DA CONTA ===");
        System.out.println(Agencia.mostraDados());
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f\n", saldo);
    }
   

}
