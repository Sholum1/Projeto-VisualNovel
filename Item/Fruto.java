package Item;

public class Fruto extends Item {
    private final int vida;
    private final int energia;
    private final int felicidade;
    private final int medo;

    public Fruto(boolean stackable, int quant, int vida, int energia, int felicidade, int medo) {
        super(stackable, quant);
        this.vida = vida;
        this.energia = energia;
        this.felicidade = felicidade;
        this.medo = medo;
    }

    public int getVida() {
        return vida;
    }

    public int getEnergia() {
        return energia;
    }

    public int getFelicidade() {
        return felicidade;
    }
    
    public int getMedo() {
        return medo;
    }
}
