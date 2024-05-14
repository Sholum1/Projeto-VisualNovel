package Item;

public class Item {

    enum Itens { // O que fazer com a quantidade de cada item? Não pode estar no enum porque não faz sentido
        ESPADA(false, 0, 0),
        ARCO(false, 0, 0),
        FLECHA(false, 0, 0),
        POCAO(true, 0, 0),
        FRUTO(true, 10, 5),
        RAIZ(true, -2, 0);

        private final boolean consumivel;
        private final int vida;
        private final int energia;

        Itens(boolean consumivel, int vida, int energia) {
            this.consumivel = consumivel;
            this.vida = vida;
            this.energia = energia;
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
    
    }
    // Classe que será a "mochila" do protagonista
    protected void adicionarItem(Itens item) { // Se precisar ser acessado fora do pacote, provável ter que mudar para public
        // Se o item encontrado estiver presente no emun, pode ser guardado na mochila
    }

    protected void removerItem(Itens item) {
        // Se o item estiver dentro da mochila, pode ser removido

    }

    protected void consumirItem(Itens item) {
        // Se o item estiver presente na mochila e for "consumível"
        if (item.getConsumivel() == true) {
            // Calcular a cura e a energia obtidas em relação ao personagem
            System.out.println("Giu tem mais " + item.getEnergia() + " pontos de energia");
            System.out.println("A vida de Giu foi alterada em " + item.getVida() + " pontos");
            // Talvez seja melhor implementar com o toString depois
        }

    }

    protected void verItens() {
        System.out.println("Dentro da mochila há: ");
        for (Itens i : Itens.values()) {
            System.out.println(i + " ");
        }
    }

}