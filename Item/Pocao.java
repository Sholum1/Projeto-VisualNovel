package Item;

import Personagem.Personagem;

public class Pocao extends Item {

    public Pocao() {
        super("Poção");
    }

    @Override
    public void consumir(Personagem personagem) {
	personagem.setEnergia(personagem.getEnergia() + 2);
	personagem.setMedo(personagem.getMedo() + 5);
    }
}
