package p1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFileAs extends AbstractAction {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    String fileName;
    File fileRef;
    Notepad notepad;
    JTextArea simpleTextArea;
    JFileChooser chooser;
    FileWriter fileWriter;

    SaveFileAs(Notepad npd){
        fileName = "untitled";
        fileRef = new File(fileName);
        chooser = new JFileChooser();
        chooser.setApproveButtonText("Save file as");
        chooser.setCurrentDirectory(new File("."));
        notepad = npd;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        chooser.showSaveDialog(notepad.frame);
        fileRef = chooser.getSelectedFile();
        try {
            fileWriter = new FileWriter(fileRef);
            fileWriter.write(notepad.notepadTextArea.getText());
        } catch (IOException ioe) {
            
        }
        finally{
            this.fileName = fileRef.getName();
            try {
                fileWriter.close();
            } catch (IOException ioe) {
                
            }
            
        }
        
    }
    public String getFileName() {
        return this.fileName;
    }
}
