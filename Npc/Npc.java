package Npc;

import Tabuleiro.Elemento;

public abstract class Npc implements Elemento {

   protected final String nome;

   protected Npc(String nome) {
       this.nome = nome;
    }

    // Inicio dos Getters e Setters
    public String getNome(){
        return nome;
    }

    // Fim dos Getters e Setters

    protected abstract void dialogo();
}
