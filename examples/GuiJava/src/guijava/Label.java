
package guijava;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Label extends JLabel{

    public Label() {
//        ImageIcon img = new ImageIcon("icon.png");
        this.setText("اسم المستخدم");
        this.setVisible(true);
//        this.setIcon(img);
        this.setVerticalTextPosition(JLabel.CENTER);
        this.setHorizontalTextPosition(JLabel.CENTER );
        this.setFont(new Font("Tajwal",Font.PLAIN,20));
//        this.setBackground(new Color(0xffeeeeee));
//        this.setOpaque(true);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
    }
     
}
