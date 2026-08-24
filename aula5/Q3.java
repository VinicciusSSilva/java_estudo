package aula5;

public class Q3 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%2!=0 && i<52){
                System.out.println("os números impares até 51 são: "+i);
            }
             if(i%2==0 && i>51){
                System.out.println("os números pares apartir de 52 são: "+i);
            }
        }
    }
}
