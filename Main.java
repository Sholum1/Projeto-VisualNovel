import java.util.ArrayList;
import java.util.Scanner;

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
    private static void err() {
	System.err.println("Opção inválida, tente novamente");
    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("\t\t   Afundando");
	System.out.println("Bem vindo ao nosso jogo, deseja" +
			   " iniciar o tutorial? [S/n]");
	String opcao = scan.nextLine();
	if (opcao.equalsIgnoreCase("Sim") || opcao.equalsIgnoreCase("S")) {
	    Tabuleiro tabuleiro = new Tabuleiro(8);
	    Personagem giu = new Personagem();
	    tabuleiro.adicionarElemento(giu, 4, 4);
	    LuaTutorial1 lua1 = new LuaTutorial1();
	    tabuleiro.adicionarElemento(lua1, 3, 4);
	    boolean jogando = true;
	    lua1.dialogo();
	    while (jogando) {
		tabuleiro.mostraMapa();
		opcao = scan.nextLine();
		tabuleiro.moverPersonagem(opcao, giu);
		boolean perto = tabuleiro.interagir(giu, lua1);
		if(perto) {
		    opcao = scan.nextLine();
		    if (opcao.equals("i")) {
			LuaTutorial2 lua2 = new LuaTutorial4();
			lua2.dialogo();
		    }
		}
	    }
	}
	scan.close();
    }
}
