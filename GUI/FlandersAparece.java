package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlandersAparece {
    int count = 0;
    public void rodaConversa(MyFrame frame) {
	String[] out =
	    {"<html>&emsp;&ensp;O peixe vai em direção a Giu,<html>"+
	     "<html> mas quanto mais se aproxima, mais<br>&ensp;vê que não é nada<html>"+
	     "<html> parecido com Luna.<html>",
	     "<html>&emsp;&ensp;[FLANDERS] O que quer?<html>",
	     "<html>&emsp;&ensp;[GIU] Estou perdida nesse grande mar!<html>",
	     "<html>&emsp;&ensp;[FLANDERS] E o que eu tenho a ver com isso?<html>",
	     "<html>&emsp;&ensp;[GIU] Pensei que poderia me ajudar...<html>",
	     "<html>&emsp;&ensp;Flanders, o peixe perdido de seu cardume, <html>"+
	     "<html>respira fundo e vê Giu<br>&ensp;como uma oportunidade de se <html>"+
	     "<html>distrair das fortes correntes<br>&ensp;marítimas que teria de enfrentar sozinho.<html>",
	     "<html>&emsp;&ensp;[FLANDERS] Vamos nadar juntos!<html>"};

	ImageIcon fundo = new ImageIcon("Assets/mapa geral.png");
	ImageIcon giu = new ImageIcon("Assets/giu amor doce.png");
	ImageIcon flanders = new ImageIcon("Assets/flanderss.png");

	JLabel flandersPerto= new JLabel();
	flandersPerto.setIcon(flanders);
	flandersPerto.setVerticalAlignment(JLabel.CENTER);
	flandersPerto.setHorizontalAlignment(JLabel.CENTER);
	flandersPerto.setBounds(40, -210, 1350, 1010);
	flandersPerto.setOpaque(false);

	JLabel giuFundo = new JLabel();
	giuFundo.setIcon(giu);
	giuFundo.setVerticalAlignment(JLabel.CENTER);
	giuFundo.setHorizontalAlignment(JLabel.CENTER);
	giuFundo.setBounds(870, 0, 1350, 1010);
	giuFundo.setOpaque(false);

	JLabel label = new JLabel();
	label.setIcon(fundo);
	label.setVerticalAlignment(JLabel.CENTER);
	label.setHorizontalAlignment(JLabel.CENTER);
	label.setBounds(0, 0, 1350, 1010);

	JPanel contentPane = new JPanel(null);
	contentPane.setPreferredSize(new Dimension(1350, 1010));

	contentPane.add(flandersPerto);
	contentPane.add(giuFundo);
	contentPane.add(label);

        JLabel conversa = new JLabel();
        conversa.setBackground(new Color(235, 217, 188));
        conversa.setBounds(40, 800, 1000, 180); // !!!!!!!!!!!
        conversa.setText(out[0]);
        conversa.setHorizontalTextPosition(JLabel.LEFT);
        conversa.setVerticalTextPosition(JLabel.TOP);
        conversa.setForeground(new Color(29, 60, 144));
        conversa.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 28));
        conversa.setVerticalAlignment(JLabel.CENTER);
        conversa.setHorizontalAlignment(JLabel.LEFT);
        conversa.setOpaque(true);

	JButton amizade = new JButton("Aceitar amizade");
        amizade.setFocusable(false);
        amizade.setHorizontalTextPosition(JButton.CENTER);
        amizade.setVerticalTextPosition(JButton.CENTER);
        amizade.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 22));
        amizade.setForeground(new Color(29, 60, 144));
        amizade.setBackground(new Color(242,242,242));
        amizade.setBorder(BorderFactory.createLineBorder(new Color(255, 176, 120), 5));
	amizade.setBounds(505, 335, 300, 50);

	CaranguejoMarujo proximo = new CaranguejoMarujo();
	ActionListener botao = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    if (e.getSource() == amizade) {
			frame.getContentPane().removeAll();
			proximo.rodaConversa(frame);
		    }
		}
	    };
	amizade.addActionListener(botao);

	frame.setContentPane(contentPane);
	frame.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		    if(++count >= out.length) {
			frame.removeMouseListener(this);
			label.add(amizade);
			label.repaint();
		    };
		    conversa.setText(out[count]);
		}
	    });
	label.add(conversa);
	frame.pack();
    }
}
