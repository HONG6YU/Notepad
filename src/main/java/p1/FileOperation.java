package p1;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


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
        this.jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        jFileChooser.setCurrentDirectory(new File("."));
    }

    public boolean saveFile(File tempFile) {
        FileWriter fout = null;
        try {
            fout = new FileWriter(tempFile);
            fout.write(npd.notepadTextArea.textArea.getText());
        } catch (IOException ioe) {
            updateStatus(tempFile, false);
            return false;
        } finally {
            try {
                fout.close();
            } catch (IOException ioe) {
            }
        }
        updateStatus(tempFile, true);
        return false;
    }

    public boolean saveThisFile() {
        if (!newFileFlag) {
            return saveFile(fileRef);
        }
        return saveAsFile();
    }

    public boolean saveAsFile() {
        File temp = null;
        jFileChooser.setDialogTitle("Save as...");
        jFileChooser.setApproveButtonText("Save");
        jFileChooser.setApproveButtonMnemonic(KeyEvent.VK_S);
        jFileChooser.setApproveButtonToolTipText("Click to Save");
        do {
            if (jFileChooser.showSaveDialog(this.npd.frame) != JFileChooser.APPROVE_OPTION) {
                return false;
            }
            temp = jFileChooser.getSelectedFile();
            if (!temp.exists()) {
                break;
            }
            if (JOptionPane.showConfirmDialog(this.npd.frame,
                    temp.getPath() + "already exists. Do you want to replace it?", "Save As",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        break;
            }
        } while (true);
        return saveFile(temp);
    }

    // boolean openFile(File tempFile){
    //     FileInputStream fin = null;
    //     BufferedReader din = null;
    //     try {
    //         fin = new FileInputStream(tempFile);
    //     } catch (Exception e) {
    //         //TODO: handle exception
    //     }

    // }


    public void updateStatus(File temp, boolean saved) {
        if (saved) {
            this.isSaved = true;
            fileName = temp.getName();
            fileRef = temp;
            npd.frame.setTitle(fileName + "-" + npd.applicationName);
            npd.statusBar.setText("File: " + temp.getPath() + " | saved/opened successfully");
        } else {
            npd.statusBar.setText("File: " + temp.getPath() + " | failed to save/open");
        }
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
