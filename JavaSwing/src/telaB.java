import javax.swing.*;

public class telaB {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Item B");
        frame.setSize(700, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField(25);

        panel.add(lblNome);
        panel.add(txtNome);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}