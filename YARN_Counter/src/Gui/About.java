package Gui;

import javax.swing.*;

/**
 * Created by Md Piyal Hasan on 7/21/2017.
 */
public class About extends JFrame{
    JLabel l=new JLabel();
    About(){
        setBounds(300,200,250,360);
        setTitle("Profile");
        l.setIcon(new ImageIcon("C:\\Users\\Md Piyal Hasan\\Desktop\\YARN_Counter\\src\\about.PNG"));
        setResizable(false);
        add(l);
    }
}
