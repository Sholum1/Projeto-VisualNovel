package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BarcoHumanos implements Conversa {
	private int count = 0;

    public void rodaConversa(MyFrame frame) {
		String[] out = {"<html>&emsp;&ensp;A grande pressão da massa de água ao redor do barco empurra os<br>&ensp;três pra bem longe.<html>",
		"<html>&emsp;&ensp;[GIU] Lua... Me ajude... Não sei como lidar com o mar que me<br>&ensp;colocastes...<html>",
		"<html>&emsp;&ensp;[TOQUE NA LUA!]<html>"};
	
		ImageIcon fundo = new ImageIcon("Assets/quadro barco de humanos.png");
		ImageIcon giu = new ImageIcon("Assets/giu amor doce.png");
		ImageIcon luaPerto = new ImageIcon("Assets/lua menor.png");
		ImageIcon sardy = new ImageIcon("Assets/sardy.png");
		ImageIcon flanders = new ImageIcon("Assets/mini_flnaders.png");
		
		JLabel lua = new JLabel();
		lua.setIcon(luaPerto);
		lua.setVerticalAlignment(JLabel.CENTER);
		lua.setHorizontalAlignment(JLabel.CENTER);
		lua.setBounds(380, -210, 1350, 1010);

		JLabel flandersLonge= new JLabel();
		flandersLonge.setIcon(flanders);
		flandersLonge.setVerticalAlignment(JLabel.CENTER);
		flandersLonge.setHorizontalAlignment(JLabel.CENTER);
		flandersLonge.setBounds(-450, 250, 1350, 1010);
	
		JLabel sardyFundo = new JLabel();
		sardyFundo.setIcon(sardy);
		sardyFundo.setVerticalAlignment(JLabel.CENTER);
		sardyFundo.setHorizontalAlignment(JLabel.CENTER);
		sardyFundo.setBounds(-480, 170, 1350, 1010);
	
	
		JLabel giuFundo = new JLabel();
		giuFundo.setIcon(giu);
		giuFundo.setVerticalAlignment(JLabel.CENTER);
		giuFundo.setHorizontalAlignment(JLabel.CENTER);
		giuFundo.setBounds(870, 0, 1350, 1010);
	
		JLabel label = new JLabel();
		label.setIcon(fundo);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0, 0, 1350, 1010);
	
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(1350, 1010));
	
		contentPane.add(giuFundo);
		contentPane.add(sardyFundo);
		contentPane.add(flandersLonge);
		contentPane.add(lua);
		contentPane.add(label);

        JLabel conversa = new JLabel();
        conversa.setBackground(new Color(235, 217, 188));
        conversa.setBounds(40, 800, 1000, 180); //!!!!!!!!!!!!!!!!!!!!!!!
        conversa.setText(out[0]);
        conversa.setHorizontalTextPosition(JLabel.LEFT);
        conversa.setVerticalTextPosition(JLabel.TOP);
        conversa.setForeground(new Color(29, 60, 144));
        conversa.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 28));
        conversa.setVerticalAlignment(JLabel.CENTER);
        conversa.setHorizontalAlignment(JLabel.LEFT);
        conversa.setOpaque(true);


        AssassinatoHumanos proximo = new AssassinatoHumanos();
		GravarArquivo escreva = new GravarArquivo();

        frame.setContentPane(contentPane); // Define o JPanel como o conteúdo do frame
        frame.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		    if(++count >= out.length) {
			frame.removeMouseListener(this);
			frame.getContentPane().removeAll();
			proximo.rodaConversa(frame);
		    } else {
				conversa.setText(out[count]);
				escreva.escreverLog(out[count]);
			}
		}
	    });

        label.add(conversa);
        frame.pack();
    }
}

 
