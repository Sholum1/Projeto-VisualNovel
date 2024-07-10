package GUI;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
public class BarcoHumanos {

    public void rodaConversaBarcoHumanos(MyFrame frame) {
		String[] out = {"<html>&emsp;&ensp;\"BARCO AVISTA!\r\n" + 
                        "TENTE INVADIR UM BARCO!<html>"+
		"<html> a grande pressão da massa de água ao redor do barco empurra os três pra bem longe.<html>"+
		"<html>&emsp;&ensp;[GIU] lua...me ajude...não sei como lidar com o mar que me colocastes....<html>",
		"<html>&emsp;&ensp;[TOQUE NA LUA!]<html>"};
		//pensar como colocar um botão aqui
	
		ImageIcon fundo = new ImageIcon("Assets/quadro barco de humanos.png");
		ImageIcon giu = new ImageIcon("Assets/giu amor doce.png");
		

	
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
		contentPane.add(label);
    }
}

 
