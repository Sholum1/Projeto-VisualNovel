import Criatura.*;
/** Main: documentação...
 *
 *
 */
public class Main {
    // Documentação da outroMetodo
    public int outroMetodo() {
	return 2;
    }

    public static void main(String[] args) {
	Criatura criatura = new Criatura(100);

	criatura.andar("esquerda"); // Move
	System.out.println(criatura.getPos()[0]);
	criatura.andar("Esquerda"); // Retorna opção inválida
	// para evitar isso podemos usar a outra função andar
	criatura.andarOutra("Esquerda"); //Move
	System.out.println(criatura.getPos()[0]);
    }
}

// Fim do meu exemplo chato, qualquer coisa especifica de documentação do java
// a gente pode ver junto do material da Esther, mas no geral gosot desta maneira
