package p1;

import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class Notepad implements ActionListener{
    /**
     *
     */
    public Frame frame;
    public JTextArea notepadTextArea;
    public JLabel statusBar;
    public JLabel addressBar;
    private MenuBar menuBar;
    public File fileRef;
    public String fileName = "Untitled";
    public static String applicationName = "Notepad";
    public boolean saved = false;
    public int ln;
    public int col;

    public Notepad() {
        frame = new Frame(500, 500, fileName + "-" + applicationName);
        //text area
        notepadTextArea = new JTextArea(20, 50);
        fileRef = new File(fileName);

        //status bar
        statusBar = new JLabel(this.fileName + " - " + this.fileRef.toPath() + "||  " + applicationName, JLabel.RIGHT);
        frame.add(statusBar, BorderLayout.SOUTH);

        frame.add(new JScrollPane(notepadTextArea), BorderLayout.CENTER);

        //menuBar
        menuBar = new MenuBar(this);
        frame.setJMenuBar(menuBar);

        //pack
        frame.pack();
        frame.setLocation(500, 100);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
