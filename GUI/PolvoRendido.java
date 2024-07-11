package GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
public class PolvoRendido {
    



    public void rodaConversaPolvoRendido(MyFrame frame) {
		String[] out = {"<html>&emsp;&ensp;[POLVO] Covarde! Me dê o mesmo destino dela!<html>"+
		"<html> Pise em meu corpo sem vida assim<br>&ensp;como pisa no dela, enquanto tenta trazê-la de volta!<html>", 
		"<html>&emsp;&ensp;[POLVO] Você não ne engana! você não quer chegar a costa,<html>"+
		" só quer fugir e afundar<br>&ensp;cada vez mais nesse mar.",
		"<html>&emsp;&ensp;[POLVO] Me mate e me deixe afundar como ela!<html>",
		"<html>&emsp;&ensp;Tomada de raiva por invadir suas memórias de<html>"+
		" Luna com cenas horríveis e por<br>&ensp;desrespeitá-la mesmo não estando em vida,"+
		" Giu ergue a espada e perfura o coração<br>&ensp;do polvo...",
		"<html>&emsp;&ensp;Ele aos poucos afunda no mar, até se perder de vista.<html>",
		"<html>&emsp;&ensp;Após matar alguém com as próprias mãos, Giu cai em lágrimas."+
		" Afinal, está ali<br>&ensp;nadando em meio à saudade da perda de Luna, enquanto"+
		" acaba de tirar a vida de<br>&ensp;um polvo.<html>", 
		"<html>&emsp;&ensp;Por que decidiu matar alguém?<html>", 
		"<html>&emsp;&ensp;Por que é tão injusto a vida tirar Luna de si,"+
		" embora agora, em meio à<br>&ensp;impulsividade, tenha feito o mesmo?<html>",
		"<html>&emsp;&ensp;Vendo os grandes olhos cheios de medo e tristeza, "+
		"Flanders, Marujo e a Lua<br>&ensp;constroem uma pequena balsa e carregam "+
		"Giu ao encontro do céu e do mar.<html>"};
		//pensar como colocar um botão aqui
	
		ImageIcon fundo = new ImageIcon("Assets/mapa polvo boss barcos quebrados.png");
		ImageIcon polvo = new ImageIcon("Assets/polvo maior.png");
		ImageIcon giu = new ImageIcon("Assets/giu fight rotacionada.png");
	
		JLabel giuPerto= new JLabel();
		giuPerto.setIcon(giu);
		giuPerto.setVerticalAlignment(JLabel.CENTER);
		giuPerto.setHorizontalAlignment(JLabel.CENTER);
		giuPerto.setBounds(430, -40, 1350, 1010);
	
		JLabel polvoFundo = new JLabel();
		polvoFundo.setIcon(polvo);
		polvoFundo.setVerticalAlignment(JLabel.CENTER);
		polvoFundo.setHorizontalAlignment(JLabel.CENTER);
		polvoFundo.setBounds(730, -100, 1350, 1010);
	
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

    
