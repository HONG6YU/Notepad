package p1;

import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

public class FileOperation {
    private Notepad npd;
    private File fileRef;

    private String fileName;

    private boolean newFileFlag;
    private boolean isSaved;

    private JFileChooser jFileChooser;

    FileOperation(Notepad npd) {
        this.npd = npd;
        this.fileRef = new File(fileName);
        this.fileName = "Untitled";
        this.newFileFlag = true;
        this.isSaved = true;
        this.jFileChooser = new  JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        jFileChooser.setCurrentDirectory(new File("."));
    }

    public boolean saveFile(File tempFile){
        FileWriter fout = null;
        try {
            fout = new FileWriter(tempFile);
        } catch (Exception e) {
            //TODO: handle exception
        }
        return false;
    }


    public boolean isSave() {
        return this.isSaved;
    }

    public void setSave(boolean saved) {
        this.isSaved = saved;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String newName) {
        this.fileName = newName;
    }
}
