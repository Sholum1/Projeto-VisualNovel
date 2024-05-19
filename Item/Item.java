package Item;

public abstract class Item {
    private final boolean consumivel;
    private final boolean stackable;

    public Item(boolean consumivel, boolean stackable) {
        this.consumivel = consumivel;
        this.stackable = stackable;
    }

    public boolean isConsumivel() {
        return consumivel;
    }

    public boolean isStackable() {
        return stackable;
    }
}
