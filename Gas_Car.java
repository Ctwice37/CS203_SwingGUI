package projectClasses;

public class Gas_Car extends Car{
	
	int tankSize;
	String fuelType;
	
	
	
	
	public Gas_Car(int tankSize, String fuelType, String Make, String Model, int year, int weight, String color) {
		super(Make, Model, year, weight, color);
		this.tankSize = tankSize;
		this.fuelType = fuelType;
	}




	@Override
	public String toString() {
		return super.toString() + " Tank Size: " + tankSize + " Fuel Type: " + fuelType;				
	}
	



	
	

}
