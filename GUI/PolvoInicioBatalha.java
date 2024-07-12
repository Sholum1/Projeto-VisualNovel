package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PolvoInicioBatalha implements Conversa {
	private int count = 0;

    public void rodaConversa(MyFrame frame) {
		String[] out = {"<html>&emsp;&ensp;[POLVO] PREPARE-SE PRA MORRER!<html>",
		"<html>&emsp;&ensp;[POLVO] O mar te assombrou, e a Lua pode até tentar<br>&ensp;te enganar, <html>"+
		"mas todos nós sabemos como você nunca mais achará Luna!" +
		"<html> Pode<br>&ensp;passear pelas águas que ela nadava, e os corais apenas <html>"+
		"vão acenar a você com<br>&ensp;grande pesar!",
		"<html>&emsp;&ensp;[POLVO] PENA. Por uma tristeza que nunca será curada, <html>"+
		"este buraco irá consumir<br>&ensp;todo o seu coração, até corroer as bordas "+
		"do seu ser, pois ela NUNCA voltará!",
		"<html>&emsp;&ensp;[POLVO] Vocês nunca mais nadarão juntas. Pode ficar 100 anos neste mar <br>&ensp;esperando <html>"+
		"e ficará 100 eternos anos sozinha, na companhia de memórias do passado!",
		"<html>&emsp;&ensp;[POLVO] Qual o sentido desta viagem, Giu?<html>"+
		" Se sente capaz de trazê-la magicamente<br>&ensp;à vida e que ela venha correndo"+
		" das areias em direção a você? Pare de ser soberba!",
		"<html>&emsp;&ensp;[POLVO] Se sente em tanto controle da vida? Então apenas me mate. <html>"+
		"<html>E eu virarei<br>&ensp;apenas memórias que voarão como o pó do que um dia foi o corpo dela!<html>"};
		//pensar como colocar um botão aqui
	
		ImageIcon fundo = new ImageIcon("Assets/mapa polvo boss barcos quebrados.png");
		ImageIcon polvo = new ImageIcon("Assets/polvo maior.png");
		ImageIcon giu = new ImageIcon("Assets/giu fight rotacionada.png");
	
		JLabel giuPerto= new JLabel();
		giuPerto.setIcon(giu);
		giuPerto.setVerticalAlignment(JLabel.CENTER);
		giuPerto.setHorizontalAlignment(JLabel.CENTER);
		giuPerto.setBounds(430, -40, 1350, 1010);
	
		JLabel polvoFundo = new JLabel();
		polvoFundo.setIcon(polvo);
		polvoFundo.setVerticalAlignment(JLabel.CENTER);
		polvoFundo.setHorizontalAlignment(JLabel.CENTER);
		polvoFundo.setBounds(730, -100, 1350, 1010);
	
		JLabel label = new JLabel();
		label.setIcon(fundo);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0, 0, 1350, 1010);
	
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(1350, 1010));
	
		contentPane.add(giuPerto);
		contentPane.add(polvoFundo);
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

		JButton matarPolvo = new JButton("Matar Polvo");
        matarPolvo.setFocusable(false);
        matarPolvo.setHorizontalTextPosition(JButton.CENTER);
        matarPolvo.setVerticalTextPosition(JButton.CENTER);
        matarPolvo.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 22));
        matarPolvo.setForeground(new Color(29, 60, 144));
        matarPolvo.setBackground(new Color(242,242,242));
        matarPolvo.setBorder(BorderFactory.createLineBorder(new Color(255, 176, 120), 5));
        matarPolvo.setBounds(505, 180, 300, 50);

        JButton renderPolvo = new JButton("Deixar Polvo rendido");
        renderPolvo.setFocusable(false);
        renderPolvo.setHorizontalTextPosition(JButton.CENTER);
        renderPolvo.setVerticalTextPosition(JButton.CENTER);
        renderPolvo.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 22));
        renderPolvo.setForeground(new Color(29, 60, 144));
        renderPolvo.setBackground(new Color(242,242,242));
        renderPolvo.setBorder(BorderFactory.createLineBorder(new Color(255, 176, 120), 5));
        renderPolvo.setBounds(505, 110, 300, 50);

		PolvoRendido rendido = new PolvoRendido();
		CenaFinal fim = new CenaFinal();
		
        ActionListener botao = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == matarPolvo) {
					frame.getContentPane().removeAll();
					fim.rodaConversa(frame);

				} else if (e.getSource() == renderPolvo) {
					frame.getContentPane().removeAll();
					rendido.rodaConversa(frame);
				}
			}
			};
			matarPolvo.addActionListener(botao);
			renderPolvo.addActionListener(botao);
	
			frame.setContentPane(contentPane);
			frame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			if(++count >= out.length) {
				frame.removeMouseListener(this);
				label.add(matarPolvo);
				label.add(renderPolvo);
				label.repaint();
			};
			conversa.setText(out[count]);
			}
			});
	
			label.add(conversa);
			frame.pack();
		}
}
