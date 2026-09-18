package atividade;

public class Conta {
    private int numeroConta;
    private String titular;
    private double saldo;
    private Agencia agencia;
    

   

    public Conta(int numeroConta, String titular, double saldo, Agencia agencia) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
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
        System.out.printf("Depósito de R$ %.2f realizado com sucesso.\nSaldo atual R$ %.2f",valor, saldo);
    }

    public void consultarSaldo(){
        System.out.printf("Saldo atual: R$ %.2f\n", this.saldo);
    }

     
    public void mostrarDados() {
        System.out.println("\n=== DADOS DA CONTA ===");
        System.out.println(agencia.mostraDados());
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f\n", saldo);
    }
   

}
