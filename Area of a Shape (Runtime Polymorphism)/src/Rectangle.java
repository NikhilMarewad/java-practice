public class Rectangle extends Shape {
	int length;
	int breadth;

	
	public Rectangle( int length, int breadth) {
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}

	public double calculateArea() {
		
		return length * breadth;
	}

}