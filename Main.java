import java.util.ArrayList;
import javax.swing.JFrame;

import Boss.*;
import Item.*;
import Personagem.*;
import GUI.*;

/** Main: Inicia o jogo
 *
 */
public class Main {
    public static void main(String[] args) {
	MyFrame frame =  new MyFrame();
	TelaInicial tela = new TelaInicial();
	tela.rodaTelaInicial(frame);
	Personagem giu = new Personagem();
	Alga alga = new Alga();
	Raiz raiz = new Raiz();
	Pocao pocao = new Pocao();
	Boss caranguejo = new Boss(1000, 1000, 2, 40000, "Caranguejo");
	giu.adicionarItem(pocao);
	giu.adicionarItem(raiz);
	// giu.adicionarItem(alga);
<<<<<<< HEAD
	//Mochila mochila = new Mochila();
	//mochila.mostraMochila(frame, giu, alga, pocao, raiz);
=======
	// Mochila mochila = new Mochila();
	Batalha bat = new Batalha();
	bat.Batalhar(frame, giu, caranguejo, alga, pocao, raiz);
>>>>>>> b2bb83553c75de7e4c9ff601dfc3e48cf2d5e5f7
    }
}
