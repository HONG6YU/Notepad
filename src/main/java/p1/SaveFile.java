package p1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;

public class SaveFile extends AbstractAction {
    String fileName;
    File fileRef;
    Notepad notepad;
    JTextArea simpleTextArea;


    SaveFile(Notepad npd){
        fileName = "untitled";
        fileRef = new File(fileName);
        notepad = npd;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
