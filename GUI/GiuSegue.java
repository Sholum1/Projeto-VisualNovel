package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GiuSegue implements Conversa {
    int count = 0;
    public void rodaConversa(MyFrame frame) {
        String[] out = {"<html>&emsp;&ensp;Nadando pelo mar, Giu vê um peixe<html>"+
        "<html> rápido, vermelho e preto.<br><html>"+
        "<hmtl>&emsp;&ensp;Um estalo de memórias com Luna volta como um<html>"+
        "<html> grande peso em sua cabeça.<html>",
        "<html>&emsp;&ensp;Seria ela? Nadando livremente no mar?<html>",
        "<html>&emsp;&ensp;[GIU] Ei! Volte aqui!<html>"};


    ImageIcon fundo = new ImageIcon("Assets/mapa geral.png");
    ImageIcon giu = new ImageIcon("Assets/giu in game frente.png");
    ImageIcon flanders = new ImageIcon("Assets/mini_flnaders.png");

    JLabel flandersLonge = new JLabel();
    flandersLonge.setIcon(flanders);
    flandersLonge.setVerticalAlignment(JLabel.CENTER);
    flandersLonge.setHorizontalAlignment(JLabel.CENTER);
    flandersLonge.setBounds(-600, 100, 1350, 1010);
    flandersLonge.setOpaque(false);

    JLabel giuFundo = new JLabel();
    giuFundo.setIcon(giu);
    giuFundo.setVerticalAlignment(JLabel.CENTER);
    giuFundo.setHorizontalAlignment(JLabel.CENTER);
    giuFundo.setBounds(0, 0, 1350, 1010);
    giuFundo.setOpaque(false);

    JLabel label = new JLabel();
    label.setIcon(fundo);
    label.setVerticalAlignment(JLabel.CENTER);
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setBounds(0, 0, 1350, 1010);

    JLabel conversa = new JLabel();
    conversa.setBackground(new Color(235, 217, 188));
    conversa.setBounds(40, 800, 1250, 180);
    conversa.setText(out[0]);
    conversa.setHorizontalTextPosition(JLabel.LEFT);
    conversa.setVerticalTextPosition(JLabel.TOP);
    conversa.setForeground(new Color(29, 60, 144));
    conversa.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT,28));
    conversa.setVerticalAlignment(JLabel.CENTER);
    conversa.setHorizontalAlignment(JLabel.LEFT);
    conversa.setOpaque(true);

    JPanel contentPane = new JPanel(null);
    contentPane.setPreferredSize(new Dimension(1350, 1010));
    contentPane.add(flandersLonge);
    contentPane.add(giuFundo);
    contentPane.add(label);

    frame.setContentPane(contentPane);
    FlandersAparece proximo = new FlandersAparece();

    frame.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent e) {
		if(++count >= out.length) {
		    frame.removeMouseListener(this);
		    frame.getContentPane().removeAll();
		    proximo.rodaConversa(frame);
		};
		conversa.setText(out[count]);
	    }
	});

    label.add(conversa);
    frame.pack();
    }
}
