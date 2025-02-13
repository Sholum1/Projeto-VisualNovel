package GUI;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

/*
 * JFrame: janela de GUI para adicionar componentes
 * 
 * JLabel: área de display para um texto, imagem, ou ambos
 * 
 * JPanel : container para armazenar outros componentes
 */


public class TelaInicial {
    public void rodaTelaInicial(MyFrame frame) {

        ImageIcon mapaGeral = new ImageIcon("Assets/mapa geral.png");

        Border border = BorderFactory.createLineBorder(new Color(255, 176, 120), 12, false);

        //JPanel textBox = new JPanel();
        //textBox.setBackground(new Color(234, 235, 188));
        //textBox.setBounds(0, 400, 1350, 200);

	JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(1350, 1010));

        JLabel label = new JLabel(); //criando um label
        label.setIcon(mapaGeral);
        label.setVerticalAlignment(JLabel.CENTER); //fixa a posição vertical de icon+text dentro do label
        label.setHorizontalAlignment(JLabel.CENTER); //fixa a posição horizontal de icon+text dentro do label
        label.setBounds(0, 0, 1350, 1010); //determina as posições x e y dentro da janela, além das dimensões do label
        //label.setBackground(Color.BLACK); se o texto não estivesse em cima da imagem, iria settar a cor do fundo do label
        //label.setOpaque(true); se o texto não estivesse em cima da imagem, iria settar a cor do fundo do label
        //label.setIconTextGap(); //se o texto não estivesse em cima da imagem, iria settar a distância até ela

        JLabel titulo = new JLabel();
        titulo.setBackground(new Color(235, 217, 188));
        titulo.setBounds(40, 350, 1250, 180);
        titulo.setText("Boas-vindas a 'Afundando: a saga de Giu e Lua'"); //adiciona o texto à label
        titulo.setHorizontalTextPosition(JLabel.CENTER);
        titulo.setVerticalTextPosition(JLabel.CENTER);
        titulo.setForeground(new Color(29, 60, 144));
        titulo.setFont(new Font(Font.MONOSPACED, Font.BOLD, 42));
        titulo.setVerticalAlignment(JLabel.CENTER);
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setBorder(border);
        titulo.setOpaque(true);

        JLabel sombra = new JLabel();
        sombra.setBackground(new Color(242, 112, 5));
        sombra.setBounds(60, 370, 1250, 180);
        sombra.setVerticalAlignment(JLabel.CENTER);
        sombra.setHorizontalAlignment(JLabel.CENTER);
        sombra.setOpaque(true);

        MyLabel cenaLua = new MyLabel(frame);
        cenaLua.setBounds(0, 0, 1350, 1010);

	contentPane.add(cenaLua);
	contentPane.add(label);
	contentPane.add(titulo);
	contentPane.add(sombra);
	frame.setContentPane(contentPane);
        frame.setLayout(null);
        // frame.add(label);
        label.add(titulo);
        label.add(sombra);
        // frame.add(cenaLua);
        //label.setVisible(false);
	frame.pack();
	frame.setVisible(true);

        //frame.pack(); faz com que o tamanho da janela se ajuste ao espaço ocupado pelos componentes do label
    }
}

