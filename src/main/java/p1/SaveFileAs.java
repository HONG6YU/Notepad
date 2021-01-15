package p1;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;

public class SaveFileAs extends AbstractAction {
    String fileName;
    File fileRef;
    Notepad notepad;
    JTextArea simpleTextArea;
    JFileChooser chooser;

    SaveFileAs(Notepad npd){
        fileName = "untitled";
        fileRef = new File(fileName);
        chooser = new JFileChooser();
        chooser.setApproveButtonText("Save");
        chooser.setCurrentDirectory(new File("."));
        notepad = npd;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        chooser.showSaveDialog(notepad.frame);
    }
}
