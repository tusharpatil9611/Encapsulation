package Encapsulaton;

public class CarPojo {
	int noOfWheels;
	int noOfGear;
	CarPojo() 
	{
		super();
	}
	public CarPojo(int noOfWheels, int noOfGear) {
		super();
		this.noOfWheels = noOfWheels;
		this.noOfGear = noOfGear;
	}
	
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public int getNoOfGear() {
		return noOfGear;
	}
	public void setNoOfGear(int noOfGear) {
		this.noOfGear = noOfGear;
	}
	public String toString() {
		return "CarPojo [noOfWheels=" + noOfWheels + ", noOfGear=" + noOfGear
				+ "]";
	}
	public static void main(String[] args) {
		CarPojo carpojo=new CarPojo(4,4);
		carpojo.setNoOfGear(3);
		System.out.println(carpojo.getNoOfGear());
		System.out.println(carpojo);
	}


}
