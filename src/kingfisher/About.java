package kingfisher;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;

public class About {

	protected Shell shlAbout;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			About window = new About();
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
		shlAbout.open();
		shlAbout.layout();
		while (!shlAbout.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlAbout = new Shell();
		shlAbout.setSize(240, 300);
		shlAbout.setText("About Kingfisher");
		
		Label lblNewLabel = new Label(shlAbout, SWT.NONE);
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setFont(SWTResourceManager.getFont("Cantarell", 15, SWT.BOLD));
		lblNewLabel.setText("Kingfisher");
		lblNewLabel.setBounds(10, 10, 214, 41);
		
		Label lblNewLabel_1 = new Label(shlAbout, SWT.NONE);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Cantarell", 12, SWT.ITALIC));
		lblNewLabel_1.setAlignment(SWT.CENTER);
		lblNewLabel_1.setBounds(10, 57, 214, 17);
		lblNewLabel_1.setText("Version a0.0.5");
		
		Label lblNewLabel_2 = new Label(shlAbout, SWT.NONE);
		lblNewLabel_2.setAlignment(SWT.CENTER);
		lblNewLabel_2.setFont(SWTResourceManager.getFont("Cantarell", 10, SWT.ITALIC));
		lblNewLabel_2.setBounds(10, 121, 214, 17);
		lblNewLabel_2.setText("\"Not stealing your cookies");
		
		Label lblNewLabel_3 = new Label(shlAbout, SWT.NONE);
		lblNewLabel_3.setFont(SWTResourceManager.getFont("Cantarell", 10, SWT.ITALIC));
		lblNewLabel_3.setAlignment(SWT.CENTER);
		lblNewLabel_3.setBounds(10, 144, 214, 17);
		lblNewLabel_3.setText("since 2016\"");
		
		Label lblNewLabel_4 = new Label(shlAbout, SWT.NONE);
		lblNewLabel_4.setAlignment(SWT.CENTER);
		lblNewLabel_4.setBounds(10, 196, 214, 17);
		lblNewLabel_4.setText("Support:");
		
		Label lblNewLabel_5 = new Label(shlAbout, SWT.NONE);
		lblNewLabel_5.setFont(SWTResourceManager.getFont("Cantarell", 8, SWT.ITALIC));
		lblNewLabel_5.setAlignment(SWT.CENTER);
		lblNewLabel_5.setBounds(10, 215, 214, 17);
		lblNewLabel_5.setText("sam4ritan@protonmail.com");

	}
}
