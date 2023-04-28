
package guijava;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MetricConverter implements ActionListener{

    Form form = new Form();
    JPanel keyPanel   = new JPanel();
    JPanel inputPanel = new JPanel();
    JPanel resPanel   = new JPanel();
    JButton btn[]     = new JButton[13];
    JButton sum       = new JButton("sum");
    Container c;
    String btnNumb[]  = {"1","2","3","4","5","6","7","9","0",".","C","+"};
    JTextField input  = new JTextField(12);

    public MetricConverter() {
        
       form.setLayout(new BorderLayout(2, 2));
       
       /* input */
        inputPanel.add(input);
        input.setEditable(false);
        form.add(inputPanel,BorderLayout.NORTH);
        
        /* keybord */
       keyPanel.setLayout(new GridLayout(4, 5, 10, 10));
       form.add(keyPanel,BorderLayout.CENTER);
       
       for(int i =0;i<btn.length-1;i++){
           btn[i] = new JButton(btnNumb[i]);
           keyPanel.add(btn[i]);
           btn[i].addActionListener(this);
       }
               
       sum.addActionListener(this);
       keyPanel.add(sum);
       
       /* keybord */
       form.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        System.out.println(command);
        switch(command){
            
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case ".":
            case "+":
                input.setText(input.getText()+command);
             break;
             
             case "sum":
                 
                String s =input.getText();
                String [] ans = s.split("+", 2);
                double x = Double.parseDouble(ans[0]);
                double y = Double.parseDouble(ans[1]);
                double ansser = x+y;
                 System.out.println("ans is "+y +x);
                input.setText(String.valueOf(ansser));
                
               break; 
               
               
             default:
                 
            break;
        }
        
    }
    
        
   


}
