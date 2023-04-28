
package guijava;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MyFlowLayout {

    public MyFlowLayout() {
        
        Form f1  =  new Form();
        f1.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        Panel panel1 = new Panel();
        Panel panel2 = new Panel();
        Panel panel3 = new Panel();
        
        
//        panel1.setPreferredSize(new Dimension(100, 100));
//        panel2.setPreferredSize(new Dimension(100, 100));
//        panel3.setPreferredSize(new Dimension(100, 100));

        
        for(int i=0 ; i<3;i++){
            panel1.add(new JButton("1"));   
        }
        
        for(int y=0 ; y<3;y++){
            panel2.add(new JButton("2"));   
        }
        
        for(int x=0 ; x<3;x++){
            panel3.add(new JButton("3"));   
        }
        
        f1.add(panel1);
        f1.add(panel2);
        f1.add(panel3);
        
        f1.setVisible(true);
    }
    
    

}
