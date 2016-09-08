package kingfisher;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Listener;
import java.awt.event.*;


public class ControlPanel {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ControlPanel window = new ControlPanel();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("Control Panel");
		
		CLabel lblNewLabel = new CLabel(shell, SWT.NONE);
		lblNewLabel.setImage(SWTResourceManager.getImage(ControlPanel.class, "/kingfisher/rsz_1rsz_icon.png"));
		lblNewLabel.setBounds(97, 10, 256, 200);
		lblNewLabel.setText("");
		
		Label lblNewLabel_1 = new Label(shell, SWT.SHADOW_IN | SWT.CENTER);
		lblNewLabel_1.setBounds(194, 216, 61, 17);
		lblNewLabel_1.setText("Kingfisher");
		
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		MenuItem mntmControl = new MenuItem(menu, SWT.CASCADE);
		mntmControl.setText("Control");
		
		Menu menu_1 = new Menu(mntmControl);
		mntmControl.setMenu(menu_1);
		
		MenuItem mntmQuit = new MenuItem(menu_1, SWT.NONE);
		mntmQuit.addSelectionListener(new SelectionAdapter() {
			  @Override
			  public void widgetSelected(final SelectionEvent event)
			  {
			    System.exit(0);
			  }
			});
		mntmQuit.setText("Quit");
		
		MenuItem mntmWindows = new MenuItem(menu, SWT.CASCADE);
		mntmWindows.setText("Windows");
		
		Menu menu_2 = new Menu(mntmWindows);
		mntmWindows.setMenu(menu_2);
		
		MenuItem mntmChat = new MenuItem(menu_2, SWT.NONE);
		mntmChat.addSelectionListener(new SelectionAdapter() {
			  @Override
			  public void widgetSelected(final SelectionEvent event)
			  {
			    Chat.main(null);
			  }
			});
		mntmChat.setText("Chat");
		
		MenuItem mntmContacts = new MenuItem(menu_2, SWT.NONE);
		mntmContacts.addSelectionListener(new SelectionAdapter() {
			  @Override
			  public void widgetSelected(final SelectionEvent event)
			  {
			    Contacts.main(null);
			  }
			});
		mntmContacts.setEnabled(false);
		mntmContacts.setText("Contacts");
		
		MenuItem mntmSettings = new MenuItem(menu_2, SWT.NONE);
		mntmSettings.addSelectionListener(new SelectionAdapter() {
			  @Override
			  public void widgetSelected(final SelectionEvent event)
			  {
			    Settings.main(null);
			  }
			});
		mntmSettings.setText("Settings");
		
		MenuItem mntmHelp = new MenuItem(menu, SWT.CASCADE);
		mntmHelp.setText("Help");
		
		Menu menu_3 = new Menu(mntmHelp);
		mntmHelp.setMenu(menu_3);
		
		MenuItem mntmAbout = new MenuItem(menu_3, SWT.NONE);
		mntmAbout.addSelectionListener(new SelectionAdapter() {
			  @Override
			  public void widgetSelected(final SelectionEvent event)
			  {
			    About.main(null);
			  }
			});
		mntmAbout.setText("About");

			
		}
	}
