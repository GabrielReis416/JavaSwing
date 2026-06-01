import javax.swing.*;

public class telaA {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Item A");
        frame.setSize(700, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Interface gráfica com Java Swing"));

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}