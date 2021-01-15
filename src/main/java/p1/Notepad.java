package p1;

import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Notepad implements ActionListener{
    /**
     *
     */
    public Frame frame;
    public JTextArea notepadTextArea;
    public JLabel statusBar;
    private MenuBar menuBar;

    public String fileName = "Untitled";
    public static String applicationName = "Notepad";
    private boolean saved = true;
    public int ln;
    public int col;

    public Notepad() {
        frame = new Frame(500, 500, fileName + "-" + applicationName);
        //text area
        notepadTextArea = new JTextArea(20, 50);

        //status bar
        statusBar = new JLabel("||  " + applicationName, JLabel.RIGHT);
        frame.add(statusBar, BorderLayout.SOUTH);
        frame.add(new JScrollPane(notepadTextArea), BorderLayout.CENTER);

        //menuBar
        menuBar = new MenuBar();
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
