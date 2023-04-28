package guijava;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.ImageIcon;


public class Form extends JFrame {

    public Form() {
        ImageIcon img = new ImageIcon("icon.png");
        this.setTitle("نافذة جديدة");
        this.setBackground(Color.white);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(img.getImage());
//        this.setLayout(null);
        this.setSize(500, 500); 
        this.setLocation(200,200);
//        this.setVisible(true);
    }
     
}
