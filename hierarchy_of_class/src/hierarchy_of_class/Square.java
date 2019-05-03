package hierarchy_of_class;

class Square extends Side {

	public Square() {
		super();
	}

	public Square(double side) {
		super(side);
	}

	public double Area() {
		double area = this.getSide() * this.getSide();
		return area;
	}

}
