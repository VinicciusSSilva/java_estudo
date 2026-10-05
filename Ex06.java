import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ex06 {
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("dados.txt",true));
            bw.write("sexta linha");
            bw.newLine();
            bw.write("setima linha");
            bw.close();
            System.out.println("Escrita concluída");
        }catch(Exception e){
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
        
    }
}
