import javax.swing.*;

public class telaD {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Item D");
        frame.setSize(600, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.add(new JLabel("Cores preferidas:"));

        panel.add(new JCheckBox("Azul"));
        panel.add(new JCheckBox("Preto"));
        panel.add(new JCheckBox("Amarelo"));
        panel.add(new JCheckBox("Verde"));

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}