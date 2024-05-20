package Personagem;

import java.util.ArrayList;
import Item.Item;
import Tabuleiro.Elemento;

public class Personagem implements Elemento {
    private final Lua lua;
    private int vida, energia, medo, felicidade;
    private final int dano;
    private ArrayList<Item> mochila;
    
    public Personagem() {
        this.vida = 20;
        this.energia = 10;
        this.medo = 5;
        this.felicidade = 5;
        this.dano = 3;
        this.mochila = new ArrayList<Item>();
	this.lua = new Lua(Lua.Fase.NOVA);
    }

    // Inicio dos Getters e Setters
    public Lua getLua() {
	return lua;
    }

    public int getDano() {
	return dano;
    }

    public int getEnergia() {
	return energia;
    }
    public void setEnergia(int energia) {
	this.energia = energia;
    }
    public int getFelicidade() {
	return felicidade;
    }
    public void setFelicidade(int felicidade) {
	this.felicidade = felicidade;
    }

    public int getMedo() {
	return medo;
    }
    public void setMedo(int medo) {
	this.medo = medo;
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
    // Parte da Mochila

    public void adicionarItem(Item item) {
        for (Item i : getMochila()) {
            if (item == i) {
		i.operaQuantidade('+');
		System.out.println("Giu possui: " + item.getQuantidade()
				   + item.getNome() + "s");
	    } else {
		getMochila().add(item);
		System.out.println("Giu adicionou " + item.getQuantidade()
				   + "na mochila");
	    }
	}
    }

    private void removerItem(Item item) {
	mochila.remove(item);
    }

    public void consumirItem(Item item) {
	for (Item i : getMochila()) {
	    if(item == i) {
		i.consumir(this);
		i.operaQuantidade('-');
		if (i.getQuantidade() == 0) {
		    removerItem(item);
		}
	    }
	}
    }


   public void verMochila() {
        System.out.print("Dentro da mochila há: ");
	for (Item i : getMochila()) {
	    System.out.print(i.getNome() + "[" + i.getQuantidade() + "], ");
	}
    }

}
