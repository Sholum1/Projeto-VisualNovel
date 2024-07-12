package Boss;

import Personagem.*;

/**
 * Boss
 */
public class Boss {
    private final int vidaTotal;
    private final int ataque, ataqueEspecial, turno;
    private int vida, count = 0;
    private final String nome;

    public Boss(int ataque, int ataqueEspecial, int turno,
		int vidaTotal, String nome) {
	this.ataque = ataque;
	this.ataqueEspecial = ataqueEspecial;
	this.turno = turno;
	this.vida = vidaTotal;
	this.vidaTotal = vidaTotal;
	this.nome = nome;
    }

    // Inicio dos Getters e Setters
    public int getAtaqueEspecial() {
	return ataqueEspecial;
    }
    public int getAtaque() {
	return ataque;
    }
    public String getNome() {
	return nome;
    }
    public int getTurno() {
	return turno;
    }
    public int getVidaTotal() {
	return vidaTotal;
    }
    public int getVida() {
	return vida;
    }
    public void setVida(int vida) {
	this.vida = vida;
    }
    // Fim dos Getters e Setters

    public void ataca(Personagem giu) {
	int vidaGiu = giu.getVida();
	if (this.count >= getTurno()) {
	    giu.setVida(vidaGiu - getAtaqueEspecial());
	    this.count = 0;
	} else {
	    giu.setVida(vidaGiu - getAtaque());
	    this.count++;
	}
    }

    public boolean desistiu() {
	return (vida <= 5);
    }
}
