import java.awt.*;
import java.awt.event.*;


public class LibraryFrame extends Frame {
    
     public LibraryFrame() {
                
        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu();
        MenuItem menuFileExit = new MenuItem();
        
        menuFile.setLabel("File");
        menuFileExit.setLabel("Exit");
        
        menuFileExit.addActionListener
        (
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    LibraryFrame.this.windowClosed();
                }
            }
        ); 
        menuFile.add(menuFileExit);
        menuBar.add(menuFile);
        
        setTitle("Library");
        setMenuBar(menuBar);
        setSize(new Dimension(400, 400));
        
        this.addWindowListener
        (
            new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    LibraryFrame.this.windowClosed();
                }
            }
        );  
    }
    
    protected void windowClosed() {

        System.exit(0);
    }
}
