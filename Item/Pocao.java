package Item;

public class Pocao extends Item {
    private final int vida;
    private final int energia;
    private final int medo;
    
    public Pocao(boolean stackable, int quantidade, String nome, int vida, int energia, int medo) {
        super(stackable, quantidade, nome);
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
