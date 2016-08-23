import javax.swing.*;
import java.net.*;
import java.awt.event.*;

public class main
{
	/*public static void about () {
	JDialog aboutWindow = new JDialog();
	aboutWindow.setTitle("About kingfisher a0.0.3");
	aboutWindow.setSize(300,600);
	aboutWindow.setModal(true);
        JMenuBar menubar = new JMenuBar();
            JMenu control = new JMenu("Control");
                JMenuItem quit = new JMenuItem("quit");
                    quit.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent event) {
                            aboutWindow.setVisible(false);
                            }
                        }
                    );
                control.add(quit);
            menubar.add(control);
        aboutWindow.add(menubar);
    JLabel name = new JLabel("kingfisher");
    JLabel slogan = new JLabel("'So the angels do not keep the blue box'");
    JLabel version = new JLabel("Version a0.0.3 ALPHA");
    JLabel by = new JLabel("by");
    JLabel juh = new JLabel("juha1997");
    JLabel sam = new JLabel("sam4ritan");
    aboutWindow.add(name);
    aboutWindow.add(slogan);
    aboutWindow.add(version);
    aboutWindow.add(by);
    aboutWindow.add(juh);
    aboutWindow.add(sam);
    aboutWindow.setVisible(false);
	}
	*/
	
	public static void main (String args[]){
	
		JDialog aboutWindow = new JDialog();
	aboutWindow.setTitle("About kingfisher a0.0.3");
	aboutWindow.setSize(300,500);
	aboutWindow.setModal(true);
        JMenuBar aboutmenu = new JMenuBar();
            JMenu aboutcontrol = new JMenu("Control");
                JMenuItem aboutquit = new JMenuItem("quit");
                    aboutquit.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent event) {
                            aboutWindow.setVisible(false);
                            }
                        }
                    );
                aboutcontrol.add(aboutquit);
            aboutmenu.add(aboutcontrol);
        aboutWindow.setJMenuBar(aboutmenu);
    JLabel name = new JLabel("kingfisher");
    /*JLabel slogan = new JLabel("'So the angels do not keep the blue box'");
    JLabel version = new JLabel("Version a0.0.3 ALPHA");
    JLabel by = new JLabel("by");
    JLabel juh = new JLabel("juha1997");
    JLabel sam = new JLabel("sam4ritan");
    */aboutWindow.add(name);
    /*aboutWindow.add(slogan);
    aboutWindow.add(version);
    aboutWindow.add(by);
    aboutWindow.add(juh);
    aboutWindow.add(sam);*/
    aboutWindow.setVisible(false);
	
	
	
	
	//Defined window dimensions
  	JFrame controlpanel = new JFrame();
  	controlpanel.setTitle("kingfisher a0.0.3");
	controlpanel.setSize(500,400);
	//controlpanel.setVisible(true);
	controlpanel.add(new JLabel("The angels have the blue box"));
	//controlpanel.setModal(false);
        JMenuBar menubar = new JMenuBar();
        //controlpanel.setJMenuBar(menubar);
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
                            aboutWindow.setVisible(true);
                            }
                        }
                    );
                help.add(support);
                help.add(about);
            menubar.add(control);
            menubar.add(windows);
            menubar.add(help);
        controlpanel.setJMenuBar(menubar);
	controlpanel.setVisible(true);
	
	
	
	
	
	
	};
};

