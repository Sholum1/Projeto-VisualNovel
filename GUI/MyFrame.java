package GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("Afundando: a Saga de Giu e Lua");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1080, 864);
        ImageIcon fileIcon = new ImageIcon("Assets/giu_falando.png"); //era para aparecer um ícone à esquerda do nome da janela do jogo :()
        this.setIconImage(fileIcon.getImage());
        this.getContentPane().setBackground(new Color(0, 0, 0));
        this.setVisible(true);

    }
}
