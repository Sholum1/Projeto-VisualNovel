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
        this.medo = 0;
        this.felicidade = 5;
        this.dano = 3;
        this.mochila = new ArrayList<Item>();
	this.lua = new Lua(Lua.Fase.Nova);
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

<<<<<<< HEAD
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

    // Ação de atacar
    protected void atacar(Criatura monstro) {
	    int novaVida = (criatura.getVida() - getDano());
        //Confere se a vida após o ataque é menor que zero, se for, é igualada à zero
	    criatura.setVida((novaVida < 0) ? 0 : novaVida);
    }

=======
>>>>>>> 023f94f (Varias pikas)
    // Parte da Mochila

    public void adicionarItem(Item item) {
        for (Item i : getMochila()) {
            if (item == i) {
            } else {
                System.out.println("O item não pode ser guardado na mochila");
            }
        }

        // Caso não possa ser adicionado, dispensar o item
    }

    protected void removerItem(Item item) {
        // Se o item estiver dentro da mochila, pode ser removido

    }

    protected void consumirItem(Item item) {
        // Se o item estiver presente na mochila e for "consumível"
        if (item.getConsumivel()) {
            // Calcular a cura e a energia obtidas em relação ao personagem
            System.out.println("Giu tem mais " + item.getEnergia() + " pontos de energia");
            System.out.println("A vida de Giu foi alterada em " + item.getVida() + " pontos");
            // Talvez seja melhor implementar com o toString depois
        }

    }

    protected void verItem() {
        System.out.println("Dentro da mochila há: ");
        // Percorrer o array que representa os itens guardados na mochila
    }

    protected void dispensarItem(Item item) { // Talvez esse método não precise existir
        System.out.println("O tem foi abandonado por Giu");
    }

}
