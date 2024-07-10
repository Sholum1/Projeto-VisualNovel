import java.util.ArrayList;
import java.util.Scanner;

import Criatura.*;
import Item.*;
import Npc.*;
import Tabuleiro.*;
import Personagem.*;
import GUI.*;
import javax.swing.JFrame;

/** Main: Inicia o jogo
 *
 */
public class Main {
    public static void main(String[] args) {
	ConversaLua conv = new ConversaLua();
	conv.rodaConvers();
    }
}
