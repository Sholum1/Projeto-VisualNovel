package GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class Fuga_Carangueijo {
    

    public void rodaConversaFugaCaranguejos(MyFrame frame) {
		String[] out = {"<html>&emsp;&ensp;Flanders olha para Giu em acordo <htmml>"+
		"e os dois nadam rapidamente na direção oposta,<br>&ensp;ouvindo os gritos do<html>"+
		"<html> Carangueijo Marujo e deixando a oportunidade de chegar à<br>&ensp;costa mais rápido pra trás.<html>",
		"<html>&emsp;&ensp;Após horas nadando, bolhas se aproximam do peixe e da humana.<html>"+
		"<br>&emsp;&ensp;Uma flecha de água os atravessa!<html>"};
		//pensar como colocar um botão aqui
	
		ImageIcon fundo = new ImageIcon("Assets/mapa carangueijo boss corais.png");
		ImageIcon giu = new ImageIcon("Assets/giu in game rotacionado.png");
		ImageIcon flanders = new ImageIcon("Assets/mini_flnaders.png");
		ImageIcon caranguejoFundo = new ImageIcon("Assets/carangueijo marujo.png");
    
		JLabel caranguejoLonge = new JLabel();
		caranguejoLonge.setIcon(caranguejoFundo);
		caranguejoLonge.setVerticalAlignment(JLabel.CENTER);
		caranguejoLonge.setHorizontalAlignment(JLabel.CENTER);
		caranguejoLonge.setBounds(-300, 0, 1350, 1010);
	
		JLabel flandersLonge = new JLabel();
		flandersLonge.setIcon(flanders);
		flandersLonge.setVerticalAlignment(JLabel.CENTER);
		flandersLonge.setHorizontalAlignment(JLabel.CENTER);
		flandersLonge.setBounds(360, -10, 1350, 1010);
	
		JLabel giuFundo = new JLabel();
		giuFundo.setIcon(giu);
		giuFundo.setVerticalAlignment(JLabel.CENTER);
		giuFundo.setHorizontalAlignment(JLabel.CENTER);
		giuFundo.setBounds(870, 0, 1350, 1010);
	
		JLabel label = new JLabel();
		label.setIcon(fundo);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0, 0, 1350, 1010);
	
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(1350, 1010));
		contentPane.add(caranguejoLonge);
		contentPane.add(flandersLonge);
		contentPane.add(giuFundo);
		contentPane.add(label);
    }
}


