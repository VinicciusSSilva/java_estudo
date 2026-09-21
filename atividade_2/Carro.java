package atividade_2;

public class Carro extends Veiculo implements Aluguel {
    protected String tipo;

    public Carro(String placa, String modelo, int ano, double valorDiaria, String tipo) {
        super(placa, modelo, ano, valorDiaria);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo +"\nPlaca: " + getPlaca() + "\nModelo: " + getModelo() + "\nAno: " + getAno() + "\nValor da diária: R$" + getValorDiaria();
    }
    
    @Override 
    public double valorAluguel(int dias){
        return getValorDiaria()*dias;
    }
    
    public double valorAluguel(int dias, double desconto){
        return getValorDiaria()*dias - desconto;
    };
}
