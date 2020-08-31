/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minor3;
import javax.swing.*;

public class Reg_done extends JFrame {

public static void main(String[] args) {
Reg_done frameTabel = new Reg_done();
}

JLabel welcome = new JLabel("REGISTERED:SAVED TO DB");
JPanel panel = new JPanel();

Reg_done(){
super("REGISTRATION DONE");
setSize(300,200);
setLocation(500,280);
panel.setLayout (null);

welcome.setBounds(70,50,150,60);

panel.add(welcome);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

}