import javax.swing.JOptionPane;

public class AtividadeSwing {
    public static void main(String[] args) {

        // Atividade 1 - Nome
        String nome = JOptionPane.showInputDialog("Digite seu nome:");

        if (nome == null) {
            JOptionPane.showMessageDialog(null, "Operação cancelada.");
            return;
        }

        // Atividade 2 - Gosta de programar?
        int resposta = JOptionPane.showConfirmDialog(
                null,
                nome + ", você gosta de programar?",
                "Pergunta",
                JOptionPane.YES_NO_CANCEL_OPTION
        );

        // Atividade 3 - Resposta
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                    "Então estude bem Java Swing. Ele pode abrir várias portas para você.");
        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null,
                    "Que pena. Mas com as janelas você vai gostar.");
        } else {
            JOptionPane.showMessageDialog(null, "Você cancelou.");
        }

        // Atividade 4 - Pergunta sobre objetos (opções personalizadas)
        String[] opcoes = {
                "Sim - Objeto é legal",
                "Não - Objeto é sofrimento",
                "Talvez - Quero aprender"
        };

        int escolha = JOptionPane.showOptionDialog(
                null,
                "Lembrete: aqui no Java Swing tudo é objeto. Você gosta disso?",
                "Pergunta sobre Objetos",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );

        // Atividade 5 - Respostas
        if (escolha == 0) {
            JOptionPane.showMessageDialog(null,
                    "Ótimo, todos os componentes são objetos.");
        } else if (escolha == 1) {
            JOptionPane.showMessageDialog(null,
                    "Não se preocupe. Agora você irá aprender a importância dos objetos.");
        } else if (escolha == 2) {
            JOptionPane.showMessageDialog(null,
                    "Sim, você aprenderá.");
        }
    }
}