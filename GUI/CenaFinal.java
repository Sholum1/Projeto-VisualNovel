package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CenaFinal implements Conversa {
	private int count = 0;

    public void rodaConversa(MyFrame frame) {
		String[] out = {"<html>&emsp;&ensp;Finalmente respirando ar, após um longo tempo,"+
		" Giu se vê<br>&ensp;deslocada.<html>"+
		"<html><br>&emsp;&ensp;E navega pelo mar...<br>&emsp;&ensp;E navega pelo mar...<html>",
		"<html>&emsp;&ensp;Grandes ondas surgem!<html>",
		"<html>&emsp;&ensp;Uma onda de 100 metros de comprimento se aproxima<html>"+
		" da<br>&ensp;pequena embarcação e destrói tudo sem piedade.<html>",
		"<html>&emsp;&ensp;Passados 10 segundos, mais uma, e logo após mais uma.<html>",
		"<html>&emsp;&ensp;Giu não consegue nem respirar no intervalo em que essas<html>"+
		" ondas<br>&ensp;atingem-na. Ela se agarra a pedaços da madeira quem um dia foram<br>&ensp;<html>"+
		"o barco e enfrenta uma nova onda.<html>",
		"<html>&emsp;&ensp;Após uma semana, as ondas de 100 metros continuam vindo,<br>&ensp;<html>"+
		"mas mais espaçadas.<html>",
		"<html>&emsp;&ensp;Quando elas chegam, destroem tudo completamente,<html>"+
		" mas no<br>&ensp;pequeno intervalo entre uma e outra, há tempo pra respirar<br>&ensp;e organizar a mente.<html>",
		"<html>&emsp;&ensp;Após um tempo, as ondas pararam de vir, e Giu pôde <html>"+
		" reconstruir<br>&ensp;seu barco com a ajuda de seus novos amigos.",
		"<html>&emsp;&ensp;Até que, em meio à calmaria do mar, uma grande onda surge no<br>&ensp;horizonte.<html>",
		"<html>&emsp;&ensp;É o aniversário de Luna.<html>",
        "<html>&emsp;&ensp;Tudo se destrói novamente, e tudo o que sobra são destroços <html>"+
		"do<br>&ensp;belo barco que tinha em conjunto com Luna: a vela é o dia em que<br>&ensp;a <html>"+
		"carregou no pequeno saco com água da escola até seu aquário.<html>",
		"<html>&emsp;&ensp;O mastro a traz de volta ao dia em que andavam pela costa do<br>&ensp;mar procurando conchas.<html>",
        "<html>&emsp;&ensp;O luto vem em ondas, e destrói o lindo navio que "+
		"<html>cultivaram<br>&ensp;juntas. Todos os seus destroços boiando no mar após <html>"+
		"uma<br>&ensp;grande onda passar te lembram do quão lindo era estar ao "+
		"lado<br>&ensp;de Luna.<html>",
		"<html>&emsp;&ensp;Agora são apenas antigas memórias, as quais Giu se <html>"+
		"agarra para<br>&ensp;não afundar até as profundezas do oceano.",
		"<html>&emsp;&ensp;No entanto, dessa vez Giu já sabia: "+
		"<html>a onda passaria, iria<br>&ensp;encharcá-la, destruiria o navio todo de novo... <html>"+
		"E iria passar...",
		"<html>&emsp;&ensp;As roupas iram secar eventualmente, e ela juntará <html>"+
		"novamente as<br>&ensp;memórias, mesmo que os pedaços não de encaixem mais, "+
		"e viverá<br>&ensp;confortavelmente sabendo que em um ponto do passado, "+
		"pôde<br>&ensp;dividir este lindo navio com Luna."};
		//pensar como colocar um botão aqui
	
		ImageIcon fundo = new ImageIcon("Assets/cena final mar ondas.png");
	
		JLabel label = new JLabel();
		label.setIcon(fundo);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0, 0, 1350, 1010);
	
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(1350, 1010));
		contentPane.add(label);


		JLabel conversa = new JLabel();
		conversa.setBackground(new Color(235, 217, 188));
		conversa.setBounds(290, 800, 1000, 180);
		conversa.setText(out[0]);
		conversa.setHorizontalTextPosition(JLabel.LEFT);
		conversa.setVerticalTextPosition(JLabel.TOP);
		conversa.setForeground(new Color(29, 60, 144));
		conversa.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 28));
		conversa.setVerticalAlignment(JLabel.CENTER);
		conversa.setHorizontalAlignment(JLabel.LEFT);
		conversa.setOpaque(true);

		frame.setContentPane(contentPane); // Define o JPanel como o conteúdo do frame

		CenaFim proximo = new CenaFim();
		frame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			    if(++count >= out.length) {
				frame.removeMouseListener(this);
				frame.getContentPane().removeAll();
				proximo.rodaConversa(frame);
			    } else conversa.setText(out[count]);
			}
		    });
		label.add(conversa);
		frame.pack();
    }
}
