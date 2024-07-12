package GUI;
import java.util.*;

import Item.Alga;
import Item.Pocao;
import Item.Raiz;
import Personagem.Personagem;


public class Mochila{

    Mochila(){

        Scanner scanner =new Scanner(System.in);
        Alga alga = new Alga();
        Pocao pocao= new Pocao();
        Raiz raiz= new Raiz();
        Personagem giu= new Personagem();
        String input=scanner.nextLine();

        if(input.equals("1") ){
            //alga
            alga.consumir(giu );

        }
        if(input.equals("2")){
            //pocao
            pocao.consumir(giu);
        }
        if(input.equals("3")){
            //raiz
            raiz.consumir( giu);
        }
        
        
        scanner.close();
    }


}
