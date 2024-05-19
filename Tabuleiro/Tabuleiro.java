package Tabuleiro;

import java.util.ArrayList;

/**
 * Mapa
 */
public class Tabuleiro {
    private ArrayList<ArrayList<Elemento>> mapa = new ArrayList<>();
    private final int tamanho;

    public Tabuleiro(int tamanho) {
	this.tamanho = tamanho;
	for (int i = 0; i < tamanho; i++) {
	    mapa.add(new ArrayList<Elemento>());
	    for (int j = 0; j < tamanho; j++) {
		mapa.get(i).add(null);
	    }
	}
    }

    // Inicio dos Getters e Setters
    public ArrayList<ArrayList<Elemento>> getMapa() {
	return mapa;
    }
    public void setMapa(ArrayList<ArrayList<Elemento>> mapa) {
	this.mapa = mapa;
    }

    public int getTamanho() {
	return tamanho;
    }
    // Fim dos Getters e Setters

    public void adicionarElemento(Elemento elem, int x, int y) {
	if (x < tamanho) {
	    ArrayList<Elemento> coluna = mapa.get(x);
	    if (y < tamanho) coluna.add(elem);
	}
    }
    public Elemento removerElemento(int x, int y) {
	if (x < tamanho) {
	    ArrayList<Elemento> coluna = mapa.get(x);
	    if (y < tamanho) return coluna.remove(y);
	}
	return null;
    }
}
