package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CenaFim implements Conversa {
	private int count = 0;
    //ultima cena do jogo
    public void rodaConversa(MyFrame frame) {
		String[] out = {"<html>&emsp;&ensp;Após dormir sob os destroços do barco, <html>"+
		"a lua ao lado de Giu sobe aos céus da noite, <br>&ensp;que antigamente eram <html>"+
		"apenas escuridão, e um grande brilho preenche o céu.",
		"<html>&emsp;&ensp;Enfim Giu acorda na areia da praia, com os olhos marejados...<html>"};
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

		frame.setContentPane(contentPane); // Define o JPanel como o conteúdo do frame

		Creditos proximo = new Creditos();
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



    
