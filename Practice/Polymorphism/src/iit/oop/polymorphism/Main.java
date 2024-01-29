package iit.oop.polymorphism;

public class Main {
	
	public static void main(String[] args) {
		
		// with static keyword
		System.out.println(Helper.multiply(121.7, 89.6));
		System.out.println(Helper.multiply(12, 25));
		
		//without static keyword
//		Helper helper = new Helper();
//		helper.multiply("Shakil");
//		
//		// Without Object
//		helper.print();
//		Helper helper2 = new ChildOne();
//		helper2.print();
//		Helper helper3 = new ChildTwo();
//		helper3.print();
		
		// With Object
		Helper helper;
		helper = new Helper();
		helper.print();
		helper = new ChildOne();
		helper.print();
		helper = new ChildTwo();
		helper.print();
		
	}

}
