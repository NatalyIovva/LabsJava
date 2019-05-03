package hierarchy_of_class;

class Board extends Square {
	double height;

	public Board() {
		// setHeight();
	}

	public Board(double height, double side) {
		super(side);
		this.height = height;
	}

	public void setHeight(double height) {
		this.height = height;

	}

	public double getDate() {
		getSide();
		return height;
	}

	public double V(double height, double side) {
		double rezult = height * this.Area();
		return rezult;
	}

}
