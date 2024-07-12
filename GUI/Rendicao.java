package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rendicao implements Conversa {
    private int countListener = 0;

    public void rodaConversa(MyFrame frame) {
	String[] out =
	    {"<html>&emsp;&ensp;Exausto depois da perseguição e dos desmaios, Caranguejo Marujo<html>"+
	     "<html> se rende,<br>&ensp;e vira servo de navio de Giu.<html>",
	     "<html>&emsp;&ensp;Pelos corais, o Marujo vai apresentando várias peças úteis para construir um barco:<html>",
	     "<html>&emsp;&ensp;Baú de ouro<html>",
	     "<html>&emsp;&ensp;Base da balsa<html>",
	     "<html>&emsp;&ensp;Timão do barco<html>",
	     "<html>&emsp;&ensp;...!<html>",
	     "<html>&emsp;&ensp;Ao agarrar o timão do barco, uma força o puxa de volta e uma grande sombra<html>"+
	     "<html><br>&ensp;se põe na frente deles.<html>",
	     "<html>&emsp;&ensp;Um polvo gigante os surpreende.<html>"};

		ImageIcon fundo = new ImageIcon("Assets/mapa polvo boss barcos quebrados.png");
        ImageIcon bau = new ImageIcon("Assets/bau.png");
        ImageIcon caranguejoFundo = new ImageIcon("Assets/carangueijo marujo.png");
        ImageIcon giu = new ImageIcon("Assets/giu and luna in game.png");

		JLabel label = new JLabel();
		label.setIcon(fundo);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0, 0, 1350, 1010);

        JLabel bauFundo = new JLabel();
        bauFundo.setIcon(bau);
		bauFundo.setVerticalAlignment(JLabel.CENTER);
		bauFundo.setHorizontalAlignment(JLabel.CENTER);
		bauFundo.setBounds(-80, -300, 1350, 1010);

        JLabel caranguejoLonge = new JLabel();
        caranguejoLonge.setIcon(caranguejoFundo);
        caranguejoLonge.setVerticalAlignment(JLabel.CENTER);
        caranguejoLonge.setHorizontalAlignment(JLabel.CENTER);
        caranguejoLonge.setBounds(-570, 100, 1350, 1010);

        JLabel giuFundo = new JLabel();
        giuFundo.setIcon(giu);
        giuFundo.setVerticalAlignment(JLabel.CENTER);
        giuFundo.setHorizontalAlignment(JLabel.CENTER);
        giuFundo.setBounds(-80, 120, 1350, 1010);

		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(1350, 1010));
        contentPane.add(giuFundo);
        contentPane.add(caranguejoLonge);
        contentPane.add(bauFundo);
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

		PolvoInicioBatalha proximo = new PolvoInicioBatalha();

		frame.setContentPane(contentPane);
		frame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			    if (++countListener >= out.length) {
				frame.removeMouseListener(this);
				frame.getContentPane().removeAll();
				proximo.rodaConversa(frame);
			    } else conversa.setText(out[countListener]);
			}
		    });
		label.add(conversa);
		frame.pack();
    }
}
