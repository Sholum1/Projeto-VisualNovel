package GUI;
import java.awt.event.ActionEvent;

import javax.swing.*;


public class boss extends JFrame{


    JFrame frame =new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,500);
    frame.setLayout(new FlowLayout());

    frame.add(new JButton("kill it"));
    frame.add(new JButton("run"));


}

    