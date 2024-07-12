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
	giu.adicionarItem(pocao);
	giu.adicionarItem(raiz);
	// giu.adicionarItem(alga);
	Mochila mochila = new Mochila();
	mochila.mostraMochila(frame, giu, alga, pocao, raiz);
    }
}
