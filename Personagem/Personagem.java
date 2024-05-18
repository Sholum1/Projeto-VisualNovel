package Personagem;

import java.util.ArrayList;

import Criatura.Criatura;
import Item.Item;

public class Personagem {
    private int[] pos = {0, 0};
    private int vida;
    private int energia;
    private int medo;
    private int felicidade;
    ArrayList<Item> mochila;
    
    // Fiz o Construtor aqui, mas como é só um Personagem, e ele vai ter valores iniciais, n sei se precisa, podia ta na definição da classe
    public Personagem(int vida, int energia, int medo, int felicidade){
        this.vida = vida;
        this.energia = energia;
        this.medo = medo;
        this.felicidade = felicidade;
        ArrayList<Item> mochila = new ArrayList<Item>(); // Acho que ela ia começar com arma né mas n lembro
    }

    // Getters e Setters
    public int[] getPos(){
        return pos;
    }

    public void setId(int[] pos){
        this.pos = pos;
    }

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
