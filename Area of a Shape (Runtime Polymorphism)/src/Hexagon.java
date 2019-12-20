public class Hexagon extends Shape {
	private int side;

	public Hexagon(int side) {
		super("Hexagon");
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
public double calculateArea() {
		
	 double area= ((3 * Math.sqrt(3) *  
	            (side * side)) / 2);
	 return 0;
	}

}
