package GUI;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class GUI {
    public static void main(String[]args) {
        ImageIcon fundo = new ImageIcon("Assets/mapa geral.png");
        Border border = BorderFactory.createLineBorder(Color.blue);

        JLabel label = new JLabel();
        label.setText("Olá, boas-vindas à 'Afundando: a saga de Giu e Lua'!");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(Color.WHITE);
        label.setIcon(fundo);
        label.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 20));
        label.setIconTextGap(10);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 800, 800);

        MyFrame frame = new MyFrame();
        frame.setLayout(null);
        frame.add(label);
    }
}
