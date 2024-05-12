import java.util.ArrayList;

import Criatura.Criatura;

public class Map {
    ArrayList<NPC> npc =new ArrayList<NPC>();
    ArrayList<Criatura> monster =new ArrayList<Criatura>();
    ArrayList<Integer> chest =new ArrayList<Integer>(); //baú


    static final int DIMENSIONx= 32;
    static final int DIMENSIONy= 32;

    
    public Map (ArrayList<Integer> chest, ArrayList<NPC> npc,ArrayList<Criatura> monster ){
        this.chest=chest;
        this.npc=npc;
        this.monster=monster;
    }

    //getters and setters

    public ArrayList<Integer> GetChest(){
        return chest;
    }

    public ArrayList<NPC> GetNPC(){
        return npc;
    }

    public ArrayList<Monster> GetMonster(){
        return monster;
    }

    






    
}
