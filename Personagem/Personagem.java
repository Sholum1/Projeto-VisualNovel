package Personagem;

import java.util.ArrayList;

import Criatura.Criatura;
import Item.Item;

public class Personagem {
    private int vida;
    private int energia;
    private int medo;
    private int felicidade;
    private int dano;
    ArrayList<Item> mochila;
    
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

    private int getEnergia(){
        return energia;
    }

    private void setEnergia(int energia){
        this.energia = energia;
    }

    private int getMedo(){
        return medo;
    }

    private void setMedo(int medo){
        this.medo = medo;
    }

    private int getFelicidade(){
        return felicidade;
    }

    private void setFelicidade(int felicidade){
        this.felicidade = felicidade;
    }

    private int getDano(){
        return dano;
    }

    private void setDano(int dano){
        this.dano = dano;
    }

    // Ação de receber dano
    protected void tomarDano(int dano) {
        int vidaPosDano = vida - dano;
        // Caso o resultado der menor que zero, a vida vai pra zero
        this.vida = (vidaPosDano < 0) ? 0 : vidaPosDano;
        System.out.println("Giu recebeu " + dano + " de dano!");
        }

    // Parte da Mochila
    private ArrayList<Item> getMochila() {
        return mochila;
    }

    // Classe que será a "mochila" do protagonista
    protected void adicionarItem(Itens item, ArrayList<Item> mochila) { // Se precisar ser acessado fora do pacote, provável ter que mudar para public
        // Se o item encontrado estiver presente no emun, pode ser guardado na mochila
        for (Itens i : Itens.values()) {
            if (item == i) {
                for (int j = 0; j < mochila.size(); j++) {
                    if (item.equals(mochila.get(j)) && item.getStackable()) {
                        // Adicionar o item
                    }
                }
                // Confere se já consta na mochila e se é stackable
                // Se tudo ok, adiciona no array de itens que representa a mochila
                // Calcula a nova quantidade existente nela
            } else {
                System.out.println("O item não pode ser guardado na mochila");
            }
        }

        // Caso não possa ser adicionado, dispensar o item
    }

    protected void removerItem(Itens item) {
        // Se o item estiver dentro da mochila, pode ser removido

    }

    protected void consumirItem(Itens item) {
        // Se o item estiver presente na mochila e for "consumível"
        if (item.getConsumivel()) {
            // Calcular a cura e a energia obtidas em relação ao personagem
            System.out.println("Giu tem mais " + item.getEnergia() + " pontos de energia");
            System.out.println("A vida de Giu foi alterada em " + item.getVida() + " pontos");
            // Talvez seja melhor implementar com o toString depois
        }

    }

    protected void verItens() {
        System.out.println("Dentro da mochila há: ");
        // Percorrer o array que representa os itens guardados na mochila
    }

    protected void dispensarItem(Itens item) { // Talvez esse método não precise existir
        System.out.println("O tem foi abandonado por Giu");
    }

}
