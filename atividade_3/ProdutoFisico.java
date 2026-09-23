package atividade_3;

public class ProdutoFisico extends Produto implements Venda {
    protected double frete;
    protected int quant;

    
 
    public ProdutoFisico(int codigo, String nome, double preco, double frete, int quant) {
        super(codigo, nome, preco);
        this.frete = frete;
        this.quant = quant;
    }
    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    };
    
    
    @Override
    public String toString() {
        return 
            "==========DADOS DO PRODUTO==========="+
                "\nNome: "+getNome()+
                "\nCódigo"+getCodigo()+
                "\nPreço: R$ "+ getPreco()+
                "\nValor frete:R$ "+getFrete();
            }
    @Override 
    public double venda(){
        return (getPreco()*getQuant())+getFrete();
    };
    public double venda(double desconto){
        return ((getPreco()*getQuant())+getFrete())-desconto;
    }

}
