package kingfisher;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

public class Settings {

	protected Shell shlSettings;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Settings window = new Settings();
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
		shlSettings.open();
		shlSettings.layout();
		while (!shlSettings.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlSettings = new Shell();
		shlSettings.setSize(450, 326);
		shlSettings.setText("Settings");
		
		Button btnNewButton = new Button(shlSettings, SWT.NONE);
		btnNewButton.setBounds(263, 260, 85, 27);
		btnNewButton.setText("APPLY");
		
		Button btnNewButton_1 = new Button(shlSettings, SWT.NONE);
		btnNewButton_1.setBounds(349, 260, 85, 27);
		btnNewButton_1.setText("CANCEL");
		
		Label lblNewLabel = new Label(shlSettings, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Cantarell", 10, SWT.BOLD));
		lblNewLabel.setBounds(10, 10, 424, 17);
		lblNewLabel.setText("Automatic Scan");
		
		Label lblNewLabel_1 = new Label(shlSettings, SWT.NONE);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Cantarell", 10, SWT.BOLD));
		lblNewLabel_1.setBounds(10, 79, 424, 17);
		lblNewLabel_1.setText("Silent Mode  (experimental)");
		
		Label lblNewLabel_2 = new Label(shlSettings, SWT.NONE);
		lblNewLabel_2.setEnabled(true);
		lblNewLabel_2.setFont(SWTResourceManager.getFont("Cantarell", 8, SWT.ITALIC));
		lblNewLabel_2.setBounds(10, 33, 424, 17);
		lblNewLabel_2.setText("Automatically scans network for available peers");
		
		Label lblKingfisherWillRun = new Label(shlSettings, SWT.NONE);
		lblKingfisherWillRun.setText("Kingfisher will run on a different port ([PORT]) and not announce itself on the network");
		lblKingfisherWillRun.setFont(SWTResourceManager.getFont("Cantarell", 8, SWT.ITALIC));
		lblKingfisherWillRun.setBounds(10, 102, 424, 17);
		
		Label lblOnlyConnectionsFrom = new Label(shlSettings, SWT.NONE);
		lblOnlyConnectionsFrom.setText("Only connections from other silent peers will be accepted");
		lblOnlyConnectionsFrom.setFont(SWTResourceManager.getFont("Cantarell", 8, SWT.ITALIC));
		lblOnlyConnectionsFrom.setBounds(10, 114, 424, 17);
		
		Label lblRunOnAlternate = new Label(shlSettings, SWT.NONE);
		lblRunOnAlternate.setText("Run on alternate port, if neccessary");
		lblRunOnAlternate.setFont(SWTResourceManager.getFont("Cantarell", 8, SWT.ITALIC));
		lblRunOnAlternate.setBounds(10, 183, 424, 17);
		
		Label lblAlternatePorts = new Label(shlSettings, SWT.NONE);
		lblAlternatePorts.setText("Alternate Ports (experimental)");
		lblAlternatePorts.setFont(SWTResourceManager.getFont("Cantarell", 10, SWT.BOLD));
		lblAlternatePorts.setBounds(10, 160, 424, 17);
		
		Button button_2 = new Button(shlSettings, SWT.RADIO);
		button_2.setText("[Alt1]");
		button_2.setSelection(true);
		button_2.setGrayed(true);
		button_2.setBounds(10, 206, 61, 17);
		
		Button btnalt = new Button(shlSettings, SWT.RADIO);
		btnalt.setText("[Alt2]");
		btnalt.setGrayed(true);
		btnalt.setBounds(77, 206, 61, 17);
		
		Button btnalt_1 = new Button(shlSettings, SWT.RADIO);
		btnalt_1.setText("[Alt3]");
		btnalt_1.setGrayed(true);
		btnalt_1.setBounds(144, 206, 61, 17);
		
		Button btnalt_2 = new Button(shlSettings, SWT.RADIO);
		btnalt_2.setText("[Alt4]");
		btnalt_2.setGrayed(true);
		btnalt_2.setBounds(211, 206, 61, 17);
		
		Button btnCheckButton = new Button(shlSettings, SWT.CHECK);
		btnCheckButton.setBounds(10, 56, 99, 17);
		btnCheckButton.setText("enabled");
		
		Button button_1 = new Button(shlSettings, SWT.CHECK);
		button_1.setText("enabled");
		button_1.setBounds(10, 137, 99, 17);

	}
}
