package p1;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.AbstractAction;

public class SaveFile extends AbstractAction {
    private String fileName;
    private File fileRef;
    private Notepad notepad;
    FileWriter fileWriter;

    SaveFile(Notepad notepad) {
        this.notepad = notepad;
        this.fileRef = notepad.fileRef;
        this.fileName = notepad.fileName;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!notepad.saved) {
            SaveFileAs sfa = new SaveFileAs(notepad);
            return;
        }
        try {
            fileWriter = new FileWriter(fileRef);
            fileWriter.write(notepad.notepadTextArea.getText());
            notepad.saved = true;
        } catch (IOException ioe) {
            
        }
        finally{
            try {
                fileWriter.close();
            } catch (IOException ioe) {
                
            }
        }
        

    }
}
