package p1;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SimpleTextArea extends JPanel implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected JTextArea textArea;
    private final static String newLine = "\n";

    public SimpleTextArea(int rows, int columns) {
        super(new GridBagLayout());
        textArea = new JTextArea(rows, columns);
        textArea.setEditable(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        add(scrollPane, c);

    }

    public void actionPerformed(ActionEvent evt) {

        textArea.setCaretPosition(textArea.getDocument().getLength());
    }

}
