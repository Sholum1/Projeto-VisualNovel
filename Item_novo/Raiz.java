package Item_novo;

public class Raiz extends Item {
    private final int energia;
    private final int felicidade;

    public Raiz(boolean consumivel, boolean stackable, int energia, int felicidade) {
        super(consumivel, stackable);
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
