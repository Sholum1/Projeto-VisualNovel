package GUI;
import java.util.*;

import Item.Alga;
import Item.Pocao;
import Item.Raiz;


public class Mochila{

    Mochila(){

        Scanner scanner =new Scanner(System.in);
        Alga alga = new Alga();
        Pocao pocao= new Pocao();
        Raiz raiz= new Raiz();

        if(scanner.equals("1") ){
            //alga
            alga.consumir(ProgressBar progessbar);

            

        }
        if(scanner.equals("2")){
            pocao.consumir(ProgressBar progressbar);
        }
        if(scanner.equals("3")){
            //raiz
            raiz.consumir(ProgressBar progressbar);
        }
        
        
        scanner.close();
    }


}
