package Personagem;

import java.util.ArrayList;

import Criatura.Criatura;
import Item. *;

public class Personagem {
    private int[] pos = {0, 0};
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
    private int[] getPos(){
        return pos;
    }

    private void setId(int[] pos){
        this.pos = pos;
    }

    private int getVida(){
        return vida;
    }

    private void setVida(int vida){
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

    // Ações de andar
    protected void andar(String dir){
        if (dir.equals("esquerda")){
            this.pos[0] -= 1;
        } 
        else if(dir.equals("direita")){
            this.pos[0] += 1;
        } 
        else if (dir.equals("baixo")){
            this.pos[1] -= 1;
        } 
        else if(dir.equals("cima")){
            this.pos[1] += 1;
            // Sempre adicionar os possíveis erros
            // Trate o usuário como uma criança
        }
        else {
            System.err.println("Opção inválida");
        }
    }

    // Suponha que o usuário é a pessoa mais burra possível
    protected void andarOutra(String dir){
        if (dir.equalsIgnoreCase("esquerda")){
            this.pos[0] -= 1;
        } 
        else if(dir.equalsIgnoreCase("direita")){
            this.pos[0] += 1;
        } 
        else if (dir.equalsIgnoreCase("baixo")){
            this.pos[1] -= 1;
        } 
        else if(dir.equalsIgnoreCase("cima")){
            this.pos[1] += 1;
        }
        else {
            System.err.println("Opção inválida");
        }
    }

    // Parte da Mochila
    private ArrayList<Item> getMochila() {
        return mochila;
    }

    protected void adicionarItem(Item item, ArrayList<Item> mochila) {
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

    protected void removerItem(Item item) {
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

    protected void consumirItem(Item item) {
        // Se o item estiver presente na mochila e for "consumível"
        if (item.isConsumivel()) {
            // Calcular a cura e a energia obtidas em relação ao personagem
            System.out.println("Giu tem mais " + item.getEnergia() + " pontos de energia");
            System.out.println("A vida de Giu foi alterada em " + item.getVida() + " pontos");
            // Talvez seja melhor implementar com o toString depois
        }

    }

    protected void verItens() { // método próprio da mochila
        System.out.println("Dentro da mochila há: ");
        // Percorrer o array que representa os itens guardados na mochila
    }

    protected void dispensarItem(Item item) { // Talvez esse método não precise existir
        System.out.println("O tem foi abandonado por Giu");
    }

}