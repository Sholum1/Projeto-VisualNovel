package GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class FlandersAparece {
    public void rodaConversa(MyFrame frame) {
		String[] out = {"<html>&emsp;&ensp;[POLVO]: -SE PREPARE PRA MORRER!,<html>"+
		"<html>POLVO: o mar te assombrou, e a Lua pode ate tentar te enganar, mas todos nos sabemos como voxê nunca mais achará Luna!\r\n" +
						"            Pode passear pelas águas que ela nadava, e os corais apenas vão acenar a você com grande pesar!\r\n" + 
						"            PENA. Por uma tristeza que nunca será curada, este buraco ira consumir todo o seu coração, até corroer as bordas do seu ser, pois ela NUNCA voltará!\r\n" + //
						"            vocês nunca mais nadarão juntas. pode ficar 100 anos neste mar esperando, e ficará 100 eternos anos sozinha, na companhia de memórias do passado!\r\n" + //
						"            Qual o sentido desta viagem Giu? Se sente capaz de trazê-la magicamente a vida e q ela venha correndo das areias em direção a você? Pare de ser soberba!\r\n" + //
						"            Se sente em tanto controle da vida? Então apenas me mate. E eu virarei apenas memórias que voarão como o pó do que um dia foi o corpo dela!<html>"
		};
		//pensar como colocar um botão aqui
	
		ImageIcon fundo = new ImageIcon("Assets/mapa polvo boss barcos quebrados.png");
		ImageIcon polvo = new ImageIcon("polvo+grande (38).png");
		ImageIcon giu = new ImageIcon("Assets/giu in game fight.png");
	
		JLabel giuPerto= new JLabel();
		giuPerto.setIcon(giu);
		giuPerto.setVerticalAlignment(JLabel.CENTER);
		giuPerto.setHorizontalAlignment(JLabel.CENTER);
		giuPerto.setBounds(40, -210, 1350, 1010);
	
		JLabel polvoFundo = new JLabel();
		polvoFundo.setIcon(polvo);
		polvoFundo.setVerticalAlignment(JLabel.CENTER);
		polvoFundo.setHorizontalAlignment(JLabel.CENTER);
		polvoFundo.setBounds(870, 0, 1350, 1010);
	
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
}

    