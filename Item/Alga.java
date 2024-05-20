package Item;

import Personagem.Personagem;

public class Alga extends Item {
    public Alga() {
        super("Alga");
    }

    @Override
    public void consumir(Personagem personagem) {
	personagem.setVida(personagem.getVida() + 3);
	personagem.setEnergia(personagem.getEnergia() - 3);
    }
}
