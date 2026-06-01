import javax.swing.*;

public class telaF {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Item F");
        frame.setSize(600, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton btnCancelar = new JButton("Cancelar");
        JButton btnSalvar = new JButton("Salvar");
        JButton btnEnviar = new JButton("Enviar");

        panel.add(btnCancelar);
        panel.add(btnSalvar);
        panel.add(btnEnviar);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}