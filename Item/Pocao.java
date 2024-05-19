package Item;

public class Pocao extends Item {
    private final int vida;
    private final int energia;
    private final int medo;

    public Pocao(boolean consumivel, boolean stackable, int vida, int energia, int medo) {
        super(consumivel, stackable);
        this.vida = vida;
        this.energia = energia;
        this.medo = medo;
    }

    public int getVida() {
        return vida;
    }

    public int getEnergia() {
        return energia;
    }

    public int getMedo() {
        return medo;
    }
}
