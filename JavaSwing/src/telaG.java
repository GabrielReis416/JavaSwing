import javax.swing.*;

public class telaG {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Item G");
        frame.setSize(600, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.add(new JLabel("Nome:"));

        JTextField txtNome = new JTextField(8);
        panel.add(txtNome);

        panel.add(new JLabel("Sexo:"));

        JRadioButton masculino = new JRadioButton("Masculino");
        JRadioButton feminino = new JRadioButton("Feminino");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(masculino);
        grupo.add(feminino);

        panel.add(masculino);
        panel.add(feminino);

        JButton btnEnviar = new JButton("Enviar");
        panel.add(btnEnviar);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}