package week3.day1;

public class MyVehicle {
	int num = 7654;
	public void printMyVehicleName() {
		System.out.println("Maruti Suzuki - WagonR");
	}
	
	public void getCarName() {
		this.printMyVehicleName();
		int num2 = this.num;
	}
public static void main(String[] args) {
	
	
	Vehicle vehicle = new Vehicle();
	Car car = new Car();
	Auto auto = new Auto();
	Audi audi = new Audi();
	
	
	audi.getBrake();
	audi.getSuperBrake();
	
}
}
