package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Batalha implements Conversa {
	private int count = 0;

    public void rodaConversa(MyFrame frame) {
		String[] out = {"<html>&emsp;&ensp;"};
		//pensar como colocar um botão aqui
	
		ImageIcon fundo = new ImageIcon("Assets/mapa carangueijo boss corais.png");
        ImageIcon marujo = new ImageIcon("Assets/carangueijo marujo amor doce.png");
        ImageIcon giuPerfil = new ImageIcon("Assets/giu and luna in game.png");
	
		JLabel label = new JLabel();
		label.setIcon(fundo);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0, 0, 1350, 1010);

        JLabel caranguejo = new JLabel();
		caranguejo .setIcon(marujo);
		caranguejo .setVerticalAlignment(JLabel.CENTER);
		caranguejo .setHorizontalAlignment(JLabel.CENTER);
		caranguejo.setBounds(140, -115, 1350, 1010);

        JLabel giu = new JLabel();
		giu .setIcon(giuPerfil);
		giu .setVerticalAlignment(JLabel.CENTER);
		giu .setHorizontalAlignment(JLabel.CENTER);
		giu.setBounds(470, -120, 1350, 1010);


		JLabel conversa = new JLabel();
		conversa.setBackground(new Color(235, 217, 188));
		conversa.setBounds(40, 800, 1000, 180);
        conversa.setBorder(BorderFactory.createLineBorder(new Color(255, 176, 120), 14, false));
		conversa.setHorizontalTextPosition(JLabel.LEFT);
		conversa.setVerticalTextPosition(JLabel.TOP);
		conversa.setForeground(new Color(29, 60, 144));
		conversa.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 28));
		conversa.setVerticalAlignment(JLabel.CENTER);
		conversa.setHorizontalAlignment(JLabel.LEFT);
		conversa.setOpaque(true);

        JLabel giuStats = new JLabel();
		giuStats.setBackground(new Color(235, 217, 188));
		giuStats.setBounds(1010, 470, 310, 120);
        giuStats.setBorder(BorderFactory.createLineBorder(new Color(255, 176, 120), 10, false));
		giuStats.setText("Giu & Lua");
		giuStats.setHorizontalTextPosition(JLabel.LEFT);
		giuStats.setVerticalTextPosition(JLabel.TOP);
		giuStats.setForeground(new Color(29, 60, 144));
		giuStats.setFont(new Font("Times New Roman", Font.BOLD, 24));
		giuStats.setVerticalAlignment(JLabel.TOP);
		giuStats.setHorizontalAlignment(JLabel.CENTER);
		giuStats.setOpaque(true);

        JLabel marujoStats = new JLabel();
		marujoStats.setBackground(new Color(235, 217, 188));
		marujoStats.setBounds(350, 300, 310, 120);
        marujoStats.setBorder(BorderFactory.createLineBorder(new Color(255, 176, 120), 10, false));
		marujoStats.setText("Caranguejo Marujo");
		marujoStats.setHorizontalTextPosition(JLabel.LEFT);
		marujoStats.setVerticalTextPosition(JLabel.TOP);
		marujoStats.setForeground(new Color(29, 60, 144));
		marujoStats.setFont(new Font("Times New Roman", Font.BOLD, 24));
		marujoStats.setVerticalAlignment(JLabel.TOP);
		marujoStats.setHorizontalAlignment(JLabel.CENTER);
		marujoStats.setOpaque(true);

        JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(1350, 1010));
        contentPane.add(caranguejo);
        contentPane.add(giu);
		contentPane.add(label);


        JButton ataque = new JButton("Ataque");
		ataque.setFocusable(false);
		ataque.setHorizontalTextPosition(JButton.CENTER);
		ataque.setVerticalTextPosition(JButton.CENTER);
		ataque.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 22));
		ataque.setForeground(new Color(29, 60, 144));
		ataque.setBackground(new Color(242,242,242));
		ataque.setBorder(BorderFactory.createLineBorder(new Color(255, 176, 120), 5));
		ataque.setBounds(40, 800, 300, 50);

        JButton ataqueLua = new JButton("Ataque com a Lua");
		ataqueLua.setFocusable(false);
		ataqueLua.setHorizontalTextPosition(JButton.CENTER);
		ataqueLua.setVerticalTextPosition(JButton.CENTER);
		ataqueLua.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 22));
		ataqueLua.setForeground(new Color(29, 60, 144));
		ataqueLua.setBackground(new Color(242,242,242));
		ataqueLua.setBorder(BorderFactory.createLineBorder(new Color(255, 176, 120), 5));
		ataqueLua.setBounds(40, 860, 300, 50);

        JButton mochila = new JButton("Ver mochila");
		mochila.setFocusable(false);
		mochila.setHorizontalTextPosition(JButton.CENTER);
		mochila.setVerticalTextPosition(JButton.CENTER);
		mochila.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 22));
		mochila.setForeground(new Color(29, 60, 144));
		mochila.setBackground(new Color(242,242,242));
		mochila.setBorder(BorderFactory.createLineBorder(new Color(255, 176, 120), 5));
		mochila.setBounds(40, 920, 300, 50);

		frame.setContentPane(contentPane); // Define o JPanel como o conteúdo do frame

		CenaFinal proximo = new CenaFinal();
		ActionListener botao = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == ataque) {

				} else if (e.getSource() == ataqueLua) {

				} else if (e.getSource() == mochila) {

                }
			}
		};

		ataque.addActionListener(botao);
		ataqueLua.addActionListener(botao);
        mochila.addActionListener(botao);

		frame.setContentPane(contentPane);
		frame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (++count >= out.length) {
					frame.removeMouseListener(this);
					label.add(ataque);
					label.add(ataqueLua);
                    label.add(mochila);
					label.repaint();
				};
				conversa.setText(out[count]);
			}
		});
		label.add(conversa);
        label.add(giuStats);
        label.add(marujoStats);
		frame.pack();
    }
}

//ataque
//ataque lua
//mochila