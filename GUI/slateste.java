package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class slateste extends Jframe implements ActionListener {

    MyFrame(){
        JButton button = new JButton("toque na lua");
        button.setBounds(200,100,100,50);


        this.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }
    
}
