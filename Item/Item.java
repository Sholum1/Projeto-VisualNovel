package Item;

public abstract class Item {
    private final boolean consumivel;
    private final boolean stackable;
    public int quant;

    public Item(boolean consumivel, boolean stackable, int quantidade) {
        this.consumivel = consumivel;
        this.stackable = stackable;
        this.quant = 0;
    }

    public boolean isConsumivel() {
        return consumivel;
    }

    public boolean isStackable() {
        return stackable;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quantidade) {
        this.quant = quantidade;
    }
}
