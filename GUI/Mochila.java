package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Item.*;
import Personagem.Personagem;


public class Mochila{

    public void rodaConversa(MyFrame frame) {
        
        ImageIcon algaIcon= new ImageIcon("Assets/alga maior.png"); 
        ImageIcon pocaoIcon= new ImageIcon("Assets/pocao maior.png"); 
        ImageIcon raizIcon= new ImageIcon("Assets/raiz maior.png"); 

        Alga alga = new Alga();
        Pocao pocao= new Pocao();
        Raiz raiz= new Raiz();
        Personagem giu= new Personagem();
        JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(1350, 1010));
        
        
        
        JButton algaButton = new JButton();
		algaButton.setFocusable(false);
		algaButton.setHorizontalTextPosition(JButton.CENTER);
		algaButton.setVerticalTextPosition(JButton.CENTER);
        algaButton.setIcon(algaIcon);
		algaButton.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 22));
		algaButton.setForeground(new Color(29, 60, 144));
		algaButton.setBackground(new Color(255, 176, 120));
		algaButton.setBorder(BorderFactory.createLineBorder(new Color(242, 112, 5), 5));
		algaButton.setBounds(550, 400, 120, 120);
        ActionListener botao = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == algaButton) {
                    alga.consumir(giu );
                    giu.consumirItem(alga);
                    
                }
            }
        };
        algaButton.addActionListener(botao);
        
        JButton raizButton = new JButton();
		raizButton.setFocusable(false);
		raizButton.setHorizontalTextPosition(JButton.CENTER);
		raizButton.setVerticalTextPosition(JButton.CENTER);
		raizButton.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 22));
        raizButton.setIcon(raizIcon);
		raizButton.setForeground(new Color(29, 60, 144));
		raizButton.setBackground(new Color(255, 176, 120));
		raizButton.setBorder(BorderFactory.createLineBorder(new Color(242, 112, 5), 5));
		raizButton.setBounds(850, 400, 120, 120);
        ActionListener raizBotao = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == raizButton) {
                    raiz.consumir(giu );
                    giu.consumirItem(raiz);
                    
                }
            }
        };
        raizButton.addActionListener(raizBotao);
        
        JButton pocaoButton = new JButton();
		pocaoButton.setFocusable(false);
		pocaoButton.setHorizontalTextPosition(JButton.CENTER);
		pocaoButton.setVerticalTextPosition(JButton.CENTER);
		pocaoButton.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 22));
        pocaoButton.setIcon(pocaoIcon);
		pocaoButton.setForeground(new Color(29, 60, 144));
		pocaoButton.setBackground(new Color(255, 176, 120));
		pocaoButton.setBorder(BorderFactory.createLineBorder(new Color(242, 112, 5), 5));
		pocaoButton.setBounds(250, 400, 120, 120);
        ActionListener pocaoBotao = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == pocaoButton) {
                    pocao.consumir(giu );
                    giu.consumirItem(pocao);
                    
                }
            }
        };
        pocaoButton.addActionListener(pocaoBotao);

        contentPane.add(pocaoButton);
        contentPane.add(algaButton);
        contentPane.add(raizButton);
        
        frame.setContentPane(contentPane);
        frame.pack();
        
    }
    
    
}
