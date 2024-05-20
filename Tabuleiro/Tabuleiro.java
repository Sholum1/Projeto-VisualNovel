package Tabuleiro;

import java.util.ArrayList;

import Personagem.*;
import Criatura.*;
import Npc.*;
import Item.*;

/**
 * Tabuleiro: Simula o mapa do jogo e faz as ações do tabuleiro
 *
 */
public class Tabuleiro {
    private ArrayList<ArrayList<Elemento>> mapa = new ArrayList<>();
    private final int tamanho;

    // Construtor
    public Tabuleiro(int tamanho) {
		this.tamanho = tamanho;
		for (int i = 0; i < tamanho; i++) {
			mapa.add(new ArrayList<Elemento>());
			for (int j = 0; j < tamanho; j++) {
			mapa.get(i).add(null);
			}
		}
    }

    //  Getters e Setters (tamanho é final, então só possui get)
    public ArrayList<ArrayList<Elemento>> getMapa() {
		return mapa;
    }
    public void setMapa(ArrayList<ArrayList<Elemento>> mapa) {
		this.mapa = mapa;
    }

    public int getTamanho() {
		return tamanho;
    }

	// Adiciona um elemento novo no mapa, na posição selecionada
    public void adicionarElemento(Elemento elem, int x, int y) {
		if (x < tamanho) {
			ArrayList<Elemento> coluna = mapa.get(x);
			if (y < tamanho) coluna.set(y, elem);
		}
    }

	// Remove o elemento da posição selecionada
    public Elemento removerElemento(int x, int y) {
		if (x < tamanho) {
			ArrayList<Elemento> coluna = mapa.get(x);
			if (y < tamanho) return coluna.remove(y);
		}
		return null;
    }

    // Imprime o estado atual do mapa
    public void mostraMapa() {
	for (int i = 0; i < tamanho; i++) {
	    System.out.print("\t\t");
	    for (int j = 0; j < tamanho; j++) {
		Elemento pos = mapa.get(i).get(j);
		if (pos == null) {
		    System.out.print("~ ");
		} else if (pos instanceof Personagem) {
		    System.out.print("G ");
		} else if (pos instanceof Criatura) {
		    Criatura criatura = (Criatura)pos;
		    char primeiraLetra = Character.toLowerCase
			(criatura.getNome().charAt(0));
		    System.out.print(primeiraLetra+" ");
		} else if (pos instanceof Item) {
		    System.out.println("I ");
		} else if (pos instanceof Npc) {
		    Npc npc = (Npc)pos;
		    char primeiraLetra = npc.getNome().charAt(0);
		    System.out.print(primeiraLetra+" ");
		}
	    }
	    System.out.println();
	}
    }

    // Acha a posição de um dado elemento
    private int[] achePosicao(Elemento elem) {
	int[] pos = null;
	for (int i = 0; i < tamanho; i++) {
	    for (int j = 0; j < tamanho; j++) {
		if (mapa.get(i).get(j) != null &&
		    mapa.get(i).get(j).equals(elem)) {
		    pos = new int[]{i ,j};
		    break;
		}
	    }
	}
	return pos;
    }

    // Vê a possibilidade de interagir com algo
    public boolean interagir(Personagem personagem, Elemento elem) {
	int[] posPersonagem = achePosicao(personagem),
	    posElem = achePosicao(elem),
	    delta = {0, 1, -1};

	for (int i = 0; i < 3; i++) {
	    for (int j = 0; j < 3; j++) {
		if (((posPersonagem[0] + delta[i]) == posElem[0]) &&
		    (posPersonagem[1] + delta[j] == posElem[1])) {
		    if (elem instanceof Npc) {
			Npc npc = (Npc)elem;
			System.out.println("Pressione [i] para interagir com "
					   + npc.getNome());
		    } else if (elem instanceof Item) {
			Item item = (Item)elem;
			System.out.println("Pressione [i] para colocar " +
					   item.getNome() + "na mochila");

		    }
		    return true;
		}
	    }
	}
	return false;
    }

    // Move um elemento
    private void mover(int xObjetivo, int yObjetivo, int xOriginal,
		       int yOriginal, Elemento elem) {
	if ((xObjetivo < getTamanho() && xObjetivo >= 0)
	    && (yObjetivo < getTamanho() && yObjetivo >= 0)) {
	    Elemento objetivo = mapa.get(xObjetivo).get(yObjetivo);
	    if (objetivo == null) {
		mapa.get(xObjetivo).set(yObjetivo, elem);
		mapa.get(xOriginal).set(yOriginal, null);
	    }
	}
    }

    // Move a Giu
    public void moverPersonagem(String opcao, Personagem personagem) {
	int[] pos = achePosicao(personagem);
	switch (opcao) {
	case "w":
	    mover(pos[0] - 1, pos[1], pos[0], pos[1], personagem);
	    break;
	case "s":
	    mover(pos[0] + 1, pos[1], pos[0], pos[1], personagem);
	    break;
	case "a":
	    mover(pos[0], pos[1] - 1, pos[0], pos[1], personagem);
	    break;
	case "d":
	    mover(pos[0], pos[1] + 1, pos[0], pos[1], personagem);
	    break;
	default:
	    break;
	}
    }
}
