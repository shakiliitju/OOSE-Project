package iit.oop.driverclass;

import iit.oop.inheritance.DerivedBike;
import iit.oop.inheritance.MountainBike;
import iit.oop.inheritance.hierarchical.ChildClassOne;

public class OOPDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Single level inheritance
//		MountainBike bike = new MountainBike(3, 200, 10);
//		System.out.println(bike.toString());
		
		// multiple level inheritance
//		DerivedBike bike = new DerivedBike();
//		bike.parentClass();
//		bike.mountainInterClass();
//		bike.childClass();
		
		
		// hierarchical inheritance
		ChildClassOne classOne = new ChildClassOne();
		classOne.ChildClassOnePrint();
		
//		ChildClassTwo classTwo = new ChildClassTwo();
//		classTwo.ChildClassTwoPrint();
		
	}

}
