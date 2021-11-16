package projectClasses;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

public class Program{
	
	private static CarDisplayWindow carDisplayWindow;
	private static CarEntryWindow carEntryWindow;
	private static MenuWindow menuWindow;
	
	private static List<Car> cars = new ArrayList<Car>();
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					carDisplayWindow = new CarDisplayWindow();
					carEntryWindow = new CarEntryWindow();
					menuWindow = new MenuWindow();
					//menuWindow.menuFrame.setVisible(true);
					//carEntryWindow.carEntryFrame.setVisible(true);
					carDisplayWindow.carDisplayFrame.setVisible(true);
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
	}
	
	
	
	

}
