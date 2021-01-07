package p1;

import javax.swing.*;

import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.commons.SerialVersionUIDAdder;
import jdk.internal.platform.Container;

/**
 * Frame
 */
public class Frame extends JFrame{
    public static final long serialVersionUID = 1;
    Frame(){
        setTitle("My First App");
        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jl = new JLable("test window");
        java.awt.Container c = getContentPane();
        c.add(jl);
        setVisible(true);
    }
}