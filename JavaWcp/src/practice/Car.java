package practice;

public class Car {
//	メンバー変数
	public double fuelCost;
	public double fuelAmount;
	
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	
	public void move(int km) {
		System.out.println(km + "km 走ります");
		this.fuelAmount-=(km/this.fuelCost);
	
	}
	
	
	public double getFuelAmount() {
		return this.fuelAmount;
	}

}
