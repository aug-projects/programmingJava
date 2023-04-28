
package guijava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextField;

public class MyBorderLayout {

    public MyBorderLayout() {
        Form f1  =  new Form();
        Label l1      = new Label();
        JTextField t1 = new JTextField(12);
        
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();
        Panel panel3 = new Panel();
        Panel panel4 = new Panel();
        Panel panel5 = new Panel();
        
        panel2.setBackground(Color.white);
        panel2.setBackground(Color.red);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.blue);
        panel5.setBackground(Color.gray);

        
        panel1.setPreferredSize(new Dimension(50, 50));
        panel2.setPreferredSize(new Dimension(50, 50));
        panel3.setPreferredSize(new Dimension(50, 50));
        panel4.setPreferredSize(new Dimension(50, 50));
        panel5.setPreferredSize(new Dimension(50, 50));
        
        
        
        
        f1.add(panel1,BorderLayout.NORTH);
        f1.add(panel2,BorderLayout.WEST);
        f1.add(panel3,BorderLayout.EAST);
        f1.add(panel4,BorderLayout.SOUTH);
        f1.add(panel5,BorderLayout.CENTER);

        panel1.add(l1);
        panel1.add(t1);
        f1.setVisible(true);

    }

        
}
