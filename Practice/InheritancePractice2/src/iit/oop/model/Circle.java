package iit.oop.model;
	
	public abstract class Circle extends Shape {
		
		public int radius;


		public double area(int r) {

			return Math.PI * super.area(r) * super.area(r);
			
		}
	}

