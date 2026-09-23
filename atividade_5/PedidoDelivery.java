package atividade_5;

public class PedidoDelivery extends Pedido implements Pagamento {
    protected String endereco;
    protected double taxaEntrega;

    public PedidoDelivery(int numeroPedido, String nomeCliente, double valorPedido, String endereco, double taxaEntrega) {
        super(numeroPedido, nomeCliente, valorPedido);
        this.endereco = endereco;
        this.taxaEntrega = taxaEntrega;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo de Pedido: Delivery" +
                "\nEndereço: " + getEndereco() +
                "\nTaxa de Entrega: R$ " + getTaxaEntrega();
    }

    @Override
    public double pagar(double valor) {
        return valor + getTaxaEntrega();
    }

    @Override
    public double pagar(double valor, String chavePix) {
        return valor + getTaxaEntrega();
    }

    @Override
    public double pagar(double valor, int parcelas) {
        return valor + getTaxaEntrega();
    }
}