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

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.AbstractAction;
/**
 * This class allows users to save files that they had been saved before
 */
public class SaveFile extends AbstractAction {

    private static final long serialVersionUID = 1L;
    private File fileRef;
    private Notepad notepad;
    private FileWriter fileWriter;
    private boolean saved;

    /**
     * constructor for this class
     * @param notepad the notepad of this operation
     */
    SaveFile(Notepad notepad) {
        this.notepad = notepad;
        this.fileRef = notepad.getFileRef();
        this.saved = notepad.getSaved();
    }

    /**
     * actions when it is activated
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        //update the fileRef
        this.fileRef = notepad.getFileRef();
        //If this is a new file and have not been saved before, save this file as
        if (!saved) {
            return;
        }
        //write context on the text area into the file
        try {
            fileWriter = new FileWriter(fileRef);
            fileWriter.write(notepad.getJTextArea().getText());
            notepad.setSaved(true);
        } catch (IOException ioe) {
            notepad.setSaved(false);
        }
        //close the file writer
        finally{
            try {
                fileWriter.close();
            } catch (IOException ioe) {
                
            }
        }
    }
}
