import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class telaK {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JTree");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        DefaultMutableTreeNode raiz =
                new DefaultMutableTreeNode("The Java Series");

        DefaultMutableTreeNode java1 =
                new DefaultMutableTreeNode("Books for Java I");

        DefaultMutableTreeNode java2 =
                new DefaultMutableTreeNode("Books for Java II");

        DefaultMutableTreeNode livro1 =
                new DefaultMutableTreeNode("The Java Vir");

        DefaultMutableTreeNode livro2 =
                new DefaultMutableTreeNode("The Java La");

        java2.add(livro1);
        java2.add(livro2);

        raiz.add(java1);
        raiz.add(java2);

        JTree arvore = new JTree(raiz);

        panel.add(new JScrollPane(arvore));

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}