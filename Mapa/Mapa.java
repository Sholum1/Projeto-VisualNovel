import java.util.ArrayList;

public class Mapa {
    ArrayList<npc> npc =new ArrayList<npc>();
    ArrayList<Monster> monster =new ArrayList<Monster>();
    ArrayList<Integer> chest =new ArrayList<Integer>(); //baú

    
    public Mapa (ArrayList<Integer> chest, ArrayList<npc> npc,ArrayList<Monster> monster ){
        this.chest=chest;
        this.npc=npc;
        this.monster=monster;
    }

    //getters and setters

    public ArrayList<Integer> GetChest(){
        return chest;
    }

    public ArrayList<npc> GetNPC(){
        return npc;
    }

    public ArrayList<Monster> GetMonster(){
        return monster;
    }

    //add in the array

    public void addMonster(Monster monsterToAdd){
        monster.add(monsterToAdd);
    }

    public void addChest(int chestToAdd){
        chest.add(chestToAdd);
    }

    public void addNPC(npc NPCToAdd){
        npc.add(NPCToAdd);
    }


    //remove from array

    public void RemoveMonster(Monster monsterToRemove){
        for (int i=0; i< monster.size();i++){
            if (monsterToRemove.equals(monster.get(i))){
                monster.remove(i);
              
            }
        }

    }

    public void RemoveNPC(npc npcToRemove){
        for (int i=0; i< npc.size();i++){
            if (npcToRemove.equals(npc.get(i))){
                npc.remove(i);
              
            }
        }

    }






    
}
