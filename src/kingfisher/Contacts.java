package kingfisher;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Button;

public class Contacts {

	protected Shell shlContacts;
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Contacts window = new Contacts();
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
		shlContacts.open();
		shlContacts.layout();
		while (!shlContacts.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlContacts = new Shell();
		shlContacts.setSize(200, 400);
		shlContacts.setText("Contacts");
		
		Menu menu = new Menu(shlContacts, SWT.BAR);
		shlContacts.setMenuBar(menu);
		
		MenuItem mntmControl = new MenuItem(menu, SWT.CASCADE);
		mntmControl.setText("dev_options");
		
		Menu menu_1 = new Menu(mntmControl);
		mntmControl.setMenu(menu_1);
		
		MenuItem mntmdevrescan = new MenuItem(menu_1, SWT.NONE);
		mntmdevrescan.setText("(dev)_rescan");
		
		table = new Table(shlContacts, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(0, 0, 194, 298);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnAvailableContacts = new TableColumn(table, SWT.NONE);
		tblclmnAvailableContacts.setResizable(false);
		tblclmnAvailableContacts.setWidth(100);
		tblclmnAvailableContacts.setText("Available Contacts:");
		
		Button btnConnect = new Button(shlContacts, SWT.NONE);
		btnConnect.setBounds(10, 309, 174, 27);
		btnConnect.setText("CONNECT");

	}
}
