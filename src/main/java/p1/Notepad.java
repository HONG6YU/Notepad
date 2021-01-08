package p1;


import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Notepad {
    /**
     *
     */
    Frame frame;
    SimpleTextArea textArea;
    JLabel statusBar;
    private String fileName = "Untitled";
    public String applicationName = "Notepad";
    private boolean saved = true;
    FileOperation fileOperator;

    Notepad() {
        frame = new Frame(500, 500, fileName + "-" + applicationName);
        statusBar = new JLabel("||   Ln 1, Col 1", JLabel.RIGHT);
        textArea = new SimpleTextArea();
        frame.add(new JScrollPane(textArea));
        frame.pack();
        frame.setLocation(100, 50);
        frame.setVisible(true);
        fileOperator = new FileOperation(this);
    }
}
