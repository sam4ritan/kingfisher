package kingfisher;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Chat {

	protected Shell shlChat;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text txtEnterTextHere;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Chat window = new Chat();
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
		shlChat.open();
		shlChat.layout();
		while (!shlChat.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		shlChat = new Shell();
		shlChat.setSize(450, 300);
		shlChat.setText("Chat");
		
		Menu menu = new Menu(shlChat, SWT.BAR);
		shlChat.setMenuBar(menu);
		
		MenuItem mntmControl = new MenuItem(menu, SWT.CASCADE);
		mntmControl.setText("Control");
		
		Menu menu_1 = new Menu(mntmControl);
		mntmControl.setMenu(menu_1);
		
		MenuItem mntmFileTransfer = new MenuItem(menu_1, SWT.NONE);
		mntmFileTransfer.setEnabled(false);
		mntmFileTransfer.setText("File Transfer");
		
		MenuItem mntmdevAimforip = new MenuItem(menu_1, SWT.NONE);
		mntmdevAimforip.setEnabled(false);
		mntmdevAimforip.setText("(dev)_aim_for_IP");
		
		txtEnterTextHere = new Text(shlChat, SWT.BORDER);
		txtEnterTextHere.addKeyListener(new KeyAdapter() 
		{
			public void keyPressed(KeyEvent event){
					switch(event.keyCode){
						case SWT.CR:
							final String input_text = txtEnterTextHere.getText();
							text.append(dateFormat.format(date) + " [127.0.0.1] " + input_text + "\n");
							txtEnterTextHere.setText("");
						break;
					}
				}
			}			
		);
		txtEnterTextHere.setBounds(10, 200, 346, 36);
		formToolkit.adapt(txtEnterTextHere, true, true);
		
		//String a = new String("null");
		
		Button btnSend = new Button(shlChat, SWT.NONE);
		btnSend.setBounds(359, 200, 75, 36);
		formToolkit.adapt(btnSend, true, true);
		btnSend.addSelectionListener(new SelectionAdapter() {
			  @Override
			  public void widgetSelected(final SelectionEvent event)
			  {
				final String input_text = txtEnterTextHere.getText();
				text.append(dateFormat.format(date) + " [127.0.0.1] " + input_text + "\n");
				txtEnterTextHere.setText("");
			  }
			});
		btnSend.setText("SEND");
		
		text = new Text(shlChat, SWT.MULTI);
		text.setEditable(false);
		text.setBounds(10, 10, 424, 184);
		formToolkit.adapt(text, true, true);

	}
}
