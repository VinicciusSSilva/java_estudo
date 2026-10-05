import java.io.FileWriter;
import java.io.IOException;


public class Ex04 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("dados.txt");
            fw.write("primeira linha\n"+
                    "segunda linha\n"+
                    "terceira linha\n"+
                    "quarta linha\n"+
                    "quinta linha\n");
            fw.close();
            System.out.println("Escrita concluída");
        }catch(IOException e){
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
    }
}
