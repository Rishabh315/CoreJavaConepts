package model;

public class CarObject {
	
	private String carName;
	private String carBrand;
	
	public static int numberOfCars;

	public CarObject() {
		CarObject.numberOfCars+=1;
	}
	
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	
	public static int getCarNumber() {
		return CarObject.numberOfCars;
	}
	
}
