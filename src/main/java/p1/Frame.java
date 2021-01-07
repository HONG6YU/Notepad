package p1;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Frame
 */
public class Frame extends JFrame{
    public static final long serialVersionUID = 1;
    Frame(){
        setTitle("My First App");
        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jl = new JLabel("asdf");
        java.awt.Container c = getContentPane();
        c.add(jl);
        setVisible(true);
    }
}