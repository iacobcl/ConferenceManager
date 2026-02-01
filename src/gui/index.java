package gui;

import javax.swing.*; 
import java.awt.*;    



public class index {
	
	
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Conference Manager System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);
        frame.setLocation(200, 100);

        JPanel panel = new JPanel();
        JButton button = new JButton("Click Me!");

        panel.add(button);
        frame.add(panel);

        frame.setVisible(true);
    }
}