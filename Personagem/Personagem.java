package Personagem;

import java.util.ArrayList;

import Criatura.Criatura;
import Item. *;
import Item.Item;

public class Personagem {
    private Lua lua = new Lua(Lua.Fase.NOVA);
    private int vida;
    private int energia;
    private int medo;
    private int felicidade;
    private int dano;
    private ArrayList<Item> mochila = new ArrayList<Item>();
    
    // Fiz o Construtor aqui, mas como é só 1 Personagem, e ele vai ter valores iniciais, n sei se precisa, podia ta na definição da classe
    public Personagem(int vida, int energia, int medo, int felicidade, int dano){
        this.vida = vida;
        this.energia = energia;
        this.medo = medo;
        this.felicidade = felicidade;
        this.dano = dano;
        ArrayList<Item> mochila = new ArrayList<Item>();
    }

    // Getters e Setters
    public int getVida(){
        return vida;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public int getEnergia(){
        return energia;
    }

    public void setEnergia(int energia){
        this.energia = energia;
    }

    public int getMedo(){
        return medo;
    }

    public void setMedo(int medo){
        this.medo = medo;
    }

    public int getFelicidade(){
        return felicidade;
    }

    public void setFelicidade(int felicidade){
        this.felicidade = felicidade;
    }

    public int getDano(){
        return dano;
    }

    public void setDano(int dano){
        this.dano = dano;
    }

    // Ação de receber dano
    public void tomarDano(int dano) {
        int vidaPosDano = vida - dano;
        // Caso o resultado der menor que zero, a vida vai pra zero
        this.vida = (vidaPosDano < 0) ? 0 : vidaPosDano;
        System.out.println("Giu recebeu " + dano + " de dano!");
        }

    // Parte da Mochila
    private ArrayList<Item> getMochila() {
        return mochila;
    }

    public void adicionarItem(Item item, ArrayList<Item> mochila) {
        // Confere se já consta na mochila e se é stackable
        // Se tudo ok, adiciona no array de itens que representa a mochila
        // Calcula a nova quantidade existente nela
        // Caso não possa ser adicionado, dispensa o item

        for (int i = 0; i < mochila.size(); i++) {
            if ((item == mochila.get(i)) && item.isStackable()) {
                mochila.add(item);
                item.setQuant(item.getQuant() + 1);
                System.out.println("O item " + item + " foi adicionado à mochila.");
                break;

            } else if ((item == mochila.get(i)) && !item.isStackable()) {
                System.out.println("Giu só pode ter uma unidade de " + item + " em sua mochila.");
                break;
            }
        }

        mochila.add(item);
        item.setQuant(item.getQuant() + 1);
        System.out.println("O item " + item + " foi adicionado à mochila.");        
    }

    public void removerItem(Item item, ArrayList<Item> mochila) {
        // Se o item estiver dentro da mochila, pode ser removido
        for (int i = 0; i < mochila.size(); i++) {
            if (item == mochila.get(i)) {
                mochila.remove(i);
                item.setQuant(item.getQuant() - 1);
                System.out.println("O item " + item + " foi removido da mochila.");
                break;
            }
        }

        System.out.println("Não há item " + item + " na mochila.");

    }

    public void consumirPocao(Pocao pocao, ArrayList<Item> mochila) {
        if (mochila.contains(pocao)) {
            this.setVida(this.getVida() + pocao.getVida());
            this.setEnergia(this.getEnergia() + pocao.getEnergia());
            this.setMedo(this.getMedo() + pocao.getMedo());

            pocao.setQuant(pocao.getQuant() - 1);
        } else {
            System.out.println("Giu não tem a poção no momento.");
        }
    }

    public void consumirRaiz(Raiz raiz, ArrayList<Item> mochila) {
        if (mochila.contains(raiz)) {
            this.setEnergia(this.getEnergia() + raiz.getEnergia());
            this.setFelicidade(this.getFelicidade() + raiz.getFelicidade());

            raiz.setQuant(raiz.getQuant() - 1);
        } else {
            System.out.println("Giu não tem a raiz no momento.");
        }
    }

    public void consumirFruto(Fruto fruto, ArrayList<Item> mochila) {
        if (mochila.contains(fruto)) {
            this.setVida(this.getVida() + fruto.getVida());
            this.setEnergia(this.getEnergia() + fruto.getEnergia());
            this.setMedo(this.getMedo() + fruto.getMedo());
            this.setFelicidade(this.getFelicidade() + fruto.getFelicidade());

            fruto.setQuant(fruto.getQuant() - 1);
        } else {
            System.out.println("Giu não tem o fruto no momento.");
        }
    }

    public void verItens(ArrayList<Item> mochila) {
        // Percorre o array que representa os itens guardados na mochila
        System.out.println("Dentro da mochila há: ");
        for (Item item : mochila) {
            System.out.println(item.getNome() + ": " +item.getQuant());
        }
    }

}
