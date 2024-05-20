package Item;

import Tabuleiro.Elemento;
import Personagem.Personagem;

public abstract class Item implements Elemento {
    private final String nome;
    private int quantidade;

    public Item(String nome) {
	this.nome = nome;
	this.quantidade = 0;
    }

    public String getNome() {
	return nome;
    }

    public int getQuantidade() {
	return quantidade;
    }
    public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
    }

    public void operaQuantidade(char sinal) {
	if (sinal == '+') {
	    this.quantidade++;
	} else if (sinal == '-') {
	    this.quantidade--;
	}
    }

    public abstract void consumir(Personagem personagem);
}
