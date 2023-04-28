
package guijava;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cal  implements ActionListener{
    
        Form form = new Form();
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();
        Panel panel3 = new Panel();
        
        JButton num1 = new JButton("1");
        JButton num2 = new JButton("2");
        JButton num3 = new JButton("3");
        JButton plus = new JButton("+");
        JButton sum = new JButton("sum");

        JTextField f1 = new JTextField();

        
    public Cal() {
        
        form.setLayout(null);


        panel1.setBounds(0, 0, 400,40);
        panel2.setBounds(0, 40, 400, 50);
        panel3.setBounds(0, 40+50, 500, 50);

 
        panel2.add(num1);
        panel2.add(num2);
        panel2.add(num3);
        
        num1.addActionListener(this);
        num2.addActionListener(this);
        num3.addActionListener(this);
        
        
        panel3.add(sum);
        panel3.add(plus);
        sum.addActionListener(this);
        plus.addActionListener(this);

        panel1.add(f1);
        
        form.add(panel1);
        form.add(panel2);
        form.add(panel3);
        form.setSize(500,400);
        form.setVisible(true);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        int ans = 0;
        
     
        if(e.getSource() == num1 ){
            f1.setText("1");
            ans=ans+1;
        }
        if(e.getSource() == num2 ){
            f1.setText("2");
            ans=ans+2;
        }
        if(e.getSource() == num3 ){
            f1.setText("3");
            ans=ans+3;
        }
        if(e.getSource() == plus){
           f1.setText("+");

        }
        if(e.getSource() == sum){
           f1.setText(""+ans);

        }

    }

    
    
}
