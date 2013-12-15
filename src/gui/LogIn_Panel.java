package gui;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LogIn_Panel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField usertxtfieled;
	private JTextField pswdtxtfield;
	private JButton btnreturn;
	private JButton btnsubmmit;
	

	public LogIn_Panel(){
		super();
		initialize();
		listners();
	}
	
	private void initialize(){
		this.setSize(785, 575);
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		usertxtfieled = new JTextField();
		usertxtfieled.setBounds(136, 132, 342, 20);
		add(usertxtfieled);
		usertxtfieled.setColumns(10);
		
		 pswdtxtfield = new JTextField();
		 pswdtxtfield.setBounds(136, 217, 342, 20);
		 add( pswdtxtfield);
		 pswdtxtfield.setColumns(10);
		
		btnsubmmit = new JButton("Submmit");
		btnsubmmit.setBounds(478, 366, 138, 56);
		add(btnsubmmit);
		
		btnreturn= new JButton("Return");
		btnreturn.setBounds(32, 366, 138, 56);
		add(btnreturn);
		
		
		
		JLabel lblUserName = new JLabel("Username\r\n");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblUserName.setBounds(22, 123, 104, 33);
		add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblPassword.setBounds(22, 216, 94, 17);
		add(lblPassword);
		
		JLabel lblLogIn = new JLabel("Log In");
		lblLogIn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 36));
		lblLogIn.setBounds(323, 39, 138, 46);
		add(lblLogIn);
		
	}
	
	public void listners(){
		
		/*usertxtfieled.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
		        if (e.getKeyCode() == KeyEvent.VK_ENTER){
		        	
		          System.out.println(usertxtfieled.getText());
		        }
		      }
		    });
		
		 pswdtxtfield.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
		        if (e.getKeyCode() == KeyEvent.VK_ENTER){
		          System.out.println(pswdtxtfield.getText());
		        }
		      }
		    });*/
	
	}
	
	public JButton getBtnSubmit(){
		return btnsubmmit;
	}
	
	public JButton getBtnReturn(){
		return btnreturn;
	}
	
	public JTextField getPswdText(){
		return pswdtxtfield;
	}
	
	public JTextField getUserText(){
		return usertxtfieled;
	}

}
