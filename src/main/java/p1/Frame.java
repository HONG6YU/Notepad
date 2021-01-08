package p1;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Frame used to create window for the app
 */
public class Frame extends JFrame {
    // a UID for this class
    public static final long serialVersionUID = 1;

    /**
     * Default constructor for this class
     */
    Frame() {
        setTitle("My First App");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jl = new JLabel("asdf");
        java.awt.Container c = getContentPane();
        c.add(jl);
        setVisible(true);
    }
    /**
     * Override constructor
     * @param width width of the window
     * @param height height of the window
     * @param titleString title of the window
     */
    Frame(int width, int height, String titleString) {
        setTitle(titleString);
        setSize(width,height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}