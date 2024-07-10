package GUI;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class Cardume {



    public void rodaConversa(MyFrame frame) {
		String[] out = {"<html>&emsp;&ensp;Após horas nadando, bolhas se aproximam do peixe e da humana e uma flecha de água os atravessa!,<html>"+
		"<html> [GIU]  Um cardume...!<html>"+
		"<html> [FLANDERS] de sardinhas!<html>",
		"<html>&emsp;&ensp;essa seria uma das visões mais lindas q ja tinha visto... peixes em conjunto rodopiando contra o azul do mar e as bolhas surgindo como as nuvens da terra firme.<html>",
		"<html>&emsp;&ensp;em meio ao rápido cardume uma sardinha apressada e atrasada se aproxima<html>",
		"<html>&emsp;&ensp;[SARDY] Eles são tão rápidos e sabem nadar tão perfeitamente... é tão dificil acompanhar esse ritmo. na terra firme é parecido de alguma forma?<html>",
		"<html>&emsp;&ensp;[GIU] os carros correm rápido, o relógio corre rápido, as pessoas correm contra o tempo em seus carros, é tudo uma grande e rápida competição.<html>",
		"<html>&emsp;&ensp;[SARDY]  por isso veio ao mar? pra fugir disto? aqui não é tão diferente! <html>"+
        "<html>&emsp;&ensp;[GIU] Estou procurando o caminho de casa, apesar de tudo.! <html>"+
        "<html>&emsp;&ensp;[SARDY] já vi humanos em suas grandes embarcações andando por aqui. posso te ajudar a achar uma! Sou a Sardy, deixe eu te ajudar a retornar a casa enquanto eu fujo da minha.. <html>"+
		"<html>Sardy, Flanders e Giu vão à baia, onde as águas são mais rasas...<html>"};
		//pensar como colocar um botão aqui
	
		ImageIcon fundo = new ImageIcon("Assets/cardume.png");
		ImageIcon sardy = new ImageIcon("Assets/sardy.png");
		ImageIcon flanders = new ImageIcon("Assets/flanderss.png");
        ImageIcon giu = new ImageIcon("Assets/giu and luna in game.png");
	
		JLabel flandersPerto= new JLabel();
		flandersPerto.setIcon(flanders);
		flandersPerto.setVerticalAlignment(JLabel.CENTER);
		flandersPerto.setHorizontalAlignment(JLabel.CENTER);
		flandersPerto.setBounds(40, -210, 1350, 1010);

        JLabel giuPerto= new JLabel();
		giuPerto.setIcon(giu);
		giuPerto.setVerticalAlignment(JLabel.CENTER);
		giuPerto.setHorizontalAlignment(JLabel.CENTER);
		giuPerto.setBounds(40, -210, 1350, 1010);
	
		JLabel sardyFundo = new JLabel();
		sardyFundo.setIcon(sardy);
		sardyFundo.setVerticalAlignment(JLabel.CENTER);
		sardyFundo.setHorizontalAlignment(JLabel.CENTER);
		sardyFundo.setBounds(870, 0, 1350, 1010);
	
		JLabel label = new JLabel();
		label.setIcon(fundo);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0, 0, 1350, 1010);
	
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(1350, 1010));
	
		contentPane.add(giuPerto);
		contentPane.add(sardyFundo);
		contentPane.add(label);
    }
}


