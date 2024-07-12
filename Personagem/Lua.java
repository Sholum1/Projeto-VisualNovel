package Personagem;

import Boss.*;

/**
 
 * A classe Lua representa a personagem Lua e suas fases. Essas últimas,
 * implementadas a partir de uma enumeração, terão valores distintos para
 * os atributos de ataque conforme a fase em que está situada.
 * 
 * Para tal, a classe conta com os métodos "mudaFase" e "refletir", o qual
 * será responsável pelos ataques.
 */
public class Lua {
    /*
     * A ideia é que conforme a fase a Lua possa refletir mais luz, aumentando
     * seu ataque, mas também o intervalo de tempo entre cada ataque.
     */
    public enum Fase {
	// 180 de dano no total (se sempre usa a lua)
        NOVA(60, 1), // A Lua nova praticamente não reflete luz na terra
	// 240 de dano no total
        CRESCENTE(80, 2), // A Lua crescente reflete um pouco mais de luz
	// 300 de dano no total
        CHEIA(300, 6), // A Lua cheia é a que mais reflete luz
	// 140 de dano no total
        MINGUANTE(140, 3); // A Lua minguante começa a refazer o ciclo

        private final int dano, tempoAtaque;

	// Construtor da Fase
        private Fase(int dano, int tempoAtaque) {
            this.dano = dano;
            this.tempoAtaque = tempoAtaque;
        }

	// Por serem final só possuem os Getters
	public int getDano() {
	    return dano;
	}
	public int getTempoAtaque() {
	    return tempoAtaque;
	}
    }

    private Fase fase = Fase.CHEIA;
    private int tempoFase = 6, tempoAtaqueCount = 0;

    // Construtor da Lua
    public Lua(){}

    // Inicio dos Getters e Setters
    public Fase getFase() {
	return fase;
    }
    public void setFase(Fase fase) {
	this.fase = fase;
    }
    public int getDanoLua() {
	return fase.getDano();
    }
    public int getTempoLua() {
	return fase.getTempoAtaque();
    }
    public int getTempoAtaqueCount() {
	return tempoAtaqueCount;
    }
    public void setTempoAtaqueCount(int tempoAtaqueCount) {
	this.tempoAtaqueCount = tempoAtaqueCount;
    }
    public int getTempoFase() {
	return tempoFase;
    }
    public void setTempoFase(int tempoFase) {
	this.tempoFase = tempoFase;
    }
    // Fim dos Getters e Setters

    // A cada 5 turnos a fase troca
    public String mudaFase() {
	if (this.tempoFase-- <= 0) {
	    if (getFase() == Fase.NOVA) {
		setFase(Fase.CRESCENTE);
	    } else if (getFase() == Fase.CRESCENTE) {
		setFase(Fase.CHEIA);
	    } else if (getFase() == Fase.CHEIA) {
		setFase(Fase.MINGUANTE);
	    } else if (getFase() == Fase.MINGUANTE) {
		setFase(Fase.NOVA);
	    }
	    this.tempoFase = 5;
	    return "A Lua mudou para a fase "+getFase();
	}
	return null;
    }

    // Ação de ataque da Lua. Seu dano depende da Fase
    public void refletir(Boss boss)
	throws NaoAtacaException {
	if (this.tempoAtaqueCount++ == getTempoLua()) {
	    int novaVida = (boss.getVida() - getDanoLua());
	    boss.setVida((novaVida < 0) ? 0 : novaVida);
	    this.tempoAtaqueCount = 0;
	} else {
	    throw new NaoAtacaException();
	}
    }
}
