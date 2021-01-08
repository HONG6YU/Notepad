package p1;


import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Notepad {
    /**
     *
     */
    Frame frame;
    SimpleTextArea notepadTextArea;
    JLabel statusBar;
    private String fileName = "Untitled";
    public String applicationName = "Notepad";
    private boolean saved = true;
    FileOperation fileOperator;
    int ln;
    int col;

    Notepad() {
        frame = new Frame(500, 500, fileName + "-" + applicationName);
        notepadTextArea = new SimpleTextArea(20,50);
        ln = notepadTextArea.textArea.getLineCount();
        statusBar = new JLabel("||  " + applicationName, JLabel.RIGHT);
        frame.add(statusBar,BorderLayout.SOUTH);
        frame.add(new JScrollPane(notepadTextArea),BorderLayout.CENTER);
        frame.pack();
        frame.setLocation(500, 100);
        frame.setVisible(true);
        fileOperator = new FileOperation(this);
    }
}
