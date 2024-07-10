package GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
public class PolvoRendido {
    



    public void rodaConversa(MyFrame frame) {
		String[] out = {"<html>&emsp;&ensp;[POLVO]: polvo: covarde! me dê o mesmo destino dela! pise em meu corpo sem vida assim como pisa no dela, enquanto tenta a trazer de volta!\r\n" + 
                        "                você não engana a mim! você não quer chegar a costa, só quer fugir e afundar cada vez nesse mar.\r\n" + 
                        "                me mate e me deixe afundar como ela!<html>"+
		"<html>tomada de raiva por invadir suas memorias de Luna com cenas horriveis e por desrespeitá-la mesmo não estando em vida, Giu ergue a espada e perfura o coração do polvo... que aos poucos afunda no mar, até se perder de vista.<html>"+
        "<html>após matar alguem com as próprias mãos, Giu cai em lágrimas. afinal, esta ali nadando em meio a saudade da perda de Luna, enquanto acaba de tirar a vida de um polvo.\r\n<html>" + 
                        "<html>por que decidiu matar alguem?\r\n<html>" + 
                        "<html>por que eta tão injusto a vida tirar Luna de si, mas agora, em meio a impulsividade, fez o mesmo?\r\n<html>" +
                        "<html>Vendo os grandes olhos cheios de medo e tristeza, Flanders, Marujo e a Lua constroem uma pequena balsa e carregam Giu ao encontro do céu e do mar.<html>"};
		//pensar como colocar um botão aqui
	
		ImageIcon fundo = new ImageIcon("Assets/mapa polvo boss barcos quebrados.png");
		ImageIcon polvo = new ImageIcon("polvo+grande (38).png");
		ImageIcon giu = new ImageIcon("Assets/giu in game fight.png");
	
		JLabel giuPerto= new JLabel();
		giuPerto.setIcon(giu);
		giuPerto.setVerticalAlignment(JLabel.CENTER);
		giuPerto.setHorizontalAlignment(JLabel.CENTER);
		giuPerto.setBounds(40, -210, 1350, 1010);
	
		JLabel polvoFundo = new JLabel();
		polvoFundo.setIcon(polvo);
		polvoFundo.setVerticalAlignment(JLabel.CENTER);
		polvoFundo.setHorizontalAlignment(JLabel.CENTER);
		polvoFundo.setBounds(870, 0, 1350, 1010);
	
		JLabel label = new JLabel();
		label.setIcon(fundo);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0, 0, 1350, 1010);
	
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(1350, 1010));
	
		contentPane.add(giuPerto);
		contentPane.add(polvoFundo);
		contentPane.add(label);
    }
}

    
