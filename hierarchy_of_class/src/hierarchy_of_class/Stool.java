package hierarchy_of_class;

public class Stool extends Board {
	double stool_leg;

	public Stool() {
		super();
	}

	public Stool(double height, double side, double stool_leg) {
		super(height, side);
		this.stool_leg = stool_leg;
	}

	public void setStool_leg(double stool_leg) {
		// Scanner scanner = new Scanner(System.in);
		this.stool_leg = stool_leg;
		// scanner.close();

	}

	public double getStool() {
		getDate();
		return stool_leg;
	}

	public boolean canSitdow(Man man) {
		if (man.getAge() > 35 && this.Area() < 0.25)
			return false;
		if (man.getHeight() >= 1.75) {
			if (this.height + this.stool_leg < 0.5 || this.height + this.stool_leg > 1.2)
				return false;
			else
				return true;
		} else {
			if (this.height + this.stool_leg < 0.1 || this.height + this.stool_leg > 1)
				return false;
			else
				return true;
		}
	}

	public void showStool() {
		System.out.printf("the stool with height %.2f and area %.2f\n", this.height + this.stool_leg, this.Area());
	}

}
