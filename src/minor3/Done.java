/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minor3;

/**
 *
 * @author Hp
 */





import javax.swing.*;
import java.awt.*;


public class Done extends JFrame {

public static void main(String[] args) {
Cancel frameTabel = new Cancel();
}

JLabel w1 = new JLabel("YOU HAVE DONE");
JPanel panel = new JPanel();

Done(){
super("DONE");
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
