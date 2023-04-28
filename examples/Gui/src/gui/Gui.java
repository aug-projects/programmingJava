
package gui;

import javax.swing.*;
import java.awt.*;

public class Gui {


    public static void main(String[] args) {
        // Jfame 
        JFrame farme = new JFrame();
        farme.setVisible(true);
        // loyout
        JLabel lable = new JLabel("username");
        JTextField inuput = new JTextField(12);
        JButton btn = new JButton("login");
        
        Container pane = farme.getContentPane();
        pane.setLayout(new FlowLayout());
        pane.add(lable);
        pane.add(inuput);
        pane.add(btn);
        farme.pack();

        
        
    }
    
}
