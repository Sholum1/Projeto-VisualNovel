package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MyLabel extends JLabel implements ActionListener {
    JButton botaoIniciar;
    ConversaLua cenaLua;
    MyFrame frame;

    public MyLabel(MyFrame frame) {
	this.frame = frame;
        // ImageIcon lua = new ImageIcon("../Assets/quadro lua.png");

        cenaLua = new ConversaLua();
        // cenaLua.setIcon(lua);
        // cenaLua.setBounds(0, 0, 1350, 1010);
        // cenaLua.setVisible(false);
        // this.add(cenaLua);

        botaoIniciar = new JButton();
        botaoIniciar.setBounds(600, 600, 150, 50);
        botaoIniciar.addActionListener(this);
        botaoIniciar.setText("Iniciar");
        botaoIniciar.setFocusable(false);
        botaoIniciar.setHorizontalTextPosition(JButton.CENTER);
        botaoIniciar.setVerticalTextPosition(JButton.CENTER);
        botaoIniciar.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
        botaoIniciar.setForeground(new Color(29, 60, 144));
        botaoIniciar.setBackground(new Color(242,242,242));
        botaoIniciar.setBorder(BorderFactory.createLineBorder(new Color(255, 176, 120), 5));
        this.add(botaoIniciar);


        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botaoIniciar) {
            cenaLua.rodaConversa(frame);
            
        }
    }
}
