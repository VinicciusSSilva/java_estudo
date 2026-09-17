public class CalculadoraApp {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.somar(10, 5));
        System.out.println(calc.somar(15, 20, 60));
        System.out.println(calc.somar(10.8, 11.9));
    }
}
