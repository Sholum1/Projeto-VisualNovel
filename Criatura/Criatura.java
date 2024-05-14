// Gosto de separar todas as famílias em arquivos separados
package Criatura;

public class Criatura {
    int vida;
    int[] pos = {0, 0};

    public Criatura(int vida) {
		this.vida = vida;
    }

    // Inicio dos Getters e Setters
    public int getVida() {
		return vida;
    }
    public void setVida(int vida) {
		this.vida = vida;
    }
    public int[] getPos() {
		return pos;
    }
    public void setId(int[] pos) {
		this.pos = pos;
    }
    // Fim dos Getters e Setters

    // Se necessário documentar a função (avaliar complexidade)
    public void tomarDano(int dano) {
		int vidaPosDano = vida - dano;
	//Explicação...
		this.vida = (vidaPosDano < 0) ? 0 : vidaPosDano;
    }

    // Usar ternário sempre que possível, apelar para If Else somente em casos
    // de múltiplas mudanças, exemplo:

    public void andar(String dir) {
		if (dir.equals("esquerda")) {
			this.pos[0] -= 1;
		} else if(dir.equals("direita")) {
			this.pos[0] += 1;
		} else if (dir.equals("baixo")) {
			this.pos[1] -= 1;
		} else if(dir.equals("cima")) {
			this.pos[1] += 1;
			// Sempre adicionar os possíveis erros
		// Trate o usuário como uma criança
		} else {
			System.err.println("Opção inválida");
		}
    }
    // Suponha que o usuário é a pessoa mais burra possível
    public void andarOutra(String dir) {
		if (dir.equalsIgnoreCase("esquerda")) {
			this.pos[0] -= 1;
		} else if(dir.equalsIgnoreCase("direita")) {
			this.pos[0] += 1;
		} else if (dir.equalsIgnoreCase("baixo")) {
			this.pos[1] -= 1;
		} else if(dir.equalsIgnoreCase("cima")) {
			this.pos[1] += 1;
		} else {
			System.err.println("Opção inválida");
		}
    }
}
