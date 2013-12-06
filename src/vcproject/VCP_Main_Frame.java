package vcproject;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Container;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VCP_Main_Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Main_Panel mainPanel;
	private Order_Panel orderPanel;

	public VCP_Main_Frame() {
		super();
		initialize();
	}

	private void initialize() {
		this.setContentPane(getMainPanel());
		getContentPane().setBackground(SystemColor.activeCaption);
		this.setSize(800, 600);
		listners();

	}

	private void listners() {

		getMainPanel().getBtnExit().addActionListener(new ActionListener() {/*Exit Button Listener*/
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();

				int result = JOptionPane.showConfirmDialog(frame,
						"Are you sure you want to exit the application?",
						"Exit Application", JOptionPane.YES_NO_OPTION);

				if (result == JOptionPane.YES_OPTION) {
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					closeMainFrame();
				}

			}
		});
		
		getMainPanel().getBtnMakeOrder().addActionListener(new ActionListener() {/*Main Panel Make Order Button Listener*/
			public void actionPerformed(ActionEvent e) {
				setContentPane(getOrderPanel());
			}
		});
		
		getOrderPanel().getBtnReturn().addActionListener(new ActionListener() {/*Order Return Button Listener*/
			public void actionPerformed(ActionEvent e) {
				setContentPane(getMainPanel());
			}
		});
	}

	private void closeMainFrame() {
		this.setVisible(false);
		this.dispose();
	}

	public Main_Panel getMainPanel() {
		if (mainPanel == null) {
			mainPanel = new Main_Panel();
		}
		return mainPanel;
	}
	
	private Order_Panel getOrderPanel() {
		if(orderPanel == null)
		{
			orderPanel = new Order_Panel();
		}
		return orderPanel;
	}
}
