package model;

public class Mercedes extends CarObject{

	public static int getCarNumber() {
		return CarObject.numberOfCars+=1;
	}
}
