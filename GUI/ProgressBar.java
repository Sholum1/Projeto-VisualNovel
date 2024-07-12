package GUI;

import java.awt.*;
import javax.swing.*;
public class ProgressBar {


    JFrame frame = new JFrame();
    JProgressBar bar= new JProgressBar(5,100);
    ProgressBar(){

        bar.setValue(100);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("Poppins", Font.BOLD,25));
        bar.setForeground(Color.green);
        bar.setBackground(Color.white);
        


        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        fill();
    }
    public void fill(){
        int counter =100 ;
        while(counter >=5){ //qnd da 5 de hp o boss se rende

            bar.setValue(counter);

            try{
                Thread.sleep(50);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            counter-=1;

            }
        bar.setString("Eu me rendo!");
    }
    
}
