package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AssassinatoHumanos {
	private int countListener = 0, countDesmaio = 0;

    public void rodaConversa(MyFrame frame) {
		String[] out = {"<html>&emsp;&ensp;Uma grande luz cega os motores e eles param de funcionar.<html>"};
		
		String[] desmaioOut =
	    {"<html>&emsp;&ensp;Inimigos temporariamente desmaiados.<html>",
	     "<html>&emsp;&ensp;Eles estão voltando recobrando a lucidez!<html>",
		 "<html>&emsp;&ensp;Os inimigos desmaiaram novamente. Há tempo para pensar o que fazer.<html>",
		 "<html>&emsp;&ensp;Eles não aguentarão por muito tempo sem renderem-se!<html>",
	     "<html>&emsp;&ensp;Só precisam resistir mais um pouquinho..."};
	
		ImageIcon fundo = new ImageIcon("Assets/barco assassinato humanos.png");

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

		JButton ira = new JButton("Ira Vermelha");
		ira.setFocusable(false);
		ira.setHorizontalTextPosition(JButton.CENTER);
		ira.setVerticalTextPosition(JButton.CENTER);
		ira.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 22));
		ira.setForeground(new Color(29, 60, 144));
		ira.setBackground(new Color(242,242,242));
		ira.setBorder(BorderFactory.createLineBorder(new Color(255, 176, 120), 5));
		ira.setBounds(505, 300, 300, 50);

		JButton desmaio = new JButton("Brilho do Desmaio");
		desmaio.setFocusable(false);
		desmaio.setHorizontalTextPosition(JButton.CENTER);
		desmaio.setVerticalTextPosition(JButton.CENTER);
		desmaio.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 22));
		desmaio.setForeground(new Color(29, 60, 144));
		desmaio.setBackground(new Color(242,242,242));
		desmaio.setBorder(BorderFactory.createLineBorder(new Color(255, 176, 120), 5));
		desmaio.setBounds(505, 370, 300, 50);

		Rendicao proximo = new Rendicao();
		ActionListener botao = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == desmaio) {
					if (countDesmaio + 1 >= desmaioOut.length) {
						label.remove(desmaio);
						ira.setBounds(505, 335, 300, 50);
						label.repaint();
						proximo.rodaConversa(frame);
					}
					conversa.setText(desmaioOut[countDesmaio++]);
				} else if (e.getSource() == ira) {
					frame.getContentPane().removeAll();
					proximo.rodaConversa(frame);
				}
			}
		};

		desmaio.addActionListener(botao);
		ira.addActionListener(botao);

		frame.setContentPane(contentPane);
		frame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (++countListener >= out.length) {
					frame.removeMouseListener(this);
					label.add(desmaio);
					label.add(ira);
					label.repaint();
				};
				conversa.setText(out[countListener]);
			}
		});
		label.add(conversa);
		frame.pack();
    }
}

