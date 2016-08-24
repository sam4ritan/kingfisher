import javax.swing.*;
import java.net.*;
import java.awt.event.*;

public class Main
{

    public static JDialog aboutWindow;
    public static JFrame controlPanel;
     
	public static void about () {
        Main.aboutWindow = new JDialog();
        Main.aboutWindow.setTitle("About kingfisher a0.0.3");
        Main.aboutWindow.setSize(250,400);
        Main.aboutWindow.setModal(true);
            JMenuBar menubar = new JMenuBar();
                JMenu control = new JMenu("Control");
                    JMenuItem quit = new JMenuItem("Quit");
                        quit.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event) {
                                Main.aboutWindow.setVisible(false);
                                }
                            }
                        );
                    control.add(quit);
                menubar.add(control);
            Main.aboutWindow.setJMenuBar(menubar);
        JLabel name = new JLabel("kingfisher");
        /*Label slogan = new JLabel("'So the angels do not keep the blue box'");
        JLabel version = new JLabel("Version a0.0.3 ALPHA");
        JLabel by = new JLabel("by");
        JLabel juh = new JLabel("juha1997");
        JLabel sam = new JLabel("sam4ritan");*/
        Main.aboutWindow.add(name);
        /*aboutWindow.add(slogan);
        aboutWindow.add(version);
        aboutWindow.add(by);
        aboutWindow.add(juh);
        aboutWindow.add(sam);
        */
        Main.aboutWindow.setVisible(false);
	}
	
	    public static void controlpanel() {
        Main.controlPanel = new JFrame();
        Main.controlPanel.setTitle("Control Panel");
        Main.controlPanel.setSize(300,200);
        Main.controlPanel.add(new JLabel("The angels have the blue box"));
            JMenuBar menubar = new JMenuBar();
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
                        about.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event) {
                                Main.aboutWindow.setVisible(true);
                                }
                            }
                        );
                    help.add(support);
                    help.add(about);
                menubar.add(control);
                menubar.add(windows);
                menubar.add(help);
            Main.controlPanel.setJMenuBar(menubar);
        Main.controlPanel.setVisible(true);
    }
   
	
	
	public static void main (String args[]){
	//initializing about
	about();
	//initializing control panel
	controlpanel();
	};
};

