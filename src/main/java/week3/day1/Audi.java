package week3.day1;

public class Audi extends Car{
	public void applyBrake() {
		System.out.println("Apply ABS Brake -> Audi");
	}
	public void getBrake() {
		this.applyBrake();
	}
	public void getSuperBrake() {
		super.applyBrake();
	}
public void autoPark() {

}
}
