package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConversaLua {
    private int count = 0;
    public void rodaConvers () {
	String[] out = {"<html>&emsp;&ensp;Giu ouve o som das ondas e<html>"+
			"<html> olha para a lua suplicando que a<html>"+
			"<hmtl> devolva Luna, sua<br>&ensp;peixe que<html>"+
			"<html> se foi dias atrás. Giu sabe que<html>"+
			"<html> peixes vivem pouco, e quando a viu"+
			"<html><br>&ensp;cansada<html>"+
			"<html> em seu aquário já previa o pior,<html>"+
			"<html> mas não tão cedo.<html>",
			"<html>&emsp;&ensp;A lua começa a cantar: a ninar,<html>"+
			"<html> ouça as ondas do mar... Deixe o som te<html>"+
			"<html> guiar... A <br>&ensp;luz da lua te leva<html>"+
			"<html> ...de volta ao mar.<html>"};
	ImageIcon fundo = new ImageIcon("Assets/quadro lua.png");
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
        conversa.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 32));
        conversa.setVerticalAlignment(JLabel.TOP);
        conversa.setHorizontalAlignment(JLabel.LEFT);
        conversa.setOpaque(true);
        MyFrame frame = new MyFrame();
        frame.setLayout(null);
        frame.add(label);
	frame.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		    count = (count + 1)%out.length;
		    conversa.setText(out[count]);
		}
	    });
	label.add(conversa);
    }
}
