class Circle extends Shape {
	int radius;

	public Circle(int radius) {
		super("Circle");
		this.radius = radius;
	}

	public double calculateArea() {

		return (Math.PI * radius * radius);
	}

}