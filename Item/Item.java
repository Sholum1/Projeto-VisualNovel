package Item;

import java.util.ArrayList;

public class Item {

    enum Itens {
        /*
         * O que fazer com a quantidade de cada item?
         * Não pode estar no enum porque não faz sentido
         * 
         * Java permite adicionar itens iguais no array? Se sim, dá pra fazer isso e ter método para contar
         * 
         * Mas isso é meio burrinho. Então, se pá que dá para stackar os itens iguais de fato, Porém... como fazer isso?
         * 
         * Fazer uma lista de ITEM, QUANT dentro do array mochila
         */
        
        ESPADA(false, 0, 0, false),
        ARCO(false, 0, 0, false),
        FLECHA(false, 0, 0, true),
        POCAO(true, 0, 0, true),
        FRUTO(true, 10, 5, true),
        RAIZ(true, -2, 0, true);

        private final boolean consumivel;
        private final int vida;
        private final int energia;
        private final boolean stackable;

        Itens(boolean consumivel, int vida, int energia, boolean stackable) {
            this.consumivel = consumivel;
            this.vida = vida;
            this.energia = energia;
            this.stackable = stackable;
        }
        // Se o item não estiver no enum, não pode ser colocado na mochila

        private boolean getConsumivel() {
            return consumivel;
        }

        private int getVida() {
            return vida;
        }

        private int getEnergia() {
            return energia;
        }

        private boolean getStackable() {
            return stackable;
        }
    
    }

    ArrayList<Item> mochila = new ArrayList<Item>();

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