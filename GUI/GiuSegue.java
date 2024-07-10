package GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class GiuSegue {
    public void rodaConversa(MyFrame frame) {
        String[] out = {"<html>&emsp;&ensp;Nadando pelo mar, Giu vê um peixe<html>"+
        "<html> rápido, vermelho e preto.<br><html>"+
        "<hmtl>&emsp;&ensp;Um estalo de memórias com Luna volta como um<html>"+
        "<html> grande peso em sua cabaça.<html>",
        "<html>&emsp;&ensp;Seria ela? Nadando livremente no mar?<html>",
        "<html>&emsp;&ensp;[GIU] Ei! Volte aqui!<html>"};
        //pensar como colocar um botão aqui


    ImageIcon fundo = new ImageIcon("Assets/mapa geral.png");
    ImageIcon giu = new ImageIcon("Assets/giu in game frente.png");
    ImageIcon flanders = new ImageIcon("Assets/mini_flnaders.png");

    JLabel flandersLonge = new JLabel();
    flandersLonge.setIcon(flanders);
    flandersLonge.setVerticalAlignment(JLabel.CENTER);
    flandersLonge.setHorizontalAlignment(JLabel.CENTER);
    flandersLonge.setBounds(-600, 100, 1350, 1010);

    JLabel giuFundo = new JLabel();
    giuFundo.setIcon(giu);
    giuFundo.setVerticalAlignment(JLabel.CENTER);
    giuFundo.setHorizontalAlignment(JLabel.CENTER);
    giuFundo.setBounds(0, 0, 1350, 1010);

    JLabel label = new JLabel();
    label.setIcon(fundo);
    label.setVerticalAlignment(JLabel.CENTER);
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setBounds(0, 0, 1350, 1010);

    JPanel contentPane = new JPanel(null);
    contentPane.setPreferredSize(new Dimension(1350, 1010));
    contentPane.add(flandersLonge);
    contentPane.add(giuFundo);
    contentPane.add(label);
    }

}
