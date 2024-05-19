package Item;

public class Raiz extends Item {
    private final int energia;
    private final int felicidade;

    public Raiz(boolean consumivel, boolean stackable, int quant, int energia, int felicidade) {
        super(consumivel, stackable, quant);
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
