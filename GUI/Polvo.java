package GUI;

import javax.swing.*;

import GUI.TelaInicial;

import java.awt.*;
import java.awt.event.*;

public class Polvo {
    private int count = 0;
    public void rodaConversa (MyFrame frame) {
	String[] out = {"<html>&emsp;&ensp;o mar te assombrou, e a Lua pode ate tentar te enganar, mas todos nos sabemos como você nunca mais achará Luna!<html>"+
			"<html> Pode passear pelas águas que ela nadava, e os corais apenas vão acenar a você com grande pesar!<html>"+
			"<hmtl> PENA. Por uma tristeza que nunca será curada, este buraco ira consumir todo o seu coração, até corroer as bordas do seu ser, pois ela NUNCA voltará!<html>"+
			"<html> vocês nunca mais nadarão juntas. pode ficar 100 anos neste mar esperando, e ficará 100 eternos anos sozinha, na companhia de memórias do passado!<html>"+
			"<html> Qual o sentido desta viagem Giu? Se sente capaz de trazê-la magicamente a vida e q ela venha correndo das areias em direção a você? Pare de ser soberba!"+
			"<html>Se sente em tanto controle da vida? Então apenas me mate. E eu virarei apenas memórias que voarão como o pó do que um dia foi o corpo dela!<html>"+
};
	ImageIcon fundo = new ImageIcon("Assets/polvo boss.png");

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
        conversa.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 32));
        conversa.setVerticalAlignment(JLabel.TOP);
        conversa.setHorizontalAlignment(JLabel.LEFT);
        conversa.setOpaque(true);

	contentPane.add(conversa); // Adiciona o JLabel com o texto sobre a imagem de fundo
        frame.setContentPane(contentPane); // Define o JPanel como o conteúdo do frame

	TelaInicial tela = new TelaInicial();
	frame.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		    if(++count > out.length) {
			// próxima cena...
		    };
		    conversa.setText(out[count]);
		}
	    });
	label.add(conversa);
	frame.pack();
    }
}

    