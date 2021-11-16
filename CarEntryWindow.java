package projectClasses;



import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;



public class CarEntryWindow {

	public JFrame carEntryFrame;
	
	private JTextField textField;
	private JTextField make_Field;
	private JTextField model_Field;
	private JTextField year_Field;
	private JTextField weight_Field;
	private JTextField tankSize_Field;
	private JTextField fuelType_Field;
	private JTextField batterSize_Field;
	private JTextField batteryType_Field;
	private JComboBox<String> cb;
	
	String[] colors = {"Red", "Blue", "Yellow", "Silver", "Black", "Yellow", "Other"};
	
	

	
	

	public CarEntryWindow() {
		initialize();
	}

	private void initialize() {
		carEntryFrame = new JFrame();
		carEntryFrame.setTitle("Car Emporium - Car Entry");
		carEntryFrame.setBounds(100, 100, 450, 300);
		carEntryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		carEntryFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Make:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		carEntryFrame.getContentPane().add(lblNewLabel);
		
		make_Field = new JTextField();
		carEntryFrame.getContentPane().add(make_Field);
		make_Field.setColumns(7);
		
		JLabel lblNewLabel_1 = new JLabel("Model:");
		carEntryFrame.getContentPane().add(lblNewLabel_1);
		
		model_Field = new JTextField();
		carEntryFrame.getContentPane().add(model_Field);
		model_Field.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Year:");
		carEntryFrame.getContentPane().add(lblNewLabel_2);
		
		year_Field = new JTextField();
		carEntryFrame.getContentPane().add(year_Field);
		year_Field.setColumns(4);
		
	
		JLabel lblNewLabel_3 = new JLabel("Weight:");
		carEntryFrame.getContentPane().add(lblNewLabel_3);
		
		weight_Field = new JTextField();
		carEntryFrame.getContentPane().add(weight_Field);
		weight_Field.setColumns(5);
		
		JPanel panel = new JPanel();
		carEntryFrame.getContentPane().add(panel);
		
		cb = new JComboBox<String>(colors);

	    cb.setVisible(true);
	    panel.add(cb);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Gas?");
		carEntryFrame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Electric?");
		carEntryFrame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Tank Size:");
		carEntryFrame.getContentPane().add(lblNewLabel_4);
		
		tankSize_Field = new JTextField();
		carEntryFrame.getContentPane().add(tankSize_Field);
		tankSize_Field.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Fuel Type:");
		carEntryFrame.getContentPane().add(lblNewLabel_5);
		
		fuelType_Field = new JTextField();
		carEntryFrame.getContentPane().add(fuelType_Field);
		fuelType_Field.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Battery Size:");
		carEntryFrame.getContentPane().add(lblNewLabel_6);
		
		batterSize_Field = new JTextField();
		carEntryFrame.getContentPane().add(batterSize_Field);
		batterSize_Field.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Battery Type");
		carEntryFrame.getContentPane().add(lblNewLabel_7);
		
		batteryType_Field = new JTextField();
		carEntryFrame.getContentPane().add(batteryType_Field);
		batteryType_Field.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		carEntryFrame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Return");
		carEntryFrame.getContentPane().add(btnNewButton_1);
	}

}
