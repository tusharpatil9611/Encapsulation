package Encapsulaton;

public class Car {
	private int noOfWheels;
	
	
	
	/*//public Car(int noOfWheels) {
	//	if(noOfWheels>=0 && noOfWheels<=5)				// Other way to Access Value to the Variable.
	//	this.noOfWheels = noOfWheels;
	}*/
	public void setNoOfWheel(int num)
	{
		if(num>=0 && num<=5)
			noOfWheels=num;
	}
	public int getNoOfWheels()
	{
		
		return noOfWheels;
	}

}
