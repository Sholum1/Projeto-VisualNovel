public class Npc {

}
package Npc;

/*Fiz a classe normal, mas fui ver nql plano desenhado q a gnt fez que era pra ser uma classe abstrata, 
  mas n entendi como ia ser isso se ia ter varios npcs, com falas diferentes, qqr coisa eu conserto dps,
*/

public class Npc {
    private final String nome;
    private final int[] pos = {0, 0};
    private final String dialogo;

    public Npc(String nome, String dialogo){
        this.nome = nome;
        this.dialogo = dialogo;
    }

    public String getNome(){
        return nome;
    }
    
    public String getDialogo(){
        return dialogo;
    }

    protected void falar(String texto){
        System.out.println(texto);
    }
}
