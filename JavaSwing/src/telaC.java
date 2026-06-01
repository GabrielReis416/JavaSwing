import javax.swing.*;

public class telaC {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Item C");
        frame.setSize(800, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JLabel lblResumo = new JLabel(
                "Faça um resumo de suas atividades profissionais:"
        );

        JTextArea txtResumo = new JTextArea(6, 20);
        JScrollPane scroll = new JScrollPane(txtResumo);

        panel.add(lblResumo);
        panel.add(scroll);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}