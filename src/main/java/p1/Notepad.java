package p1;


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

    Notepad() {
        frame = new Frame(500, 500, fileName + "-" + applicationName);
        statusBar = new JLabel("||   Ln 1, Col 1", JLabel.RIGHT);
        notepadTextArea = new SimpleTextArea(20,50);
        frame.add(statusBar);
        frame.add(new JScrollPane(notepadTextArea));

        frame.pack();
        frame.setLocation(100, 50);
        frame.setVisible(true);
        fileOperator = new FileOperation(this);
    }
}
