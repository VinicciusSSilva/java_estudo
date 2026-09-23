package atividade_3;

public class ProdutoDigital extends Produto implements Venda {

    protected int quant;

    public ProdutoDigital(int codigo, String nome, double preco, int quant) {
        super(codigo, nome, preco);
        this.quant = quant;

    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }


    

    @Override
    public String toString() {
        return 
        "==========DADOS DO PRODUTO==========="+
                "\nNome: "+getNome()+
                "\nCódigo"+getCodigo()+
                "\nPreço: R$"+ getPreco();
    }

    @Override
    public double venda() {
        return (getPreco() * getQuant());
    };

    public double venda(double desconto) {
        return ((getPreco() * getQuant())) - desconto;
    }



}
