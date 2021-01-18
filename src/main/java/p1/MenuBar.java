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

import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/**
 * MenuBar for the window that contains several useful tools and features.
 */
public class MenuBar extends JMenuBar {
    private static final long serialVersionUID = 1L;
    JMenu menuFile;
    JMenu menuEdit;
    JMenu menuHelp;
    JMenuItem menuItemSave;
    JMenuItem menuItemSaveAs;
    Notepad notepad;

    /**
     * Constructor for the menu bar
     * @param notepad the notepad where this menubar will be located
     */
    public MenuBar(Notepad notepad) {
        this.notepad = notepad;

        //menu File
        setMenuFile();
        //menu Edit
        setMenuEdit();
        //menu Help
        setMenuHelp();
        //Add components to the menubar
        this.add(menuFile);
        this.add(menuEdit);
        this.add(menuHelp);

    }

    /**
     * Initialize menu File
     */
    public void setMenuFile() {
        menuFile = new JMenu("File");
        menuFile.setMnemonic(KeyEvent.VK_F);
        menuFile.getAccessibleContext().setAccessibleDescription("File operations");
        //save
        menuItemSave = new JMenuItem("Save");
        menuItemSave.setAction(new SaveFile(notepad));
        menuItemSave.setText("Save");
        menuFile.add(menuItemSave);
        //save as
        menuItemSaveAs = new JMenuItem("Save as");
        menuItemSaveAs.setAction(new SaveFileAs(notepad));
        menuItemSaveAs.setText("Save as");
        menuFile.add(menuItemSaveAs);
    }

    /**
     * Initialize menu Edit
     */
    public void setMenuEdit() {
        menuEdit = new JMenu("Edit");
        menuEdit.setMnemonic(KeyEvent.VK_E);
        menuEdit.getAccessibleContext().setAccessibleDescription("Edit operations");
    }

    /**
     * Initialize menu Help
     */
    public void setMenuHelp() {
        menuHelp = new JMenu("Help");
        menuHelp.setMnemonic(KeyEvent.VK_H);
        menuHelp.getAccessibleContext().setAccessibleDescription("Help with " + Notepad.applicationName);
    }

}
