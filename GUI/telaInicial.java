package GUI;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

/*
 * JFrame: janela de GUI para adicionar componentes
 * 
 * JLabel: área de display para um texto, imagem, ou ambos
 * 
 * JPanel : container para armazenar outros componentes
 */


public class telaInicial {
    public static void main(String[]args) {

        ImageIcon fundo = new ImageIcon("Assets/pixil-frame.png");

        Border border = BorderFactory.createLineBorder(Color.white, 5, true);

        JPanel textBox = new JPanel();
        textBox.setBackground(new Color(234, 235, 188));
        textBox.setBounds(0, 400, 1350, 200);


        JLabel label = new JLabel(); //criando um label
        label.setText("Boas-vindas a 'Afundando: a saga de Giu e Lua'"); //adiciona o texto à label
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(new Color(255, 255, 255));
        label.setFont(new Font(Font.MONOSPACED, Font.BOLD, 35));
        label.setIcon(fundo);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //fixa a posição vertical de icon+text dentro do label
        label.setHorizontalAlignment(JLabel.CENTER); //fixa a posição horizontal de icon+text dentro do label
        label.setBounds(0, 0, 1350, 1010); //determina as posições x e y dentro da janela, além das dimensões do label
        //label.setBackground(Color.BLACK); se o texto não estivesse em cima da imagem, iria settar a cor do fundo do label
        //label.setOpaque(true); se o texto não estivesse em cima da imagem, iria settar a cor do fundo do label
        //label.setIconTextGap(); //se o texto não estivesse em cima da imagem, iria settar a distância até ela

        MyFrame frame = new MyFrame(); //criando uma janela a partir de uma classe filha de JFrame
        frame.setLayout(null);
        frame.add(label);
        label.add(textBox);
        //frame.pack(); faz com que o tamanho da janela se ajuste ao espaço ocupado pelos componentes do label
    }
}

