package hierarchy_of_class;

class Side {
	private double side;

	public Side() {
		// setSide();
	}

	public Side(double side) {
		if (side > 0) {
			this.side = side;
		} else {
			System.out.println("Varaible can't be negative!");
		}
	}

	public void setSide(double side) {
		// Scanner scanner = new Scanner(System.in);
		this.side = side;
		// scanner.close();

	}
	public double getSide() {
		return side;
	}
}
