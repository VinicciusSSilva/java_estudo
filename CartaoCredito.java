public class CartaoCredito implements Pagamento {
        public void pagar(double valor){
        System.out.println("Pagamento via Crédito");
        System.out.println("Valor: R$"+valor);
        }    
}
