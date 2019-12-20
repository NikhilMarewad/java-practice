class Square extends AreaShape {
	int side;

	public Square(int side) {
		super("Square");
		this.side = side;
	}

	public double calculateArea() {
		
		return (side * side);
	}

}