package Item;

public class Raiz extends Item {
    private final int energia;
    private final int felicidade;

    public Raiz(boolean stackable, int quantidade, String nome, int energia, int felicidade) {
        super(stackable, quantidade, nome);
        this.energia = energia;
        this.felicidade = felicidade;
    }

    public int getEnergia() {
        return energia;
    }

    public int getFelicidade() {
        return felicidade;
    }
}
