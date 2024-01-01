package iit.oop.inheritance;

public class Bicycle {
	
	public int gear;
	public int speed;
	public Bicycle(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}
	
	
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	
	public void speedup(int increment) {
		speed += increment;
	}


	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}
	
	
	
}
	
