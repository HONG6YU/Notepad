package p1;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.*;
import java.awt.event.*;

public class Notepad implements ActionListener{
    /**
     *
     */
    Frame frame;
    SimpleTextArea notepadTextArea;
    JLabel statusBar;
    MenuBar menuBar;

    private String fileName = "Untitled";
    public static String applicationName = "Notepad";
    private boolean saved = true;
    FileOperation fileHandler;
    int ln;
    int col;

    Notepad() {
        frame = new Frame(500, 500, fileName + "-" + applicationName);
        //text area
        notepadTextArea = new SimpleTextArea(20, 50);

        //status bar
        statusBar = new JLabel("||  " + applicationName, JLabel.RIGHT);
        frame.add(statusBar, BorderLayout.SOUTH);
        frame.add(new JScrollPane(notepadTextArea), BorderLayout.CENTER);

        //menuBar
        menuBar = new MenuBar();
        frame.setJMenuBar(menuBar);
        
        
        fileHandler = new FileOperation(this);

        


        //pack
        frame.pack();
        frame.setLocation(500, 100);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmdString = e.getActionCommand();
        if (cmdString.equals("Save")) {
            
        }

    }
}
