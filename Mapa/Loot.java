public class Loot {
    private int healPotion;
    private int fearPotion;
    private int happinessPotion;


    public Loot (int healPotion, int fearPotion, int happinessPotion){
        this.healPotion=healPotion;
        this.fearPotion=fearPotion;
        this.happinessPotion=happinessPotion;
    }

    //getters and setters

    public int GetHealPotion(){
        return healPotion;
    }
    public void SetHealPotion(int NewHealPotion){
        this.healPotion=NewHealPotion;
    }

    public int GetFearPotion(){
        return fearPotion;
    }
    public void SetFearPotion(int NewFearPotion){
        this.fearPotion=NewFearPotion;
    }
    public int GetHappinessPotion(){
        return happinessPotion;
    }
    public void SetHappinessPotion(int NewHappinessPotion){
        this.happinessPotion=NewHappinessPotion;
    }

    //drinking the potions

    public void Drinking(int playerAtribute, int Potion, int playerAtributemax ){

        if(playerAtribute<playerAtributemax){
            
            playerAtribute=playerAtribute+healPotion;

        }

        if(playerAtribute>playerAtributemax){
            playerAtribute=playerAtributemax;
        }

    }

    
}
