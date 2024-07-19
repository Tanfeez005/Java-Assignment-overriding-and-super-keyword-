
public class Shape {
	public void draw() {
		System.out.println("This is the super class method");
	}
	
	public static class Circle extends Shape{
		//@override
		public void draw() {
			System.out.println("This shape is Circle!");
		}
	}
	public static class Square extends Shape{
		//@override
		public void draw() {
			System.out.println("This shape is Square!");
		}
	}

	public static void main(String[] args) {
		Shape Shape1=new Shape();
		Shape1.draw();
		System.out.println("================");
		
		Circle Circle1=new Circle();
		Circle1.draw();
		System.out.println("================");
		
		Square Square1=new Square();
		Square1.draw();


	}

}
