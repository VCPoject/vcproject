package vcproject;

import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.ParseException;

public class Order_Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textFieldIdNumber;
	private JFormattedTextField textFieldCarNumber;
	private JTextField textFieldEmail;
	private JFormattedTextField textFieldDeparturTime;
	private JTextField textFieldArrivalTime;
	private JPanel panelSelction;
	private JRadioButton rdbtnOneTimeClient;
	private JRadioButton rdbtnTempClient;
	private JPanel panelDetails;
	private JComboBox comboBox;
	private JLabel lblTimeOfDeparture;
	private JLabel lblParkingLot;
	private JLabel lblMakeOrder;
	private JLabel lblOrderType;
	private JLabel lblIdNumber;
	private JLabel lblCarNumber ;
	private JLabel lblEmail;
	private JButton btnSubmit;
	private JLabel lblTimeOfArrival;
	private JButton btnReturn;

	public Order_Panel() {
		super();
		
		initialize();
	}

	private void initialize() {
		this.setSize(785, 575);
		setBackground(SystemColor.activeCaption);
		setLayout(null);
		
		lblMakeOrder = new JLabel("Make Order");
		lblMakeOrder.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblMakeOrder.setBounds(324, 27, 137, 23);
		add(lblMakeOrder);

		lblOrderType = new JLabel("Order type:");
		lblOrderType.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblOrderType.setBounds(237, 99, 103, 22);
		add(lblOrderType);
		
		panelSelction = new JPanel();
		panelSelction.setBackground(SystemColor.activeCaption);
		panelSelction.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Select",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelSelction.setBounds(352, 86, 185, 46);
		add(panelSelction);
		panelSelction.setLayout(null);
		
		rdbtnOneTimeClient = new JRadioButton("In advance");
		buttonGroup.add(rdbtnOneTimeClient);
		rdbtnOneTimeClient.setBounds(89, 16, 90, 23);
		panelSelction.add(rdbtnOneTimeClient);
		rdbtnOneTimeClient.setBackground(SystemColor.activeCaption);
		
		rdbtnTempClient = new JRadioButton("Park now");
		rdbtnTempClient.setSelected(true);
		buttonGroup.add(rdbtnTempClient);
		rdbtnTempClient.setBounds(6, 16, 81, 23);
		panelSelction.add(rdbtnTempClient);
		rdbtnTempClient.setBackground(SystemColor.activeCaption);
		
		panelDetails = new JPanel();
		panelDetails.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Insert details",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDetails.setBounds(211, 178, 364, 313);
		add(panelDetails);
		panelDetails.setLayout(null);
		
		lblIdNumber = new JLabel("ID number:");
		lblIdNumber.setBounds(6, 16, 197, 22);
		panelDetails.add(lblIdNumber);
		lblIdNumber.setFont(new Font("Tahoma", Font.BOLD, 18));


		textFieldIdNumber = new JTextField();
		textFieldIdNumber.setBounds(213, 16, 137, 24);
		panelDetails.add(textFieldIdNumber);
		textFieldIdNumber.setColumns(10);

		
		lblCarNumber = new JLabel("Car number:");
		lblCarNumber.setBounds(6, 49, 197, 22);
		panelDetails.add(lblCarNumber);
		lblCarNumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		try {
			MaskFormatter formatter = new MaskFormatter("##-###-##");
			formatter.setValidCharacters("0123456789");
			textFieldCarNumber = new JFormattedTextField(formatter);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(this,"Formatter error: " + e.getMessage() , "Formatter ERRORE", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}

		textFieldCarNumber.setBounds(213, 49, 137, 24);
		panelDetails.add(textFieldCarNumber);
		textFieldCarNumber.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(213, 83, 137, 24);
		panelDetails.add(textFieldEmail);
		textFieldEmail.setColumns(10);

		lblEmail = new JLabel("Email:");
		lblEmail.setBounds(6, 83, 197, 22);
		panelDetails.add(lblEmail);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(247, 264, 103, 38);
		panelDetails.add(btnSubmit);
		
		lblTimeOfDeparture = new JLabel("Time of departure:");
		lblTimeOfDeparture.setBounds(6, 117, 197, 22);
		panelDetails.add(lblTimeOfDeparture);
		lblTimeOfDeparture.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		try {
			MaskFormatter formatterDeparturTime = new MaskFormatter("##:##");
			formatterDeparturTime.setValidCharacters("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
			textFieldDeparturTime = new JFormattedTextField(formatterDeparturTime);
			textFieldDeparturTime.setText("Hh:Mm  ");
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(this,"Formatter error: " + e.getMessage() , "Formatter ERRORE", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		textFieldDeparturTime.setBounds(213, 117, 210, 24);
		panelDetails.add(textFieldDeparturTime);
		textFieldDeparturTime.setColumns(10);


		lblParkingLot = new JLabel("Parking lot:");
		lblParkingLot.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblParkingLot.setBounds(6, 186, 197, 22);
		panelDetails.add(lblParkingLot);
		
		comboBox = new JComboBox();
		comboBox.setBounds(213, 188, 137, 24);
		panelDetails.add(comboBox);
		
		lblTimeOfArrival = new JLabel("Time of arrival");
		lblTimeOfArrival.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTimeOfArrival.setBounds(6, 153, 197, 22);
		panelDetails.add(lblTimeOfArrival);

		textFieldArrivalTime = new JTextField();
		textFieldArrivalTime.setBounds(213, 152, 210, 20);
		panelDetails.add(textFieldArrivalTime);
		textFieldArrivalTime.setColumns(10);
		
		btnReturn = new JButton("Return");
		btnReturn.setBounds(10, 519, 93, 35);
		add(btnReturn);

		TempClient();
		listners();
	}

	private void oneTime() {
		lblTimeOfArrival.setVisible(true);
		textFieldArrivalTime.setVisible(true);
		lblParkingLot.setVisible(true);
		comboBox.setVisible(true);
		lblTimeOfArrival.setBounds(6, 117, 197, 22);
		textFieldArrivalTime.setBounds(213, 117, 137, 24);
		lblTimeOfDeparture.setBounds(6, 153, 197, 22);
		textFieldDeparturTime.setBounds(213, 152, 137, 20);
		
	}
	
	private void TempClient(){
		lblTimeOfArrival.setVisible(false);
		textFieldArrivalTime.setVisible(false);
		lblParkingLot.setVisible(false);
		comboBox.setVisible(false);
		lblTimeOfArrival.setBounds(6, 153, 197, 22);
		textFieldArrivalTime.setBounds(213, 152, 137, 20);
		lblTimeOfDeparture.setBounds(6, 117, 197, 22);
		textFieldDeparturTime.setBounds(213, 117, 137, 24);
	}
	
	private void listners(){
		
		rdbtnTempClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TempClient();
			}
		});
		
		rdbtnOneTimeClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oneTime();
			}
		});
		
		getBtnSubmit().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
	}

	public JButton getBtnSubmit() {
		return btnSubmit;
	}

	public JButton getBtnReturn() {
		return btnReturn;
	}

}
