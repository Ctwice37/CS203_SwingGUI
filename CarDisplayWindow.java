package projectClasses;



import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CarDisplayWindow {

	public JFrame carDisplayFrame;

	public CarDisplayWindow() {
		initialize();
	
		
	}
		
		
	private void initialize() {
		carDisplayFrame = new JFrame();
		carDisplayFrame.setTitle("Car Emporium - Car Display");
		carDisplayFrame.setBounds(100, 100, 450, 300);
		carDisplayFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		carDisplayFrame.getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("Cars:");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, carDisplayFrame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, carDisplayFrame.getContentPane());
		carDisplayFrame.getContentPane().add(lblNewLabel);
		
		final JTextPane textPane = new JTextPane();
		springLayout.putConstraint(SpringLayout.NORTH, textPane, 15, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, textPane, 10, SpringLayout.WEST, carDisplayFrame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textPane, 406, SpringLayout.WEST, carDisplayFrame.getContentPane());
		textPane.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		textPane.setForeground(Color.BLACK);
		carDisplayFrame.getContentPane().add(textPane);
		
		JButton btnNewButton = new JButton("Return");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		springLayout.putConstraint(SpringLayout.SOUTH, textPane, -23, SpringLayout.NORTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 174, SpringLayout.NORTH, carDisplayFrame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, lblNewLabel);
		carDisplayFrame.getContentPane().add(btnNewButton);
	}
}
