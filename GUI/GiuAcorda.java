package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GiuAcorda implements Conversa {
    private int countListener = 0, countNadar = 0;
    public void rodaConversa(MyFrame frame) {
	String[] out =
	    {"<html>&emsp;&ensp;Giu acorda assustada dentro<html>"+
	     "<html> de uma densa água. Ela tenta ir para a superfície, mas<br><html>"+
	     "<hmtl> &ensp;a água nunca acaba.<html>"+
	     "<html> Uma pequena pérola iluminada a segue.<br>&emsp;<html>",
	     "<html>&emsp;&ensp;[LUA]&ensp;Giu, do que adianta fugir da realidade tonteante?<html>"+
	     "<html> Se estamos no mar, temos <br><html>"+
	     "<html>&ensp;que nadar em frente ao futuro.<html>"+
	     "<html> Eu te trouxe ao fundo do oceano, no mais remoto<br>&ensp;bloco<html>"+
	     "<html> de água.<br><html>",
	     "<html>&emsp;&ensp;[LUA]&ensp;Sou a Lua, e te trouxe para<html>"+
	     "<html> achá-la novamente.<html>",
	     "<html>&emsp;&ensp;Suas conversas com a Lua sobre Luna geram frutos!<br><html>"+
	     "<html>&emsp;&ensp;Você deseja:<html>"};

	String[] nadarOut =
	    {"<html>&emsp;&ensp;Mesmo que tentemos fugir, mesmo com medo<html>"+
	     "<html> do novo mundo, aprendemos<br>&ensp;a respirar<html>"+
	     "<html> melhor embaixo d'agua enquanto tentamos.<html>",
	     "<html>&emsp;&ensp;Vamos, vamos em frente!<html>",
	     "<html>&emsp;&ensp;Eu te acompanharei até em seus momentos<html>"+
	     "<html> de desespero.<html>",
	     "<html>&emsp;&ensp;Vamos, vamos em frente!"};

        ImageIcon fundo = new ImageIcon("Assets/mapa geral.png");
        ImageIcon giu = new ImageIcon("Assets/giu in game frente.png");

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

        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(1350, 1010));
	contentPane.add(giuFundo);
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

	JButton nadar = new JButton("Nadar para a superfície");
        nadar.setFocusable(false);
        nadar.setHorizontalTextPosition(JButton.CENTER);
        nadar.setVerticalTextPosition(JButton.CENTER);
        nadar.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 22));
        nadar.setForeground(new Color(29, 60, 144));
        nadar.setBackground(new Color(242,242,242));
        nadar.setBorder(BorderFactory.createLineBorder(new Color(255, 176, 120), 5));
	nadar.setBounds(505, 300, 300, 50);

	JButton seguir = new JButton("Seguir em frente");
        seguir.setFocusable(false);
        seguir.setHorizontalTextPosition(JButton.CENTER);
        seguir.setVerticalTextPosition(JButton.CENTER);
        seguir.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 22));
        seguir.setForeground(new Color(29, 60, 144));
        seguir.setBackground(new Color(242,242,242));
        seguir.setBorder(BorderFactory.createLineBorder(new Color(255, 176, 120), 5));
	seguir.setBounds(505, 370, 300, 50);

	GiuSegue proximo = new GiuSegue();
	ActionListener botao = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    if (e.getSource() == nadar) {
			if (countNadar + 1 >= nadarOut.length) {
			    label.remove(nadar);
			    seguir.setBounds(505, 335, 300, 50);
			    label.repaint();
			}
			conversa.setText(nadarOut[countNadar++]);
		    } else if (e.getSource() == seguir) {
			frame.getContentPane().removeAll();
			proximo.rodaConversa(frame);
		    }
		}
	    };

	nadar.addActionListener(botao);
	seguir.addActionListener(botao);

	frame.setContentPane(contentPane);
	frame.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		    if(++countListener >= out.length) {
			frame.removeMouseListener(this);
			label.add(nadar);
			label.add(seguir);
			label.repaint();
		    } else conversa.setText(out[countListener]);
		}
	    });
	label.add(conversa);
	frame.pack();
    }
}

