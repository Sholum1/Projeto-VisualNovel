package GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class GiuAcorda {

    public void rodaConversa(MyFrame frame) {
		 String[] out = {"<html>&emsp;&ensp;Giu acorda assustada dentro<html>"+
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
         //pensar como colocar um botão aqui


        ImageIcon fundo = new ImageIcon("Assets/mapa geral.png");
        ImageIcon giu = new ImageIcon("Assets/giu in game frente.png");

        JLabel giuFundo = new JLabel();
        giuFundo.setIcon(giu);
        giuFundo.setVerticalAlignment(JLabel.CENTER);
        giuFundo.setHorizontalAlignment(JLabel.CENTER);
        giuFundo.setBounds(0, 0, 1350, 1010);

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

	frame.setContentPane(contentPane);
	label.add(conversa);
	frame.pack();
    }
}

