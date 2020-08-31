
package minor3;


import javax.swing.*;
import java.awt.*;


public class Cancel extends JFrame {

public static void main(String[] args) {
Cancel frameTabel = new Cancel();
}

JLabel w1 = new JLabel("OPTED TO CANCEL");
JPanel panel = new JPanel();

Cancel(){
super("Cancelled");
setSize(300,200);
setLocation(500,280);
panel.setLayout (null);

w1.setBounds(70,50,150,60);
w1.setFont(new Font("Verdana",Font.BOLD,12));

panel.add(w1);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

}
