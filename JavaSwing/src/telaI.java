import javax.swing.*;

public class telaI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Item I");
        frame.setSize(250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        String[] itens = {
                "one",
                "two",
                "three",
                "four",
                "five"
        };

        JList<String> lista = new JList<>(itens);

        JScrollPane scroll = new JScrollPane(lista);
        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS
        );

        panel.add(scroll);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}