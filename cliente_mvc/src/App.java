import view.ClienteView;
import javax.swing.SwingUtilities;

public class App {

    public static void main(String[] args) {
        // Executa a interface gráfica na Event Dispatch Thread (boa prática do Swing)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Instancia e torna visível a janela ClienteView
                ClienteView tela = new ClienteView();
                tela.setVisible(true);
            }
        });
    }
}