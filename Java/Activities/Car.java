package Activities;

public class Car {
	
		String color;
		String transmission;
		int make;
		int tyres;
		int doors;
	

 public Car()
	{
		this.tyres =4;
		this.doors =4;
	}
	public void displayCharacteristic()
	{
		 System.out.println("Car Color: " + color);
	        System.out.println("Car Transmission: " + transmission);
	        System.out.println("Car Make: " + make);
	        System.out.println("Number of Tyres: " + tyres);
	        System.out.println("Number of Doors: " + doors);
	}
	public void accelarate()
	{
		
	System.out.println("Car is moving forward");
	}
	public void brake()
	{
		
	System.out.println("Car has stopped");
	}
}
