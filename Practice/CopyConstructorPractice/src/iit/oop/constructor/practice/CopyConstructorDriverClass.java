package iit.oop.constructor.practice;

public class CopyConstructorDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PracticeCopyConstructor constructor = 
				new PracticeCopyConstructor();
		
		constructor.setA("Shakil Hossain");
		System.out.println(constructor.getA());
		//constructor.toString();
		
		
		PracticeCopyConstructor constructor2 = 
				new PracticeCopyConstructor(constructor);
		System.out.println(constructor.getA());
		constructor2.toString();

	}

}
