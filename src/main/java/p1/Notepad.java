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

import java.awt.BorderLayout;
import javax.swing.*;
import java.io.File;
import java.nio.file.Path;
/**
 * This class is the main class for the notepad
 */
public class Notepad{
    public Frame frame;
    public JTextArea notepadTextArea;
    public JLabel statusBar;
    public JLabel addressBar;
    private MenuBar menuBar;
    public File fileRef;
    public String fileName = "Untitled";
    public Path filePath;
    public static String applicationName = "Notepad";
    public boolean saved = false;
    public int ln;
    public int col;

    /**
     * Constructor for the notepad
     */
    public Notepad() {
        //set up file
        fileRef = new File(fileName);
        filePath = fileRef.toPath();
        //set up frame
        frame = new Frame(500, 500, fileName + "-" + applicationName);
        //text area
        notepadTextArea = new JTextArea(20, 50);
        frame.add(new JScrollPane(notepadTextArea), BorderLayout.CENTER);
        //status bar
        statusBar = new JLabel(this.fileName + " - " + filePath.toString() + "||  " + applicationName, JLabel.RIGHT);
        frame.add(statusBar, BorderLayout.SOUTH);
        //menuBar
        menuBar = new MenuBar(this);
        frame.setJMenuBar(menuBar);
        //pack
        frame.pack();
        frame.setLocation(500, 100);
        frame.setVisible(true);
    }

    /**
     * mutator for file name, file path, and file reference
     * 
     * @param fileName name of the file
     * @param filePath path of the file
     * @param fileRef reference of the file
     */
    public void setFile(String fileName, Path filePath, File fileRef) {
        this.fileName = fileName;
        this.filePath = filePath;
        this.fileRef = fileRef;
    }

}
