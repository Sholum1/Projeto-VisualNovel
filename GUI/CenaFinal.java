package GUI;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class CenaFinal {
    



    public void rodaConversa(MyFrame frame) {
		String[] out = {"<html>&emsp;&ensp;finalmente respirando ar, após um longo tempo, Giu se vê deslocada.<html>"+
		"<html> e navega pelo mar...<br>&ensp;e navega pelo mar...<html>"+
		"<html> Grandes ondas surgem!<html>",
		"<html>&emsp;&ensp;Uma onda de 100metros de comprimento se aproximam da pequena embarcação e destroem tudo sem piedade.<html>",
		"<html>&emsp;&ensp;Ao se passarem 10 segundos, mais uma, e logo após mais uma.<html>",
		"<html>&emsp;&ensp;Giu não consegue nem respirar no intervalo que essas ondas a atingem. Ela se agarra a pedaços da madeira quem um dia foram o barco e enfrenta uma nova onda.<html>",
		"<html>&emsp;&enspApós uma semana, as ondas de 100 metros continuam vindo, mas mais espaçadas.<html>",
		"<html>&emsp;&ensp;Quando elas chegam elas destroem completamente tudo, mas no pequeno intervalo entre uma e outra, há tempo pra respirar e organizar a mente. <html>"+
		"<html>Após um tempo... as ondas pararam de vir e Giu pôde reconstruir seu barco com a ajuda de seus novos amigos, até que, em meio a calmaria do mar, uma grande onda surge no horizonte.<html>"+
		"<html>É o aniversário de Luna.<html>",
        "<html> Tudo se destrói novamente, e tudo oq sobram são destroços do belo barco que tinha em conjunto com Luna, o véu é o dia em a carregou no pequeno saco com água da escola até seu aquário. O mastro a trás de volta ao dia que andavam pela costa do mar procurando conchas.\r\n" + //
                        "<html>",
           "<html> o luto vem em ondas, e destrói o lindo navio que cultivaram juntas, e todos os destroços do navio boiando no mar após uma grande onda passar te lembram do quão lindo era estar ao lado de Luna, mas que agora são apenas antigas memórias, que Giu se agarra para não afundar no fundo do oceano.\r\n" + //
                              "<html>",  
              
		"<html>Mas dessa vez Giu já sabia, a onda passaria, a enxarcaria, destruiria o navio todo denovo, mas iria passar, as roupas iram secar eventualmente, e ela juntará novamente as memórias, mesmo que os pedaços não de encaixem mais, e viverá confortavelmente sabendo que em um ponto do passado, pôde dividir este lindo navio com Luna.\r\n" + //
                        "\r\n" + //
                        "<html>"};
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


