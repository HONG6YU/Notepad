////////////////////FILE HEADER////////////////////
//
//Title:An enhanced notepad that allows you to take notes, keep diary, or write down anything you want.
//Version:0.0.1
//
//Features:Document encryption that keeps your privacy; Focus Mode that helps you focus on your writing.
//
//Author:Simon Fu
//Email:laissezfu@gmail.com
//
////////////////////CREDIT/////////////////////////
//
//Persons:None
//Online Sources:JAVA Swing component API(https://docs.oracle.com/javase/tutorial/uiswing/components/index.html), 
//    C语言中文网(http://c.biancheng.net/view/1206.html),JavaTPoint(https://www.javatpoint.com/java-swing)
//
///////////////////////////////////////////////////
package p1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

/**
 * This class allows users to save files as a new file or an existing file
 */
public class SaveFileAs extends AbstractAction {
    private static final long serialVersionUID = 1L;
    private String fileName;
    private File fileRef;
    private Path filePath;
    private Notepad notepad;
    JFileChooser chooser;
    FileWriter fileWriter;

    /**
     * constructor for save file as
     * 
     * @param npd the notepad to save
     */
    SaveFileAs(Notepad npd) {
        fileName = "untitled";
        fileRef = new File(fileName);
        filePath = fileRef.toPath();
        chooser = new JFileChooser();
        chooser.setApproveButtonText("Save file as");
        chooser.setCurrentDirectory(new File("."));
        notepad = npd;
    }

    /**
     * actions to perform when it's activated
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // use a file chooser to choose or create a file
        chooser.showSaveDialog(notepad.frame);
        fileRef = chooser.getSelectedFile();
        try {
            fileWriter = new FileWriter(fileRef);
            fileWriter.write(notepad.notepadTextArea.getText());
            // update status
            notepad.saved = true;
            this.fileName = fileRef.getName();
            this.filePath = fileRef.toPath();
            // if write unsuccessfully
        } catch (IOException ioe) {
            notepad.saved = false;
        } finally {
            try {
                // update status
                notepad.setFile(this.fileName, this.filePath, this.fileRef);
                fileWriter.close();
            } catch (IOException ioe) {

            }

        }

    }

    /**
     * accessor for file reference
     * @return
     */
    public File getFile() {
        return this.fileRef;
    }
}
