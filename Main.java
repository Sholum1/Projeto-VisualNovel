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
	// TelaInicial tela = new TelaInicial();
	// tela.rodaTelaInicial(frame);
	Personagem giu = new Personagem();
	Alga alga = new Alga();
	Raiz raiz = new Raiz();
	Pocao pocao = new Pocao();
	Boss caranguejo = new Boss(2, 2, 2, 2, "Caranguejo");
	giu.adicionarItem(pocao);
	giu.adicionarItem(raiz);
	// giu.adicionarItem(alga);
	// Mochila mochila = new Mochila();
	Batalha bat = new Batalha();
	bat.Batalhar(frame, giu, caranguejo, alga, pocao, raiz);
    }
}
