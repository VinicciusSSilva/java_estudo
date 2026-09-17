public class Cliente extends Pessoa implements Pagamento {

    public Cliente(String nome) {
        super(nome);
    }
    
    public void pagar(double valor){
        System.out.println("Pagamento realizado: R$ "+valor);
    }

    public void comprar(String produto){
        System.out.println("Produto comprado: "+produto);
    }

    public void comprar(String produto, int quant){
        System.out.println("Produto comprado: "+produto+
                            "\nQuantidade: "
                            +quant);
    }

    public void comprar(String produto, int quant, double valor){
        System.out.println("Produto comprado: "+produto+
                            "\nQuantidade: "+quant+
                            "\nValor: R$"+valor+
                            "\nTotal: R$"+(quant*valor));
    }
}
