package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BarcoSurge implements Conversa {
    private int count = 0;

    public void rodaConversa(MyFrame frame) {
		String[] out = {"<html>&emsp;&ensp;BARCO À VISTA!<br><html>"+ 
        "<html>&emsp;&ensp;TENTE INVADIR UM BARCO!<html>"};
	
		ImageIcon fundo = new ImageIcon("Assets/quadro barco de humanos.png");
	
		JLabel label = new JLabel();
		label.setIcon(fundo);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0, 0, 1350, 1010);
	
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(1350, 1010));
	
		contentPane.add(label);

        JLabel conversa = new JLabel();
        conversa.setBackground(new Color(235, 217, 188));
        conversa.setBounds(40, 800, 1250, 180);
        conversa.setText(out[0]);
        conversa.setHorizontalTextPosition(JLabel.LEFT);
        conversa.setVerticalTextPosition(JLabel.TOP);
        conversa.setForeground(new Color(29, 60, 144));
        conversa.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 28));
        conversa.setVerticalAlignment(JLabel.CENTER);
        conversa.setHorizontalAlignment(JLabel.LEFT);
        conversa.setOpaque(true);

        JButton invadir = new JButton("INVADIR");
        invadir.setFocusable(false);
        invadir.setHorizontalTextPosition(JButton.CENTER);
        invadir.setVerticalTextPosition(JButton.CENTER);
        invadir.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 22));
        invadir.setForeground(new Color(29, 60, 144));
        invadir.setBackground(new Color(242,242,242));
        invadir.setBorder(BorderFactory.createLineBorder(new Color(255, 176, 120), 5));
        invadir.setBounds(505, 170, 300, 50);
	

        BarcoHumanos proximo = new BarcoHumanos();
        ActionListener botao = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == invadir) {
                frame.getContentPane().removeAll();
                proximo.rodaConversa(frame);
            }
        }
        };
        invadir.addActionListener(botao);

        frame.setContentPane(contentPane); // Define o JPanel como o conteúdo do frame
        frame.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
        if(++count >= out.length) {
            frame.removeMouseListener(this);
            label.add(invadir);
            label.repaint();
        };
        conversa.setText(out[count]);
        }
        });

        label.add(conversa);
        frame.pack();
    }
}
