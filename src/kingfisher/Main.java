package kingfisher;

import javax.swing.*;
import java.net.*;
import java.awt.event.*;

public class Main {

    public static JDialog aboutWindow;
    public static JFrame controlPanel;
    public static JFrame contactChooser;
    public static JFrame chatWindow;
    public static JFrame settingsWindow;
    public static JDialog helpWindow;
    public static JFileChooser fileChooser;
	
    public static void settings() {
        Main.settingsWindow = new JFrame();
        Main.settingsWindow.setTitle("Settings");
        Main.settingsWindow.setSize(250,350);
        Main.settingsWindow.add(new JLabel("Insert way to complicated options here!"));
            JMenuBar menubar = new JMenuBar();
                JMenu control = new JMenu("Control");
                    JMenuItem close = new JMenuItem("Close");
                        close.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent event) {
                                    Main.settingsWindow.setVisible(false);
                                    }
                                }
                            );
                    control.add(close);
                menubar.add(control);
            Main.settingsWindow.setJMenuBar(menubar);
        Main.settingsWindow.setVisible(false);
    }
    
    
    
    public static void fileTransfer() {
        Main.fileChooser = new JFileChooser();
    }
    
    public static void chat() {
        Main.chatWindow = new JFrame();
        Main.chatWindow.setTitle("Chat");
        Main.chatWindow.setSize(600,500);
        Main.chatWindow.add(new JLabel("Insert talk here!"));
            JMenuBar menubar = new JMenuBar();
                JMenu control = new JMenu("Control");
                    JMenuItem filetransfer = new JMenuItem("File Transfer");
                        filetransfer.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event) {
                                Main.fileChooser.showDialog(null, "Send");
                                }
                            }
                        );
                    control.add(filetransfer);
                    JMenuItem close = new JMenuItem("Close");
                        close.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event) {
                                Main.chatWindow.setVisible(false);
                                }
                            }
                        );
                    control.add(close);  
                menubar.add(control);
            Main.chatWindow.setJMenuBar(menubar);
        Main.chatWindow.setVisible(false);

    }
    
    public static void contactsPanel() {
        Main.contactChooser = new JFrame();
        Main.contactChooser.setTitle("Contacts");
        Main.contactChooser.setSize(250,350);
        Main.contactChooser.add(new JLabel("Insert friends here!"));
            JMenuBar menubar = new JMenuBar();
                JMenu control = new JMenu("Control");
                    JMenuItem scan = new JMenuItem("(dev)Re-Scan");
                        //add cool ip-scanning stuff here
                    control.add(scan);
                JMenuItem close = new JMenuItem("Close");
                    close.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event) {
                                Main.contactChooser.setVisible(false);
                                }
                            }
                        );
                    control.add(close);
                menubar.add(control);
            Main.contactChooser.setJMenuBar(menubar);
        Main.contactChooser.setVisible(false);
    }
    
	public static void help () {
        Main.helpWindow = new JDialog();
        Main.helpWindow.setTitle("Help & Support & Cookies");
        Main.helpWindow.setSize(250,400);
        Main.helpWindow.setModal(true);
            JMenuBar menubar = new JMenuBar();
                JMenu control = new JMenu("Control");
                    JMenuItem close = new JMenuItem("Close");
                        close.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event) {
                                Main.helpWindow.setVisible(false);
                                }
                            }
                        );
                    control.add(close);
                menubar.add(control);
            Main.helpWindow.setJMenuBar(menubar);
        JLabel name = new JLabel("For Help and Support consult the kingfisher Wiki, leave an Issue on our GitHub page or contact us via email (available on the github page). For cookies, consult your local grocery store employee.");
        Main.helpWindow.add(name);
        Main.helpWindow.setVisible(false);
	}    
    
    
    
	public static void about () {
        Main.aboutWindow = new JDialog();
        Main.aboutWindow.setTitle("About kingfisher a0.0.3");
        Main.aboutWindow.setSize(250,400);
        Main.aboutWindow.setModal(true);
            JMenuBar menubar = new JMenuBar();
                JMenu control = new JMenu("Control");
                    JMenuItem close = new JMenuItem("Close");
                        close.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event) {
                                Main.aboutWindow.setVisible(false);
                                }
                            }
                        );
                    control.add(close);
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
	
	    public static void controlPanel() {
        Main.controlPanel = new JFrame();
        Main.controlPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Main.controlPanel.setTitle("Control Panel");
        Main.controlPanel.setSize(300,200);
        Main.controlPanel.add(new JLabel("The angels have the blue box"));
            JMenuBar menubar = new JMenuBar();
            //defining menu groups
                JMenu control = new JMenu("Control");
                    JMenuItem quit = new JMenuItem("Quit");
                    quit.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent event) {
                            System.exit(0);
                            }
                        }
                    );
                    control.add(quit);
                JMenu windows = new JMenu("Windows");
                    JMenuItem chat = new JMenuItem("Chat");
                        chat.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent event) {
                                    Main.chatWindow.setVisible(true);
                                    }
                                }
                            );
                    JMenuItem contacts = new JMenuItem("Contacts");
                        contacts.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event) {
                                Main.contactChooser.setVisible(true);
                                }
                            }
                        );
                    //JCheckBoxMenuItem filetransfer = new JCheckBoxMenuItem("Filetransfer");
                    JMenuItem settings = new JMenuItem("Settings");
                        settings.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent event) {
                                    Main.settingsWindow.setVisible(true);
                                    }
                                }
                            );
                    windows.add(chat);
                    windows.add(contacts);
                    //windows.add(filetransfer);
                    windows.add(settings);
                JMenu help = new JMenu("Help");
                    JMenuItem support = new JMenuItem("Support");
                        support.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event) {
                                Main.helpWindow.setVisible(true);
                                }
                            }
                        );
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
	//initializing settings
	settings();
	//initializing fileChooser
	fileTransfer();
	//initializing chat
	chat();
	//initializing contactsPanel
	contactsPanel();
	//initializing help
	help();
	//initializing about
	about();
	//initializing control panel
	controlPanel();
	};
}
