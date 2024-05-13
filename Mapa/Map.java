import java.util.ArrayList;

import Criatura.Criatura;

public class Map {

    ArrayList<npc> npc =new ArrayList<npc>();
    ArrayList<Criatura> monster =new ArrayList<Criatura>();
    ArrayList<Integer> chest =new ArrayList<Integer>(); //baú


    static final int DIMENSION_X= 32;
    static final int DIMENSION_Y= 32;

    
    public Map ( ){
        
    }

    //getters and setters

    public ArrayList<Integer> GetChest(){
        return chest;
    }

    public ArrayList<npc> GetNPC(){
        return npc;
    }

    public ArrayList<Criatura> GetMonster(){
        return monster;
    }

    //add in the array
    
    public void addMonster(Criatura monsterToAdd, ArrayList<Criatura> monster){
        monster.add(monsterToAdd);
    }

    public void addChest(int chestToAdd, ArrayList<Integer> chest){
        chest.add(chestToAdd);
    }

    public void addNPC(npc NPCToAdd, ArrayList<npc> npc){
        npc.add(NPCToAdd);
    }


    //remove from array

    public void RemoveMonster(Criatura monsterToRemove,ArrayList<Criatura> monster ){
        for (int i=0; i< monster.size();i++){
            if (monsterToRemove.equals(monster.get(i))){
                monster.remove(i);
              
            }
        }

    }

    public void RemoveNPC(npc npcToRemove, ArrayList<npc> npc){
        for (int i=0; i< npc.size();i++){
            if (npcToRemove.equals(npc.get(i))){
                npc.remove(i);
              
            }
        }

    }

    public void RemoveChest(Integer chestToRemove, ArrayList<Integer> chest){
        for (int i=0; i< chest.size();i++){
            if (chestToRemove.equals(chest.get(i))){
                chest.remove(i);
              
            }
        }

    }






    
}
