import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Scanner;

import Criatura.*;
import Item.*;
import Tabuleiro.*;
import Personagem.*;
import GUI.*;
import javax.swing.JFrame;

/** Main: Inicia o jogo
 *
 */
public class Main {
    public static void main(String[] args) {
	MyFrame frame =  new MyFrame();
	TelaInicial tela = new TelaInicial();
	tela.rodaTelaInicial(frame);
    }
}
