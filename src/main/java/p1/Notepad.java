package p1;



import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Notepad {
    /**
     *
     */
    Frame frame;
    JTextArea textArea;
    JLabel statusBar;
    private String fileName = "Untitled";
    public String applicationName = "Notepad";
    private boolean saved = true;

    FileOperation fileOperator;

    Notepad() {
        frame = new Frame(500, 500, fileName + "-" + applicationName);
        textArea = new JTextArea(30, 60);
        statusBar = new JLabel("||   Ln 1, Col 1", JLabel.RIGHT);
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER_ALIGNMENT);
        frame.add(statusBar, BorderLayout.BOTTOM_ALIGNMENT);
        frame.add(new JLabel(" "), BorderLayout.LEFT_ALIGNMENT);
        frame.add(new JLabel(" "), BorderLayout.RIGHT_ALIGNMENT);
        frame.pack();
        frame.setLocation(100, 50);
        frame.setVisible(true);
        frame.setLocation(150, 50);
        fileOperator = new FileOperation(this);
    }
}
