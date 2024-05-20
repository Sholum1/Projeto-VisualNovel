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
    public void err() {
	System.err.println("Opção inválida, tente novamente");
    }
    public static void main(String[] args) {
	boolean jogando = true;
	while (jogando) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("\t\t Afundando");
	    System.out.println("Bem vindo ao nosso jogo, deseja" +
			       "iniciar o tutorial? [S/n]");
	    String opcao = scan.nextLine();
	    if (opcao.equalsIgnoreCase("Sim") || opcao.equalsIgnoreCase("S")) {
		Personagem giu = new Personagem();
		Tabuleiro tabuleiro = new Tabuleiro(8);
		LuaTutorial1 lua = new LuaTutorial1();
		lua = (LuaTutorial2)lua;
		tabuleiro.adicionarElemento(giu, 3, 4);
	    }

	}
    }
}
