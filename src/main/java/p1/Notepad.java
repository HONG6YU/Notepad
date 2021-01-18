package p1;

import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.nio.file.Path;

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
    public Path filePath;
    public static String applicationName = "Notepad";
    public boolean saved = false;
    public int ln;
    public int col;

    public Notepad() {
        frame = new Frame(500, 500, fileName + "-" + applicationName);
        //text area
        notepadTextArea = new JTextArea(20, 50);
        fileRef = new File(fileName);
        filePath = fileRef.toPath();

        //status bar
        statusBar = new JLabel(this.fileName + " - " + filePath.toString() + "||  " + applicationName, JLabel.RIGHT);
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

    public void setFile(String fileName, Path filePath, File fileRef) {
        this.fileName = fileName;
        this.filePath = filePath;
        this.fileRef = fileRef;
    }
}
