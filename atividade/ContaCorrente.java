package atividade;

public class ContaCorrente extends Conta implements Pagamento{

    

    public ContaCorrente(int numeroConta, String titular, double saldo, Agencia agencia) {
        super(numeroConta, titular, saldo, agencia);
    }
    private boolean validarPag(double valor){
        if (valor <= 0){
            System.out.println("O Valor deve ser maior que R$ 0,00");
            return false;
        }
        if (valor > getSaldo()){
            System.out.println("Valor insuficiente para realizar o procedimento");
            return false;
        }
        return true;
    }
    @Override 
    
    //dinheiro
    public void pagar(double valor){
        if(validarPag(valor)){
            setSaldo(getSaldo()-valor);
            System.out.println("Pagamento realizado com sucesso");
            consultarSaldo();
        }
    }
    //pix
    public void pagar(double valor, String chavePix){
        if(validarPag(valor)){
            setSaldo(getSaldo()-valor);
            System.out.println("Pix realizado para "+chavePix);
            consultarSaldo();
        }

    }
    //cartão
    public void pagar(double valor, int parcelas){
        if(parcelas <= 0){
            System.out.println("O número de parcelas deve ser maior 0!");
            return;
        }
        if(validarPag(valor)){
            double valorParcela = valor/parcelas;
            setSaldo(getSaldo()-valor);
            System.out.printf("Pagamento realizado! Parcelado em %dx de %.2f\n",parcelas,valorParcela);
            consultarSaldo();
        }
    }
    //tranferencia
    public void transfer(int destino, double valor){
        if(validarPag(valor)){
            setSaldo(getSaldo()-valor);
            System.out.println("Transferencia realizada!");
            consultarSaldo();
        }
    }
}

