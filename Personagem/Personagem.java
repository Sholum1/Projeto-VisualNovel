package Personagem;
import java.util.ArrayList;
import Item.*;

/**
 * A classe Personagem representa Giu, a protagonista da história, a qual será
 * controlada pelo usuário durante o jogo.
 * 
 * Para que possa guardar os itens que encontra no mapa e drops de criaturas,
 * leva consigo uma mochila, implementada aqui como um ArrayList de itens da
 * classe Item.
 * 
 * Para acessar a mochila, há os métodos "adicionarItem", "removerItem",
 * "consumirItem" e "verMochila".
 * 
 * Há também o método "perdeu", que verificará os atributos de Giu e retornará
 * se o usuário perdeu o jogo ou não (ou seja, se Giu morreu ou está viva).
 */
public class Personagem {
    private final Lua lua;
    private int vida;
    private final int dano;
    private ArrayList<Item> mochila;

    // Construtor
    public Personagem() {
        this.vida = 100;
        this.dano = 50;
        this.mochila = new ArrayList<Item>();
	this.lua = new Lua();
    }

    // Getters e Setters
    public Lua getLua() {
	return lua;
    }

    public int getDano() {
	return dano;
    }

    public int getVida() {
	return vida;
    }
    public void setVida(int vida) {
	this.vida = vida;
    }


    public ArrayList<Item> getMochila() {
	return mochila;
    }
    public void setMochila(ArrayList<Item> mochila) {
	this.mochila = mochila;
    }

    // Confere se Giu morreu
    public boolean perdeu() {
	return (getVida() <= 0 );
    }

    // Parte da Mochila

    // Confere se o item já existe na mochila e o adiciona ou aumenta seu número
    public void adicionarItem(Item item) {
	if (getMochila().isEmpty() || !getMochila().contains(item))
	    getMochila().add(item);
        for (Item i : getMochila()) {
	    int quant = i.getQuantidade() + 1;
            if (item == i) {
		i.setQuantidade(quant);
		break;
	    }
	}
    }

    // Remove o item da mochila
    private void removerItem(Item item) {
	mochila.remove(item);
    }

    // Usa o item, reduzindo a quantidade da mochila e aplicando seus efeitos
    public void consumirItem(Item item) {
	for (Item i : getMochila()) {
	    int quant = i.getQuantidade() - 1;
	    if(item == i) {
		i.consumir(this);
		if (quant <= 0) {
		    removerItem(item);
		} else i.setQuantidade(quant);;
		break;
	    }
	}
    }
}
