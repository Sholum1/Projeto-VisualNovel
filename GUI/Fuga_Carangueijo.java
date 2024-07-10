package GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class Fuga_Carangueijo {
    

    public void rodaConversaFugaCaranguejos(MyFrame frame) {
		String[] out = {"<html>&emsp;&ensp;flanders olha para Giu em acordo e os dois nadam rapidamente na direção oposta, ouvindo os gritos do Carangueijo Marujo e deixando a oportunidade de chegar a costa mais rápido pra tras.<html>"+
		"<html> pós horas nadando, bolhas se aproximam do peixe e da humana <br>&ensp;e uma flecha de água os atravessa!<html>"};
		//pensar como colocar um botão aqui
	
		ImageIcon fundo = new ImageIcon("Assets/mapa geral.png");

	
		
	
		JLabel label = new JLabel();
		label.setIcon(fundo);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0, 0, 1350, 1010);
	
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(1350, 1010));
	
		contentPane.add(label);
    }
}


