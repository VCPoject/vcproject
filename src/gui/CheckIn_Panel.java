package gui;

import java.awt.SystemColor;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class CheckIn_Panel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFormattedTextField textFieldCarNumber;

	public CheckIn_Panel() {
		super();
		initialize();
		listners();
	}

	private void listners() {
		this.setBounds(10, 11, 464, 340);
		setLayout(null);
		setBackground(SystemColor.activeCaption);
		
		JLabel lblCheckIn = new JLabel("Check - In");
		lblCheckIn.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCheckIn.setBounds(170, 11, 123, 29);
		add(lblCheckIn);
		
		JLabel lblCarNumber = new JLabel("Car number:");
		lblCarNumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCarNumber.setBounds(126, 102, 114, 22);
		add(lblCarNumber);
		
		try {
			MaskFormatter formatter = new MaskFormatter("##-###-##");
			formatter.setValidCharacters("0123456789");
			textFieldCarNumber = new JFormattedTextField(formatter);
			textFieldCarNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
			textFieldCarNumber.setHorizontalAlignment(SwingConstants.CENTER);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(this,"Formatter error: " + e.getMessage() , "Formatter ERRORE", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		textFieldCarNumber.setBounds(272, 102, 73, 24);
		add(textFieldCarNumber);
		
		JButton btnCheckin = new JButton("Check-In");
		btnCheckin.setBounds(187, 195, 89, 23);
		add(btnCheckin);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setBounds(10, 294, 95, 35);
		add(btnReturn);
		
	}

	private void initialize() {
		// TODO Auto-generated method stub
		
	}
}
