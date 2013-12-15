package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VCP_Main_Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Main_Panel mainPanel;

	private LogIn_Panel loginpanel;

	private Order_Panel orderPanel;
	private Register_Panel registerPanel;
	private Payment_Frame paymentFrame;




	public VCP_Main_Frame() {
		super();
		initialize();
	}

	private void initialize() {
		try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        	JOptionPane.showMessageDialog(this,"setLookAndFeel error: " + e.getMessage() , "setLookAndFeel ERRORE", JOptionPane.ERROR_MESSAGE);
        }
		this.setContentPane(getMainPanel());
		getContentPane().setBackground(SystemColor.activeCaption);
		this.setSize(800, 600);
		this.setResizable(false);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
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
		

		getMainPanel().getBtnEmploeyLogin().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setContentPane(getLogIn_Panel());
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
		
		mainPanel.getBtnRegister().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setContentPane(getRegisterPanel());
				getRegisterPanel().getBtnReturn().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setContentPane(getMainPanel());
					}
				});
			}
		});
		
		
		getRegisterPanel().getBtnSubmit().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPaymentFrame();
				getPaymentFrame().setVisible(true);
				disableMainFrame();
		}
		});
		
		getPaymentFrame().getBtnReturn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPaymentFrame().dispose();
				enableMainFrame();
			}
		});
		
		getLogIn_Panel().getBtnReturn().addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				setContentPane(getMainPanel());
				
			}
			
		});
		
		getLogIn_Panel().getBtnSubmit().addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				 
				
				System.out.println(getLogIn_Panel().getPswdText().getText());
				 System.out.println(getLogIn_Panel().getUserText().getText());
			}
			
		});
		
		getLogIn_Panel().getPswdText().addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
		        if (e.getKeyCode() == KeyEvent.VK_ENTER)
		        	getLogIn_Panel().getBtnSubmit().doClick();
		        
		     }
		 });
		
		getLogIn_Panel().getUserText().addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
		        if (e.getKeyCode() == KeyEvent.VK_ENTER)
		        	getLogIn_Panel().getBtnSubmit().doClick();
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
	

	public LogIn_Panel getLogIn_Panel() {
		
		if(loginpanel==null)
			loginpanel=new LogIn_Panel();
		
		return loginpanel; 
	}



	private Order_Panel getOrderPanel() {
		if(orderPanel == null)
		{
			orderPanel = new Order_Panel();
		}
		return orderPanel;
	}
	
	public Register_Panel getRegisterPanel() {
		if(registerPanel == null)
		{
			registerPanel = new Register_Panel();
		}
		return registerPanel;
	}

	public Payment_Frame getPaymentFrame() {
		if(paymentFrame == null)
		{
			paymentFrame = new Payment_Frame();
		}
		return paymentFrame;
	}
	
	protected void disableMainFrame() {
		this.setEnabled(false);
		this.setFocusable(false);
		this.setVisible(false);
	}
	
	protected void enableMainFrame() {
		this.setEnabled(true);
		this.setFocusable(true);
		this.setVisible(true);
	}

}
