package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PolvoInicioBatalha implements Conversa {
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
    }

	//dps desse frame, tem como só matar ele ou ir pro frame do PolvoRendido.
	//os dois frames levam pro mapa da cena final das ondas
}
