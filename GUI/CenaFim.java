package GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class CenaFim {

    //ultima cena do jogo
    public void rodaConversa(MyFrame frame) {
		String[] out = {"<html>&emsp;&ensp;Após dormir sob os destroços do barco, a lua ao lado de Giu sobe aos céus da noite, que antigamente era apenas escuridão e um grande brilho preenche o céu.\r\n" + //
                        "                enfim Giu acorda na areia da praia, com os olhos marejados...<html>"};
		//pensar como colocar um botão aqui
	
		ImageIcon fundo = new ImageIcon("Assets/quadro lua.png");

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


    
}
