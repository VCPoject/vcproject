package gui;

import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class CheckIn_Frame extends JFrame {
	/**
	 * 
	 */
	private CheckIn_Panel checkInPanel;
	private static final long serialVersionUID = 1L;

	public CheckIn_Frame() {
		super();
		initialize();
	}

	private void initialize() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			JOptionPane.showMessageDialog(this,
					"setLookAndFeel error: " + e.getMessage(),
					"setLookAndFeel ERRORE", JOptionPane.ERROR_MESSAGE);
		}
		this.setSize(500, 400);
		this.setResizable(false);
		getContentPane().setBackground(SystemColor.activeCaption);
		getContentPane().setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height
				/ 2 - this.getSize().height / 2);
		this.setContentPane(getCheckInPanel());

	}

	public CheckIn_Panel getCheckInPanel() {
		if (checkInPanel == null)
			checkInPanel = new CheckIn_Panel();
		return checkInPanel;
	}

}
