import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class HelloSwingTela{

       
    public static void criarTela() {
    JFrame tela = new JFrame (" Ali e Madu - The Best Web");
    tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel mensagem1 = new JLabel (" Hello Word!");
    Container PainelDeConteudo = tela.getContentPane();
    PainelDeConteudo.add(mensagem1);
    tela.pack();
    tela.setVisible(true);
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> {
         criarTela();
      });
   }
}
   