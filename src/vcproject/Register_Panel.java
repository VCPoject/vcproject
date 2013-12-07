package vcproject;

import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.text.ParseException;
import java.util.Calendar;

import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JTable;
import com.toedter.calendar.JDateChooser;

public class Register_Panel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnReturn;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField txtIdNumber;
	private JFormattedTextField formattedTextFieldCarNumber;
	
	public Register_Panel() {
		super();
		initialize();
		listners();
	}

	private void initialize() {
		this.setSize(785, 575);
		setBackground(SystemColor.activeCaption);
		setLayout(null);
		
		
		btnReturn = new JButton("Return");
		btnReturn.setBounds(10, 519, 93, 35);
		add(btnReturn);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblRegister.setBounds(343, 27, 99, 29);
		add(lblRegister);
		
		JLabel lblSubscribeType = new JLabel("Subscribe Type:");
		lblSubscribeType.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSubscribeType.setBounds(254, 100, 143, 22);
		add(lblSubscribeType);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Select", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(397, 87, 129, 46);
		add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnPartial = new JRadioButton("Partial");
		buttonGroup.add(rdbtnPartial);
		rdbtnPartial.setBounds(6, 16, 55, 23);
		panel.add(rdbtnPartial);
		rdbtnPartial.setBackground(SystemColor.activeCaption);
		rdbtnPartial.setSelected(true);
		
		JRadioButton rdbtnFull = new JRadioButton("Full");
		buttonGroup.add(rdbtnFull);
		rdbtnFull.setBounds(63, 16, 41, 23);
		panel.add(rdbtnFull);
		rdbtnFull.setBackground(SystemColor.activeCaption);
		
		JLabel lblIdNumber = new JLabel("ID number:");
		lblIdNumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblIdNumber.setBounds(154, 204, 143, 29);
		add(lblIdNumber);
		
		JLabel lblCarNumber = new JLabel("Car number:");
		lblCarNumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCarNumber.setBounds(154, 244, 114, 22);
		add(lblCarNumber);
		
		JLabel lblCustomerType = new JLabel("Customer type:");
		lblCustomerType.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCustomerType.setBounds(254, 144, 143, 22);
		add(lblCustomerType);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Select", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(397, 133, 140, 46);
		add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnPrivate = new JRadioButton("Private");
		buttonGroup_1.add(rdbtnPrivate);
		rdbtnPrivate.setSelected(true);
		rdbtnPrivate.setBackground(SystemColor.activeCaption);
		rdbtnPrivate.setBounds(6, 16, 59, 23);
		panel_1.add(rdbtnPrivate);
		
		JRadioButton rdbtnBusiness = new JRadioButton("Business");
		buttonGroup_1.add(rdbtnBusiness);
		rdbtnBusiness.setBackground(SystemColor.activeCaption);
		rdbtnBusiness.setBounds(67, 16, 67, 23);
		panel_1.add(rdbtnBusiness);
		
		JLabel lblStartDate = new JLabel("Start date:");
		lblStartDate.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStartDate.setBounds(154, 281, 114, 22);
		add(lblStartDate);
		
		JLabel lblParkingLot = new JLabel("Parking lot:");
		lblParkingLot.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblParkingLot.setBounds(154, 320, 114, 22);
		add(lblParkingLot);
		
		txtIdNumber = new JTextField();
		txtIdNumber.setBounds(307, 209, 230, 24);
		add(txtIdNumber);
		txtIdNumber.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(437, 390, 89, 23);
		add(btnSubmit);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(307, 322, 230, 24);
		add(comboBox);
		
		
		try {
			formattedTextFieldCarNumber = new JFormattedTextField(new MaskFormatter("##-###-##"));
			formattedTextFieldCarNumber.setHorizontalAlignment(SwingConstants.CENTER);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(this,"Formatter error: " + e.getMessage() , "Formatter ERRORE", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		formattedTextFieldCarNumber.setBounds(307, 246, 70, 24);
		add(formattedTextFieldCarNumber);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(437, 248, 100, 20);
		add(comboBox_1);
		
		JButton btnAddCar = new JButton("Add");
		btnAddCar.setBounds(381, 247, 51, 24);
		add(btnAddCar);
		
		JDateChooser startDateChooser = new JDateChooser();
		startDateChooser.setBounds(307, 281, 230, 24);
		add(startDateChooser);
		
		Calendar cal = Calendar.getInstance();
	}
	
	private void listners() {
		// TODO Auto-generated method stub
		
	}
}
