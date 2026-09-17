public class Pix implements Pagamento {
    public void pagar(double valor){
        System.out.println("Pagamento via pix");
        System.out.println("Valor: R$"+valor);
    }

}
