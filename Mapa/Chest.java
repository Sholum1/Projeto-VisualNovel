import java.util.ArrayList;

import NPC.NPC;

public class Chest {


    public Chest (){
       
        
    }
    
    //add in the array

    public void addMonster(Monster monsterToAdd, ArrayList<Monster> monster){
        monster.add(monsterToAdd);
    }

    public void addChest(int chestToAdd, ArrayList<Integer> chest){
        chest.add(chestToAdd);
    }

    public void addNPC(NPC NPCToAdd, ArrayList<NPC> npc){
        npc.add(NPCToAdd);
    }


    //remove from array

    public void RemoveMonster(Monster monsterToRemove,ArrayList<Monster> monster ){
        for (int i=0; i< monster.size();i++){
            if (monsterToRemove.equals(monster.get(i))){
                monster.remove(i);
              
            }
        }

    }

    public void RemoveNPC(NPC npcToRemove, ArrayList<NPC> npc){
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
