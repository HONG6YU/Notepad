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
    private String fileName;
    private File fileRef;
    private Notepad notepad;
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
            notepad.saved = true;
            this.fileName = fileRef.getName();
            notepad.fileName = fileName;
            notepad.fileRef = fileRef;
        } catch (IOException ioe) {
            
        }
        finally{
            
            try {
                fileWriter.close();
            } catch (IOException ioe) {
                
            }
            
        }
        
    }
    public String getFileName() {
        return this.fileName;
    }
    public File getFile() {
        return this.fileRef;
    }
}
