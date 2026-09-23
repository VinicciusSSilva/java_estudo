package atividade_5;

public class PedidoLocal extends Pedido implements Pagamento {

    public PedidoLocal(int numeroPedido, String nomeCliente, double valorPedido) {
        super(numeroPedido, nomeCliente, valorPedido);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de Pedido: Local";
    }

    @Override
    public double pagar(double valor) {
        return valor;
    }

    @Override
    public double pagar(double valor, String chavePix) {
        return valor;
    }

    @Override
    public double pagar(double valor, int parcelas) {
        return valor;
    }
}