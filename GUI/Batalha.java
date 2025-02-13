package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Personagem.*;
import Boss.*;
import GUI.TelaInicial;
import Item.*;

public class Batalha {
    public void Batalhar (MyFrame frame, Personagem giu, Boss boss, Alga alga,
			  Pocao pocao, Raiz raiz) {

	ImageIcon fundo = new ImageIcon("Assets/mapa carangueijo boss corais.png");
        ImageIcon bossIcon = new ImageIcon("Assets/carangueijo marujo amor doce.png");
        ImageIcon giuPerfil = new ImageIcon("Assets/giu and luna in game.png");

		// ImageIcon fundo = new ImageIcon();
		// ImageIcon bossIcon = new ImageIcon();
		// if (boss.getNome().equals("Polvo")) {
		// fundo.setImage("Assets/..."); //Não sei qual é o fundo do polvo
		// bossIcon.setImage("Assets/..."); // Não sei qual é a imagem do polvo
		// } else {
		// fundo.setImage("Assets/mapa carangueijo boss corais.png");
		// bossIcon.setImage("Assets/carangueijo marujo amor doce.png");
		// }

		// O resto mantem engual

		// Adicionar a barra de vida tbm, botei nela como que pensei
		// em fazer o calculo


		JLabel label = new JLabel();
		label.setIcon(fundo);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0, 0, 1350, 1010);

		JLabel bossCenario = new JLabel();
		bossCenario.setIcon(bossIcon);
		bossCenario.setVerticalAlignment(JLabel.CENTER);
		bossCenario.setHorizontalAlignment(JLabel.CENTER);
		bossCenario.setBounds(140, -115, 1350, 1010);

		JLabel giuCenario = new JLabel();
		giuCenario .setIcon(giuPerfil);
		giuCenario .setVerticalAlignment(JLabel.CENTER);
		giuCenario .setHorizontalAlignment(JLabel.CENTER);
		giuCenario.setBounds(470, -120, 1350, 1010);

