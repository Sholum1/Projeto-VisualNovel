import java.util.ArrayList;

import Criatura.*;
import Item.*;
import Npc.*;
import Tabuleiro.*;
import Personagem.*;

/** Main: documentação...
 *
 *
 */
public class Main {
    public static void main(String[] args) {
	Tabuleiro tabuleiro = new Tabuleiro(8);
	Personagem giu = new Personagem(20, 20, 20, 20, 20);
	tabuleiro.adicionarElemento(giu, 3, 5);

	tabuleiro.mostraMapa();
    }
}
