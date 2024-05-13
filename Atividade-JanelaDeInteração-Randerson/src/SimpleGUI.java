import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI extends JFrame {
    private JLabel label;
    private JButton button;

    public SimpleGUI() {
        setTitle("A Melhor Interface do Planeta");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criando um rótulo
        label = new JLabel("Janela Interativa!!!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);


        // Criando um botão
        button = new JButton("Clique no botão");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(SimpleGUI.this, "Você clicou no botão... Parábens isso foi muito difícil!");
            }
        });
        add(button, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleGUI();
    }
}