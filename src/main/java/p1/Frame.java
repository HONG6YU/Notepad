////////////////////FILE HEADER////////////////////
//
//Title:An enhanced notepad that allows you to take notes, keep diary, or write down anything you want.
//Version:0.0.1
//
//Features:Document encryption that keeps your privacy; Focus Mode that helps you focus on your writing.
//
//Author:Simon Fu
//Email:laissezfu@gmail.com
//
////////////////////CREDIT/////////////////////////
//
//Persons:None
//Online Sources:JAVA Swing component API(https://docs.oracle.com/javase/tutorial/uiswing/components/index.html), 
//    C语言中文网(http://c.biancheng.net/view/1206.html),JavaTPoint(https://www.javatpoint.com/java-swing)
//
///////////////////////////////////////////////////
package p1;

import javax.swing.JFrame;

/**
 * Frame used to create window for the app
 */
public class Frame extends JFrame {
    // a UID for this class
    public static final long serialVersionUID = 1;

    /**
     * Override constructor
     * 
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