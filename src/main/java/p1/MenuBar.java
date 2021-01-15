package p1;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JMenu menuFile;
    JMenu menuEdit;
    JMenu menuHelp;
    JMenuItem menuItemSave;
    JMenuItem menuItemSaveAs;

    public MenuBar() {
        //menu File
        setMenuFile();
        //menu Edit
        setMenuEdit();
        //menu Help
        setMenuHelp();


        this.add(menuFile);
        this.add(menuEdit);
        this.add(menuHelp);

    }

    public void setMenuFile() {
        menuFile = new JMenu("File");
        menuFile.setMnemonic(KeyEvent.VK_F);
        menuFile.getAccessibleContext().setAccessibleDescription("File operations");
        menuItemSave = new JMenuItem("Save");
        menuFile.add(menuItemSave);
        menuItemSaveAs = new JMenuItem("Save as");
        menuFile.add(menuItemSaveAs);
    }

    public void setMenuEdit() {
        menuEdit = new JMenu("Edit");
        menuEdit.setMnemonic(KeyEvent.VK_E);
        menuEdit.getAccessibleContext().setAccessibleDescription("Edit operations");
    }

    public void setMenuHelp() {
        menuHelp = new JMenu("Help");
        menuHelp.setMnemonic(KeyEvent.VK_H);
        menuHelp.getAccessibleContext().setAccessibleDescription("Help with " + Notepad.applicationName);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
