package iit.oop.inheritance;

public class MountainBike extends Bicycle{
	
	
		
	public int seatHeight;
	
	public MountainBike(int gear, int speed, int startHeight) {
		super(gear, speed);
		
		seatHeight=startHeight;
	}

	public void seatHeight(int newValue) {
		seatHeight = newValue;
	}

	@Override
	public String toString() {
		return "MountainBike [seatHeight= " + seatHeight + ", gear= " + gear + ", speed= " + speed + "]";
	}

	
	
	
	
	
	
	
}
