package Item;

import Personagem.Personagem;


/**

 * A classe Raiz herda da classe abstrata Item, e o faz porque confere valores
 * específicos de felicidade e energia à personagem principal ao ter um objeto
 * nela instanciado consumido.
 * 
 * Para tal, sobrescreve o método "consumir".
 */
public class Raiz extends Item {

    // Construtor
    public Raiz() {
	    super("Raiz");
    }

    // Dá ao Personagem os efeitos do item
    @Override
    public void consumir(Personagem personagem) {
        personagem.setVida(personagem.getVida() + 3);
   
    }

}
