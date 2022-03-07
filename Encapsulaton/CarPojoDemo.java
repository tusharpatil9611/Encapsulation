package Encapsulaton;

public class CarPojoDemo {

	public static void main(String[] args) {
		CarPojo carpojo=new CarPojo(4,4);
		carpojo.setNoOfGear(3);
		System.out.println(carpojo.getNoOfGear());
		System.out.println(carpojo);
	}


}
