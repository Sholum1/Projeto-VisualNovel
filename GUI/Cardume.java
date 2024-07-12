package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cardume implements Conversa {
    private int count = 0;
    public void rodaConversa(MyFrame frame) {
		String[] out = {"<html>&emsp;&ensp;[GIU] Um cardume...!<html>",
		"<html>&emsp;&ensp;[FLANDERS] De sardinhas!<html>",
		"<html>&emsp;&ensp;Essa seria uma das visões mais lindas q ja tinha visto... "+
		"Peixes em conjunto<br>&ensp;rodopiando contra o azul do mar e as bolhas surgindo como as nuvens da terra firme.<html>",
		"<html>&emsp;&ensp;Em meio ao rápido cardume, uma sardinha apressada e atrasada se aproxima.<html>",
		"<html>&emsp;&ensp;[SARDY] Eles são tão rápidos e sabem nadar tão perfeitamente..."+
		"<html> É tão dificil<br>&ensp;acompanhar esse ritmo. Na terra firme é parecido de alguma forma?<html>",
		"<html>&emsp;&ensp;[GIU] Os carros correm rápido, o relógio corre rápido, as pessoas correm"+
		"<html> contra<br>&ensp;o tempo em seus carros, é tudo uma grande e rápida competição.<html>",
		"<html>&emsp;&ensp;[SARDY] Por isso veio ao mar? Para fugir disto? Aqui não é tão diferente!<html>",
        "<html>&emsp;&ensp;[GIU] Estou procurando o caminho de casa, apesar de tudo!<html>",
        "<html>&emsp;&ensp;[SARDY] Já vi humanos em suas grandes embarcações andando por aqui."+
		"<html> Posso te<br>&ensp;ajudar a achar uma! Sou a Sardy, deixe eu te ajudar a retornar à"+
		"<html> casa enquanto eu<br>&ensp;fujo da minha... <html>",
		"<html>&emsp;&ensp;Sardy, Flanders e Giu vão à baía, onde as águas são mais rasas...<html>"};
		//pensar como colocar um botão aqui
	
		ImageIcon fundo = new ImageIcon("Assets/cardume.png");
		ImageIcon sardy = new ImageIcon("Assets/sardy.png");
		ImageIcon flanders = new ImageIcon("Assets/mini flanders rotacionado.png");
        ImageIcon giu = new ImageIcon("Assets/giu and luna in game.png");

        JLabel giuPerto= new JLabel();
		giuPerto.setIcon(giu);
		giuPerto.setVerticalAlignment(JLabel.CENTER);
		giuPerto.setHorizontalAlignment(JLabel.CENTER);
		giuPerto.setBounds(470, -150, 1350, 1010);

		JLabel flandersLonge= new JLabel();
		flandersLonge.setIcon(flanders);
		flandersLonge.setVerticalAlignment(JLabel.CENTER);
		flandersLonge.setHorizontalAlignment(JLabel.CENTER);
		flandersLonge.setBounds(540, -40, 1350, 1010);
	
		JLabel sardyFundo = new JLabel();
		sardyFundo.setIcon(sardy);
		sardyFundo.setVerticalAlignment(JLabel.CENTER);
		sardyFundo.setHorizontalAlignment(JLabel.CENTER);
		sardyFundo.setBounds(500, -55, 1350, 1010);
	
		JLabel label = new JLabel();
		label.setIcon(fundo);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0, 0, 1350, 1010);
	
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(1350, 1010));
	
		contentPane.add(giuPerto);
		contentPane.add(sardyFundo);
		contentPane.add(flandersLonge);
		contentPane.add(label);

		JLabel conversa = new JLabel();
        conversa.setBackground(new Color(235, 217, 188));
        conversa.setBounds(40, 800, 1250, 180);
        conversa.setText(out[0]);
        conversa.setHorizontalTextPosition(JLabel.LEFT);
        conversa.setVerticalTextPosition(JLabel.TOP);
        conversa.setForeground(new Color(29, 60, 144));
        conversa.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 28));
        conversa.setVerticalAlignment(JLabel.CENTER);
        conversa.setHorizontalAlignment(JLabel.LEFT);
        conversa.setOpaque(true);

	BarcoSurge proximo = new BarcoSurge();

	frame.setContentPane(contentPane);

	frame.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		    if(++count >= out.length) {
			frame.removeMouseListener(this);
			frame.getContentPane().removeAll();
			proximo.rodaConversa(frame);
		    } else conversa.setText(out[count]);
		}
	    });

	label.add(conversa);
	frame.pack();
    }
}
