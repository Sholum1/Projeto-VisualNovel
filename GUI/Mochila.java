package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Item.*;
import Personagem.Personagem;

public class Mochila{
    public void mostraMochila(MyFrame frame, Personagem giu, Alga alga,
			      Pocao pocao, Raiz raiz) {
        
        ImageIcon algaIcon= new ImageIcon("Assets/alga maior.png"); 
        ImageIcon pocaoIcon= new ImageIcon("Assets/pocao maior.png"); 
        ImageIcon raizIcon= new ImageIcon("Assets/raiz maior.png");
	ImageIcon fecharIcon = new ImageIcon("Assets/X.png");

	// Tudo isso é instanciado na main e passado como variavel
        // Alga alga = new Alga();
        // Pocao pocao= new Pocao();
        // Raiz raiz= new Raiz();
        // Personagem giu= new Personagem();
	Container contentPaneAtual = frame.getContentPane();
        JPanel contentPane = new JPanel(null);
	contentPane.setPreferredSize(new Dimension(1350, 1010));

        JButton algaBotao = new JButton();
	algaBotao.setFocusable(false);
	algaBotao.setHorizontalTextPosition(JButton.CENTER);
	algaBotao.setVerticalTextPosition(JButton.CENTER);
        algaBotao.setIcon(algaIcon);
	algaBotao.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 22));
	algaBotao.setForeground(new Color(29, 60, 144));
	algaBotao.setBackground(new Color(255, 176, 120));
	algaBotao.setBorder(BorderFactory.createLineBorder(new Color(242, 112, 5), 5));
	algaBotao.setBounds(550, 400, 120, 120);

        JButton raizBotao = new JButton();
	raizBotao.setFocusable(false);
	raizBotao.setHorizontalTextPosition(JButton.CENTER);
	raizBotao.setVerticalTextPosition(JButton.CENTER);
	raizBotao.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 22));
        raizBotao.setIcon(raizIcon);
	raizBotao.setForeground(new Color(29, 60, 144));
	raizBotao.setBackground(new Color(255, 176, 120));
	raizBotao.setBorder(BorderFactory.createLineBorder(new Color(242, 112, 5), 5));
	raizBotao.setBounds(850, 400, 120, 120);

        JButton pocaoBotao = new JButton();
	pocaoBotao.setFocusable(false);
	pocaoBotao.setHorizontalTextPosition(JButton.CENTER);
	pocaoBotao.setVerticalTextPosition(JButton.CENTER);
	pocaoBotao.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 22));
        pocaoBotao.setIcon(pocaoIcon);
	pocaoBotao.setForeground(new Color(29, 60, 144));
	pocaoBotao.setBackground(new Color(255, 176, 120));
	pocaoBotao.setBorder(BorderFactory.createLineBorder(new Color(242, 112, 5), 5));
	pocaoBotao.setBounds(250, 400, 120, 120);

        JButton fechar = new JButton();
	fechar.setFocusable(false);
	fechar.setHorizontalTextPosition(JButton.CENTER);
	fechar.setVerticalTextPosition(JButton.CENTER);
	fechar.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 22));
        fechar.setIcon(fecharIcon);
	fechar.setForeground(new Color(29, 60, 144));
	fechar.setBackground(new Color(255, 176, 120));
	fechar.setBorder(BorderFactory.createLineBorder(new Color(242, 112, 5), 5));
	fechar.setBounds(1000, 300, 45, 45);
	// Botar uma mensagem pra quando o item for usado
        ActionListener botao = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    if (e.getSource() == algaBotao) {
			if(giu.consumirItem(alga)) {
			    contentPane.remove(pocaoBotao);;
			    frame.repaint();
			}
		    } else if (e.getSource() == raizBotao) {
			if(giu.consumirItem(raiz)) {
			    contentPane.remove(raizBotao);
			    frame.repaint();
			}
		    } else if (e.getSource() == pocaoBotao) {
			if(giu.consumirItem(pocao)) {
			    contentPane.remove(pocaoBotao);
			    frame.repaint();
			}
		    } else if (e.getSource() == fechar) {
			frame.setContentPane(contentPaneAtual);
			frame.repaint();
		    }
		}};

        algaBotao.addActionListener(botao);
	raizBotao.addActionListener(botao);
	pocaoBotao.addActionListener(botao);
	fechar.addActionListener(botao);


	// Só adiciona se o item existir
	// Fazer tratamento de exceções pra quando o item acabar
	// (tirar os botões, talvez mover)
	if (giu.getMochila().contains(pocao)) contentPane.add(pocaoBotao);
	if (giu.getMochila().contains(alga)) contentPane.add(algaBotao);
	if (giu.getMochila().contains(raiz)) contentPane.add(raizBotao);
	contentPane.add(fechar);

        frame.setContentPane(contentPane);
        frame.pack();
    }
}
