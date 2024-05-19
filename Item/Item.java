package Item;

public abstract class Item {
    public final String nome;
    public final boolean stackable;
    public int quant;

    public Item(boolean stackable, int quantidade, String nome) {
        this.nome = nome;
        this.stackable = stackable;
        this.quant = 0;
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

    public String getNome() {
        return nome;
    }
}
