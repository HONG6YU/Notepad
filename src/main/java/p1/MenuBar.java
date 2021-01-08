package p1;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class MenuBar extends JMenuBar implements ActionListener{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JMenu menuFile;
    JMenu menuEdit;
    JMenu menuHelp;
    JMenu submenuFile;
    JMenuItem menuItemSave;
    JMenuItem menuItemSaveAs;

    public MenuBar(){
        //menu File
        menuFile = new JMenu("File");
        menuFile.setMnemonic(KeyEvent.VK_F);
        menuFile.getAccessibleContext().setAccessibleDescription("File operations");
        menuItemSave = new JMenuItem("Save");
        menuFile.add(menuItemSave);
        menuItemSaveAs = new JMenuItem("Save as");
        menuFile.add(menuItemSaveAs);
        //menu Edit
        menuEdit = new JMenu("Edit");
        menuEdit.setMnemonic(KeyEvent.VK_E);
        menuEdit.getAccessibleContext().setAccessibleDescription("Edit operations");

        //menu Help
        menuHelp = new JMenu("Help");
        menuHelp.setMnemonic(KeyEvent.VK_H);
        menuHelp.getAccessibleContext().setAccessibleDescription("Help with " + Notepad.applicationName);
        
        
        
        
        this.add(menuFile);
        this.add(menuEdit);
        this.add(menuHelp);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
    
}
