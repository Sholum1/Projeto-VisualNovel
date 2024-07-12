/**
 * Boss
 */
public class Boss {
    private int ataque, ataqueEspecial, turno, vida;
    private String nome;

    public Boss(int ataque, int ataqueEspecial, int turno, int vida,
		String nome) {
	this.ataque = ataque;
	this.ataqueEspecial = ataqueEspecial;
	this.turno = turno;
	this.vida = vida;
	this.nome = nome;
    }
}
