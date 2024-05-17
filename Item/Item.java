package Item;
// Mudar mochila para a classe Personagem

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

}