package GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class CarnguejoMarujo {
        public void rodaConversa(MyFrame frame) {
            String[] out = {"<html>&emsp;&ensp;Flanders e Giu nadam pelas águas<html>"+
            "<html> pouco iluminadas, tentando achar uma saída<br>&ensp;para ela. No <html>"+
            "<html>entanto, Flanders está tão perdido quanto a garota.<html>",
            "<html>&emsp;&ensp;O azul do mar se mistura com uma sombra de<html>"+
            "<html> quatro patas e um pequeno chapéu<br>&ensp;na cabeça.<html>"};
            //pensar como colocar um botão aqui
        
            ImageIcon fundo = new ImageIcon("Assets/mapa carangueijo boss corais.png");
            ImageIcon giu = new ImageIcon("Assets/giu in game.png");
            ImageIcon flanders = new ImageIcon("Assets/mini_flnaders.png");
            ImageIcon caranguejoFundo = new ImageIcon("Assets/carangueijo marujo.png");
    
            JLabel caranguejoLonge = new JLabel();
            caranguejoLonge.setIcon(caranguejoFundo);
            caranguejoLonge.setVerticalAlignment(JLabel.CENTER);
            caranguejoLonge.setHorizontalAlignment(JLabel.CENTER);
            caranguejoLonge.setBounds(-700, 0, 1350, 1010);
        
            JLabel flandersLonge= new JLabel();
            flandersLonge.setIcon(flanders);
            flandersLonge.setVerticalAlignment(JLabel.CENTER);
            flandersLonge.setHorizontalAlignment(JLabel.CENTER);
            flandersLonge.setBounds(320, 10, 1350, 1010);
        
            JLabel giuFundo = new JLabel();
            giuFundo.setIcon(giu);
            giuFundo.setVerticalAlignment(JLabel.CENTER);
            giuFundo.setHorizontalAlignment(JLabel.CENTER);
            giuFundo.setBounds(50, 0, 1350, 1010);
        
            JLabel label = new JLabel();
            label.setIcon(fundo);
            label.setVerticalAlignment(JLabel.CENTER);
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setBounds(0, 0, 1350, 1010);
        
            JPanel contentPane = new JPanel(null);
            contentPane.setPreferredSize(new Dimension(1350, 1010));
        
            contentPane.add(giuFundo);
            contentPane.add(flandersLonge);
            contentPane.add(caranguejoLonge);
            contentPane.add(label);
    }
}
