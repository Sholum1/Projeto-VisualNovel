import java.util.ArrayList;

import Item.*;
import Npc.*;
import Tabuleiro.*;

/** Main: documentação...
 *
 *
 */
public class Main {
    public static void main(String[] args) {
	Tabuleiro tabuleiro = new Tabuleiro(16);

	System.out.println(tabuleiro.getMapa());
	tabuleiro.getMapa().get(0).add(null);
    }
}