		JLabel opcoes = new JLabel();
		opcoes.setBackground(new Color(235, 217, 188));
		opcoes.setBounds(40, 800, 1000, 180);
		opcoes.setBorder(BorderFactory.createLineBorder(new Color(255, 176, 120), 14, false));
		opcoes.setHorizontalTextPosition(JLabel.LEFT);
		opcoes.setVerticalTextPosition(JLabel.TOP);
		opcoes.setForeground(new Color(29, 60, 144));
		opcoes.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 28));
		opcoes.setVerticalAlignment(JLabel.CENTER);
		opcoes.setHorizontalAlignment(JLabel.LEFT);
		opcoes.setOpaque(true);

		JLabel giuStats = new JLabel();
		giuStats.setBackground(new Color(235, 217, 188));
		giuStats.setBounds(1010, 470, 310, 120);
		giuStats.setBorder(BorderFactory.createLineBorder(new Color(255, 176, 120), 10, false));
		giuStats.setText("Giu & Lua");
		giuStats.setHorizontalTextPosition(JLabel.LEFT);
		giuStats.setVerticalTextPosition(JLabel.CENTER);
		giuStats.setForeground(new Color(29, 60, 144));
		giuStats.setFont(new Font("Times New Roman", Font.BOLD, 24));
		giuStats.setVerticalAlignment(JLabel.CENTER);
		giuStats.setHorizontalAlignment(JLabel.CENTER);
		giuStats.setOpaque(true);

		JLabel bossStats = new JLabel();
		bossStats.setBackground(new Color(235, 217, 188));
		bossStats.setBounds(350, 300, 310, 120);
		bossStats.setBorder(BorderFactory.createLineBorder(new Color(255, 176, 120), 10, false));
		bossStats.setText("Caranguejo Marujo");
		bossStats.setHorizontalTextPosition(JLabel.LEFT);
		bossStats.setVerticalTextPosition(JLabel.CENTER);
		bossStats.setForeground(new Color(29, 60, 144));
		bossStats.setFont(new Font("Times New Roman", Font.BOLD, 24));
		bossStats.setVerticalAlignment(JLabel.CENTER);
		bossStats.setHorizontalAlignment(JLabel.CENTER);
		bossStats.setOpaque(true);

		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(1350, 1010));
		contentPane.add(bossCenario);
		contentPane.add(giuCenario);
		contentPane.add(label);

		JButton ataque = new JButton("Ataque");
		ataque.setFocusable(false);
		ataque.setHorizontalTextPosition(JButton.CENTER);
		ataque.setVerticalTextPosition(JButton.CENTER);
		ataque.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 22));
		ataque.setForeground(new Color(29, 60, 144));
		ataque.setBackground(new Color(242,242,242));
		ataque.setBorder(BorderFactory.createLineBorder(new Color(255, 176, 120), 5));
		ataque.setBounds(100, 820, 300, 40);

		JButton ataqueLua = new JButton("Ataque com a Lua");
		ataqueLua.setFocusable(false);
		ataqueLua.setHorizontalTextPosition(JButton.CENTER);
		ataqueLua.setVerticalTextPosition(JButton.CENTER);
		ataqueLua.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 22));
		ataqueLua.setForeground(new Color(29, 60, 144));
		ataqueLua.setBackground(new Color(242,242,242));
		ataqueLua.setBorder(BorderFactory.createLineBorder(new Color(255, 176, 120), 5));
		ataqueLua.setBounds(100, 870, 300, 40);

		JButton mochila = new JButton("Ver mochila");
		mochila.setFocusable(false);
		mochila.setHorizontalTextPosition(JButton.CENTER);
		mochila.setVerticalTextPosition(JButton.CENTER);
		mochila.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 22));
		mochila.setForeground(new Color(29, 60, 144));
		mochila.setBackground(new Color(242,242,242));
		mochila.setBorder(BorderFactory.createLineBorder(new Color(255, 176, 120), 5));
		mochila.setBounds(100, 920, 300, 40);

		frame.setContentPane(contentPane); // Define o JPanel como o conteúdo do frame

		Rendicao proximo = new Rendicao();
		TelaInicial inicio = new TelaInicial();
		Mochila abrirMochila = new Mochila();
		ActionListener botao = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    if (e.getSource() == ataque) {
			boss.setVida(boss.getVida() - giu.getDano());
			rodaTurnos(giu, boss, frame, proximo, inicio);
		    } else if (e.getSource() == ataqueLua) {
			try {
			    giu.getLua().refletir(boss);
			}
			catch (NaoAtacaException m) {
			    // Botar isso numa caixa de dialogo
			    m.getMessage();
			}
			rodaTurnos(giu, boss, frame, proximo, inicio);
		    } else if (e.getSource() == mochila) {
				abrirMochila.mostraMochila(frame, giu, alga, pocao, raiz);
		    }
		}
	    };

		ataque.addActionListener(botao);
		ataqueLua.addActionListener(botao);
		mochila.addActionListener(botao);

		label.add(ataque);
		label.add(ataqueLua);
		label.add(mochila);
		frame.setContentPane(contentPane);
		label.add(opcoes);
		opcoes.add(giuStats);
		opcoes.add(bossStats);

		frame.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		}
	    });
		label.add(giuStats);
		label.add(bossStats);
		frame.pack();
		}
		private static void rodaTurnos(Personagem giu, Boss boss, MyFrame frame,
					Conversa proximo, TelaInicial inicio) {
		giu.getLua().mudaFase();
		giu.getLua().mudaTempo();
		if (boss.desistiu()) {
			// Antes disso tem um diálogo dele desistindo salvo engano
			frame.getContentPane().removeAll();
			proximo.rodaConversa(frame);
		}
		boss.ataca(giu);
		if (giu.perdeu()) {
			// Talvez antes disso adicionar um texto tipo
			// "Você morreu deseja reiniciar o jogo?"
			frame.getContentPane().removeAll();
			inicio.rodaTelaInicial(frame);
		}
    }
}
