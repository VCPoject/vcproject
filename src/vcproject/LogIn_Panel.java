package vcproject;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class LogIn_Panel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtLogIn;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton_1;
	private JButton button;

	public LogIn_Panel(){
		super();
		initialize();
	}
	
	private void initialize(){
		this.setSize(785, 575);
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JTextArea textArea = new JTextArea("Username");
		textArea.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 18));
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(22, 89, 90, 22);
		add(textArea);
		
		JTextArea txtrPassword = new JTextArea("Password");
		txtrPassword.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 18));
		txtrPassword.setBackground(new Color(192, 192, 192));
		txtrPassword.setBounds(22, 171, 90, 22);
		add(txtrPassword);
		
		txtLogIn = new JTextField();
		txtLogIn.setFont(new Font("Tahoma", Font.PLAIN, 36));
		txtLogIn.setText("Log In");
		txtLogIn.setBackground(new Color(192, 192, 192));
		txtLogIn.setBounds(264, 11, 114, 63);
		add(txtLogIn);
		txtLogIn.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(136, 96, 342, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 178, 342, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Submmit");
		btnNewButton.setBounds(478, 366, 138, 56);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("Return");
		btnNewButton_1.setBounds(32, 366, 138, 56);
		add(btnNewButton_1);
		
		button = new JButton("Submmit");
		button.setBounds(32, 366, 138, 56);
		add(button);
		
	}
}
