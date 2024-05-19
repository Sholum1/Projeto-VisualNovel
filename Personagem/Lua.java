package Personagem;

import Criatura.*;

/**
 * Lua
 */
public class Lua {
    // A ideia é que conforme a fase a Lua possa refletir mais luz,
    // aumentando assim seu ataque, mas também o intervalo de tempo entre
    // cada ataque
    private enum Fase {
        Nova(1, 3, 2), // A Lua nova praticamente não reflete luz na terra
        Crescente(4, 7, 4), // A Lua crescente reflete um pouco mais de luz
        Cheia(8, 12, 16), // A Lua nova é a que mais reflete luz
        Minguante(6, 10, 8); // A Lua minguante começa a refazer o ciclo

        private final int dano, tempoAtaque, distanciaAtaque;

	// Construtor da fase
        private Fase(int dano, int tempoAtaque, int distanciaAtaque) {
            this.dano = dano;
            this.tempoAtaque = tempoAtaque;
            this.distanciaAtaque = distanciaAtaque;
        }

	// Por serem final só possuem os Getters
	public int getDano() {
	    return dano;
	}

	public int getDistanciaAtaque() {
	    return distanciaAtaque;
	}

	public int getTempoAtaque() {
	    return tempoAtaque;
	}
    }

    private Fase fase;
    private int tempoCiclo = 29;

    public Lua(Fase fase) {
	this.fase = fase;
    }

    public Fase getFase() {
	return fase;
    }
    public void setFase(Fase fase) {
	this.fase = fase;
    }

    // Para evitar de ficar escrevendo a mesma coisa varias vezes
    public int getDanoLua() {
	return fase.getDano();
    }
    public int getDistanciaLua() {
	return fase.getDistanciaAtaque();
    }
    public int getTempoLua() {
	return fase.getTempoAtaque();
    }

    // A cada 29 ciclos do loop a fase troca (baseado nos 29 dias
    // para cada troca de fase)
    public void mudaFase() {
	if (tempoCiclo-- == 0) {
	    if (getFase() == Fase.Nova) {
		setFase(Fase.Crescente);
	    } else if (getFase() == Fase.Crescente) {
		setFase(Fase.Cheia);
	    } else if (getFase() == Fase.Cheia) {
		setFase(Fase.Minguante);
	    } else if (getFase() == Fase.Minguante) {
		setFase(Fase.Nova);
	    }
	    this.tempoCiclo = 29;
	}
    }

    public void refletir(Criatura criatura, int tempo) {
	if (tempo == getTempoLua()) {
	    int novaVida = (criatura.getVida() - getDanoLua());
	    criatura.setVida((novaVida < 0) ? 0 : novaVida);
	} else {
	    System.out.println("A Lua tenta refletir luz, mas está fraca");
	}
    }
}
