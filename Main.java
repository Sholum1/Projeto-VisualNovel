

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

    }
}
