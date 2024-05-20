package Item;

import Personagem.Personagem;

public class Raiz extends Item {
    public Raiz() {
	super("Raiz");
    }

    @Override
    public void consumir(Personagem personagem) {
	personagem.setEnergia(personagem.getEnergia() + 3);
	personagem.setFelicidade(personagem.getFelicidade() - 2);
    }

}
