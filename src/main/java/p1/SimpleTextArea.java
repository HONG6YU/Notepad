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
    protected JTextField textField;
    private final static String newLine = "\n";

    public SimpleTextArea() {
        super(new GridBagLayout());
        textField = new JTextField(20);
        textField.addActionListener(this);

        textArea = new JTextArea(5, 20);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;

        c.fill = GridBagConstraints.HORIZONTAL;
        add(textField, c);

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        add(scrollPane, c);

    }

    public void actionPerformed(ActionEvent evt) {
        String text = textField.getText();
        textArea.append(text + newLine);
        textField.selectAll();

        // Make sure the new text is visible, even if there
        // was a selection in the text area.
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }


}
