package GUI;

import java.awt.*;
import javax.swing.*;
public class ProgressBar {
    JFrame frame = new JFrame();
    JProgressBar bar= new JProgressBar(5,100);

    ProgressBar() {
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
        // fill(); O Fill fica onde a gente roda a barra com bar.fill()
    }
    // Progresso = (vida atual do monstro - dano)*100/vida total
    public void fill(int progresso){
	bar.setValue(progresso);
    }
}
