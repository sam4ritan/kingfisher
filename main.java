import javax.swing.*;
import java.net.*;
import java.awt.event.*;

public class main
{
	public static void main (String args[]){
	//Defined window dimensions
  	JFrame mainWindow = new JFrame();
  	mainWindow.setTitle("kingfisher");
	mainWindow.setSize(500,400);
	//mainWindow.setVisible(true);
	mainWindow.add(new JLabel("Die Engel haben die Notrufzelle!"));
	//mainWindow.setModal(false);
        JMenuBar menubar = new JMenuBar();
        //mainWindow.setJMenuBar(menubar);
        //defining menu groups
            JMenu windows = new JMenu("Windows");
                JCheckBoxMenuItem chat = new JCheckBoxMenuItem("Chat");
                JCheckBoxMenuItem filetransfer = new JCheckBoxMenuItem("Filetransfer");
                JCheckBoxMenuItem settings = new JCheckBoxMenuItem("Settings");
                windows.add(chat);
                windows.add(filetransfer);
                windows.add(settings);
            JMenu control = new JMenu("Control");
                JMenuItem quit = new JMenuItem("Quit");
                quit.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        System.exit(0);
                        }
                    }
                );
                control.add(quit);
            JMenu help = new JMenu("Help");
                JMenuItem support = new JMenuItem("Support");
                JMenuItem about = new JMenuItem("About");
                help.add(support);
                help.add(about);
            menubar.add(control);
            menubar.add(windows);
            menubar.add(help);
        mainWindow.setJMenuBar(menubar);
	mainWindow.setVisible(true);
	
	
	
	
	
	
	};
};

