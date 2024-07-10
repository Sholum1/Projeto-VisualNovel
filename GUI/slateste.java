package GUI;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class slateste extends JFrame implements ActionListener {
    JButton button;
    slateste(){
        button = new JButton("toque na lua");
        button.setBounds(200,100,100,50);
        button.addActionListener(this);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){

        }
    }
    
}
