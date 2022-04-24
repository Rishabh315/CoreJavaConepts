package main;

import model.CarObject;
import model.Mercedes;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarObject bean = new CarObject();
		bean.setCarName("Santro");
		bean.setCarBrand("Hyundai");
		CarObject beanTwo = new CarObject();
		
		System.out.println(CarObject.numberOfCars);
		
		CarObject bean3 = null;
		int i = MainClass.count(bean3, "y");
		System.out.println(i);
		
		Mercedes car = new Mercedes();
		int j = Mercedes.getCarNumber();
		System.out.println(j);
	}
	
	//Still works if c is null-- no null pointer exception
	public static int count(CarObject c) {
		return c.numberOfCars;
	}
	
	public static int count(CarObject c, String s) {
		return c.numberOfCars;
	}

}
