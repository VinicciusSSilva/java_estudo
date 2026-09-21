package atividade_1;

public class FuncionarioFreelancer extends Funcionario implements Pagamento {
    protected int hrTrab;
    protected double bonus;

    public FuncionarioFreelancer(String nome, String cpf, double salario, int hrTrab) {
        super(nome, cpf, salario);
        this.hrTrab = hrTrab;
    }

    public int getHrTrab() {
        return hrTrab;
    }

    public void setHrTrab(int hrTrab) {
        this.hrTrab = hrTrab;
    }
    @Override 
    public double calcPagamento(){
        return  getSalario()*getHrTrab();
       
    }
    public double calcPagamento(double bonus){
        return (getSalario()*getHrTrab()+bonus);
    }
    
}
