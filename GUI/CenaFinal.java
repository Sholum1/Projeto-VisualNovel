package GUI;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class CenaFinal {
    



    public void rodaConversaCenaFinal(MyFrame frame) {
		String[] out = {"<html>&emsp;&ensp;Finalmente respirando ar, após um longo tempo,"+
		" Giu se vê deslocada.<html>"+
		"<html><br>&emsp;&ensp;E navega pelo mar...<br>&emsp;&ensp;E navega pelo mar...<html>",
		"<html>&emsp;&ensp;Grandes ondas surgem!<html>",
		"<html>&emsp;&ensp;Uma onda de 100 metros de comprimento se aproxima<html>"+
		" da pequena embarcação<br>&ensp;e destrói tudo sem piedade.<html>",
		"<html>&emsp;&ensp;Passados 10 segundos, mais uma, e logo após mais uma.<html>",
		"<html>&emsp;&ensp;Giu não consegue nem respirar no intervalo em que essas<html>"+
		" ondas atingem-na. Ela se<br>&ensp;agarra a pedaços da madeira quem um dia foram<html>"+
		" o barco e enfrenta uma nova onda.<html>",
		"<html>&emsp;&ensp;Após uma semana, as ondas de 100 metros continuam vindo, <html>"+
		"mas mais espaçadas.<html>",
		"<html>&emsp;&ensp;Quando elas chegam, destroem tudo completamente,<html>"+
		" mas no pequeno intervalo<br>&ensp;entre uma e outra, há tempo pra respirar e organizar a mente.<html>",
		"<html>&emsp;&ensp;Após um tempo, as ondas pararam de vir, e Giu pôde <html>"+
		" reconstruir seu barco com a<br>&ensp;ajuda de seus novos amigos.",
		"<html>&emsp;&ensp;Até que, em meio à calmaria do mar, uma grande onda surge no horizonte.<html>",
		"<html>&emsp;&ensp;É o aniversário de Luna.<html>",
        "<html>&emsp;&ensp;Tudo se destrói novamente, e tudo o que sobra são destroços <html>"+
		"do belo barco que<br>&ensp;tinha em conjunto com Luna: a vela é o dia em a <html>"+
		"carregou no pequeno saco com<br>&ensp;água da escola até seu aquário.<html>",
		"<html>&emsp;&ensp;O mastro a traz de volta ao dia em que andavam pela costa do mar procurando<br>&ensp;conchas.<html>",
        "<html>&emsp;&ensp;O luto vem em ondas, e destrói o lindo navio que "+
		"<html>cultivaram juntas, e todos os seus<br>&ensp;destroços boiando no mar após <html>"+
		"uma grande onda passar te lembram do quão lindo<br>&ensp;era estar ao "+
		"lado de Luna.<html>",
		"<html>&emsp;&ensp;Agora são apenas antigas memórias, as quais Giu se <html>"+
		"agarra para não afundar até as<br>&ensp;profundezas do oceano.",
		"<html>&emsp;&ensp;No entanto, dessa vez Giu já sabia: "+
		"<html>a onda passaria, iria encharcá-la, destruiria o<br>&ensp;navio todo de novo... <html>"+
		"E iria passar...",
		"<html>&emsp;&ensp;As roupas iram secar eventualmente, e ela juntará <html>"+
		"novamente as memórias, mesmo<br>&ensp;que os pedaços não de encaixem mais, "+
		"e viverá confortavelmente sabendo que<br>&ensp;em um ponto do passado, "+
		"pôde dividir este lindo navio com Luna."};
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
    }
}


