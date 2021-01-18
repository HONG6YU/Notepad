package p1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class SaveFileAs extends AbstractAction {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String fileName;
    private File fileRef;
    private Path filePath;
    private Notepad notepad;
    JFileChooser chooser;
    FileWriter fileWriter;

    SaveFileAs(Notepad npd){
        fileName = "untitled";
        fileRef = new File(fileName);
        filePath = fileRef.toPath();
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
            this.filePath = fileRef.toPath();
        } catch (IOException ioe) {
            notepad.saved = false;
        }
        finally{
            
            try {
                notepad.setFile(this.fileName, this.filePath, this.fileRef);
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
    public String getFileAddress() {
        return this.fileRef.getAbsolutePath();
    }
}
