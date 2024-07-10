package GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class MyFrame extends JFrame {
    
     MyFrame() {
        this.setTitle("Afundando: a Saga de Giu e Lua"); //settando o nome da janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fecha a janela (termina a operação)
        this.setResizable(false); //não perimite redimensionamento
        this.setSize(1350, 1080); //dimensões x e y da janela

        ImageIcon fileIcon = new ImageIcon("Assets/giu_falando.png"); //era para aparecer um ícone à esquerda do nome da janela do jogo :(
        this.setIconImage(fileIcon.getImage());

        this.getContentPane().setBackground(new Color(0, 0, 0)); //muda a cor de fundo da janela
        this.setVisible(true); //faz com que a janela fique visível

        this.getContentPane().setBackground(new Color(0, 0, 0));
        this.setVisible(true);


        
    }
}
