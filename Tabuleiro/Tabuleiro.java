package Tabuleiro;

import java.util.ArrayList;

import Personagem.*;
import Criatura.*;
import Npc.*;
import Item.*;

/**
 * Mapa
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
		    char primeiraLetra = Character.toLowerCase
			(npc.getNome().charAt(0));
		    System.out.print(primeiraLetra+" ");
		}
	    }
	    System.out.println();

	}
    }
}
