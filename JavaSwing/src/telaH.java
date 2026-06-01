import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class telaH {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Item H");
        frame.setSize(700, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        String[] colunas = {
                "Código",
                "Produto",
                "Descrição"
        };

        Object[][] dados = {
                {"1123", "Pendrive", "Pendrive 32GB"},
                {"2323", "HD SSD", "256 GB"},
                {"3333", "Memória RAM", "16GB"},
                {"2344", "CPU", "i7"}
        };

        JTable tabela = new JTable(
                new DefaultTableModel(dados, colunas)
        );

        JScrollPane scroll = new JScrollPane(tabela);

        panel.add(scroll);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}