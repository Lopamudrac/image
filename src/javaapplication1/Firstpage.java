
/*<applet code="JavaApplication1" width =250 height=150>
<param name="img" value="appimg.jpg">
</applet>*/

package javaapplication1;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Firstpage extends Applet implements ActionListener {
 Button b;
 Image img;
 public void init()
 {
    JFrame f=new JFrame();
   JLabel ja= new JLabel(new ImageIcon("C:\\users\\lopa\\documents\\NetBeansProject\\JavaApplivation1\\appimg.jpg"));
   ja.setBounds(200,150,500,350);   
   b= new Button("Next");
   b.setBounds(400,500,100,60);
    add(b);
    f.setSize(800,600);
    f.setVisible(true);
 
 }
 
    
   public void paint(Graphics g){
      g.drawImage(img, 200,100, this);
   } 

    @Override
    public void actionPerformed(ActionEvent e) {
      repaint();  
    }
}
