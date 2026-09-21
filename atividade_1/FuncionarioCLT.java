
package atividade_1;
public class FuncionarioCLT extends Funcionario implements Pagamento {
    
    protected double bonus;
    public FuncionarioCLT(String nome, String cpf, double salario, double bonus) {
        super(nome, cpf, salario);
        this.bonus = bonus;
    }
   
    
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public double calcPagamento(){
        return getSalario();
    }

    public double calcPagamento(double bonus){
        return getSalario()+bonus;
    }
}
