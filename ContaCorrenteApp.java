public class ContaCorrenteApp {
    public static void main(String[] args) {
        ContaCorrente contaComum = new ContaCorrente(22, 333);
        ContaCorrente contaPremium = new ContaCorrente(17, 1212 , 1000);


        System.out.println(contaComum);
        System.out.println(contaPremium);
    }
}
