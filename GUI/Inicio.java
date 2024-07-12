package GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class Inicio implements Conversa {
    public void rodaConversa(MyFrame frame) {
		String[] out = {"<html>&emsp;&ensp;lua acorda assustada dentro da densa água, e tenta ir pra superficie, mas nunca acaba. uma pequena pérola iluminada a segue.<html>"+
		"<html> mas quanto mais se aproxima, mais<br>&ensp;vê que não é nada<html>"+
		"<html> parecido com Luna.<html>",
		"<html>&emsp;&ensp;[LUA] lua do que adianta fugir da realidade tonteante? se estamos no mar, temos que nadar em frente ao futuro.eu te trouxe ao fundo do oceano, no mais remoto bloco de água.sou a lua, e te trouxe pra acha-la novamente.<html>",
		"<html>&emsp;&ensp;as suas conversas com a lua sobre luna geraram frutos! você deseja:"};
		//pensar como colocar um botão aqui... tem q ser tipo  [seguir em frente]  ou [nadar para a superficie]

        /*if ( j.button: nadar para a superficie){

    System.out.println("mesmo que tentemos fugir, mesmo com medo do novo mundo, aprendemos a respirar melhor embaixo d'agua enquanto tentamos.")

}
    
    if ( j.button: nadar para a superficie){

        System.out.println("vamos, vamos em frente!")

    }
    if ( j.button: nadar para a superficie){

        System.out.println("eu te acompanheirei ate em seus momentos de desespero")
    
    }
    if ( j.button: nadar para a superficie){

        System.out.println("vamos, vamos em frente!")
    
    } */
	
		ImageIcon fundo = new ImageIcon("Assets/mapa geral.png");
		ImageIcon lua = new ImageIcon("Assets/lua).png");
		ImageIcon giu = new ImageIcon("Assets/giu in game frente.png");
	
		JLabel giuPerto= new JLabel();
		giuPerto.setIcon(giu);
		giuPerto.setVerticalAlignment(JLabel.CENTER);
		giuPerto.setHorizontalAlignment(JLabel.CENTER);
		giuPerto.setBounds(40, -210, 1350, 1010);
	
		JLabel luaFundo = new JLabel();
		luaFundo.setIcon(lua);
		luaFundo.setVerticalAlignment(JLabel.CENTER);
		luaFundo.setHorizontalAlignment(JLabel.CENTER);
		luaFundo.setBounds(870, 0, 1350, 1010);
	
		JLabel label = new JLabel();
		label.setIcon(fundo);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0, 0, 1350, 1010);
	
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(1350, 1010));
	
		contentPane.add(giuPerto);
		contentPane.add(luaFundo);
		contentPane.add(label);
    }
}
