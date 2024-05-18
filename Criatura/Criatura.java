package Criatura;

import Item.*;
import Personagem.*;

public class Criatura {
    private Item drop;
    private int dano, vida;
    final String nome;

    public Criatura(int dano, int vida, int x, int y, String nome) {
	this.dano = dano;
	this.vida = vida;
	this.nome = nome;
    }
    // Caso  seja uma criatura com drop
    public Criatura(Item item, int dano, int vida, int x, int y,
		       String nome) {
	this(dano, vida, x, y, nome);
	this.drop = item;
    }

    // Inicio dos Getters e Setters
    public String getNome() {
	return nome;
    }

    public int getDano() {
	return dano;
    }
    public void setDano(int dano) {
	this.dano = dano;
    }

    public Item getDrop() {
	return drop;
    }
    public void setDrop(Item drop) {
	this.drop = drop;
    }

    public int getVida() {
	return vida;
    }
    public void setVida(int vida) {
	this.vida = vida;
    }
    // Fim dos Getters e Setters

    // Caso a criatura esteja perto ela ataca o jogador

}
