package projectClasses;



import javax.swing.JFrame;

import java.awt.FlowLayout;
import javax.swing.JButton;

public class MenuWindow {

	public JFrame menuFrame;

	public MenuWindow() {
		initialize();
	}

	private void initialize() {
		menuFrame = new JFrame();
		menuFrame.setTitle("Car Emporium");
		menuFrame.setBounds(100, 100, 450, 300);
		menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_1 = new JButton("Car Entry");
		menuFrame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Car Display");
		menuFrame.getContentPane().add(btnNewButton);
	}

}
