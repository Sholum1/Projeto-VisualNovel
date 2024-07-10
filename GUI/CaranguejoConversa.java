package GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class CaranguejoConversa {
    public void rodaConversa(MyFrame frame) {
        String[] out = {"<html>&emsp;&ensp;[CARANGUEJO MARUJO] Quem são <html>"+
        "<html>vocês? Não ultrapassem esses<br>&ensp;corais!<html>",
        "<html>&emsp;&ensp;[GIU] Estamos procurando a costa!<html>",
        "<html>&emsp;&ensp;[CARANGUEJO MARUJO] Huh... Eu já andei pela <html>"+
        "<html>costa... Naveguei<br>&ensp;em grandes navios... Em meus tempos de <html>"+
        "<html>pirata. Permitam-me uma<br>&ensp;apresentação: eu sou o Caranguejo<html>"+
        "<html> Marujo, da grande Garantia<br>&ensp;Vermelha.<html>",
        "<html>&emsp;&ensp;[CARANGUEJO MARUJO] Eu sei como ir para a costa!<html>"+
        "<html> Só é possível<br>&ensp;se ultrapassarem estes corais, que pertencem <html>"+
        "<html>à mim! Mas não<br>&ensp;permito a passagem de estranhos!<html>",
        "<html>&emsp;&ensp;Giu tem esperança após descobrir que está no sentido certo<br><html>"+
        "<html>&ensp;rumo à costa.<html>",
        "<html>&emsp;&ensp;[GIU] Só precisamos rapidamente nadar por entre<html>"+
        "<html> seus corais.<br>&ensp;Não iremos causar nenhum problema! Contorná-los<html>"+
        "<html> tomaria muito<br>&ensp;tempo...<html>",
        "<html>&emsp;&ensp;[CARANGUEJO MARUJO] O tempo é uma ilusão nesse<html>"+
        "<html> vasto mar...<br>&ensp;Vocês terão... que LUTAR!<html>"};
        //pensar como colocar um botão aqui
    
        ImageIcon fundo = new ImageIcon("Assets/mapa carangueijo boss corais.png");
        ImageIcon giu = new ImageIcon("Assets/giu amor doce.png");
        ImageIcon flanders = new ImageIcon("Assets/flanders rotacionado.png");
        ImageIcon caranguejoFundo = new ImageIcon("Assets/carangueijo marujo amor doce.png");

        JLabel caranguejoLonge = new JLabel();
        caranguejoLonge.setIcon(caranguejoFundo);
        caranguejoLonge.setVerticalAlignment(JLabel.CENTER);
        caranguejoLonge.setHorizontalAlignment(JLabel.CENTER);
        caranguejoLonge.setBounds(170, -250, 1350, 1010);
    
        JLabel flandersPerto= new JLabel();
        flandersPerto.setIcon(flanders);
        flandersPerto.setVerticalAlignment(JLabel.CENTER);
        flandersPerto.setHorizontalAlignment(JLabel.CENTER);
        flandersPerto.setBounds(0, -400, 1350, 1010);
    
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
        contentPane.add(flandersPerto);
        contentPane.add(caranguejoLonge);
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
    }
}
