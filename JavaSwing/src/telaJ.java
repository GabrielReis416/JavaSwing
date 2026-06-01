import javax.swing.*;
import java.awt.*;

public class telaJ {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Progress...");
        frame.setSize(350, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 5, 5));

        JLabel lblTarefa = new JLabel("Running a Long Task");
        JLabel lblProgresso = new JLabel("Completed 43%.");

        JProgressBar barra = new JProgressBar(0, 100);
        barra.setValue(43);
        barra.setStringPainted(false);

        JButton btnCancelar = new JButton("Cancel");

        panel.add(lblTarefa);
        panel.add(lblProgresso);
        panel.add(barra);
        panel.add(btnCancelar);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}