package iit.oop.inheritance;

public class Bicycle {
	
	public int gear;
	public int speed;
	public Bicycle(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}
	
	public Bicycle() {
		
	}
	
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	
	public void speedup(int increment) {
		speed += increment;
	}

	
	public void parentClass() {
		System.out.println("This is a parant Class");
	}

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}
	
	
	
}
	
