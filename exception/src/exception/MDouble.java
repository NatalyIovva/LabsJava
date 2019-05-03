package exception;


public class MDouble {
	double number;

	MDouble(double number) {
		this.number = number;
	}

	public void setMDouble(double number) throws MDoubleException {// error exciting function
		if (number >= 99999) {
			this.number = 99999;
			throw new MDoubleException("Number is negtive infinity", number);// we throw out the error message
		}
		if (number == 0) {
			this.number = 0;
			throw new MDoubleException("Number not a number", number);// we throw out the error message
		}
		if (number < 99999 && number != 0)
			this.number = number;
		System.out.println("The number is " + this.number);
	}

	public double share(MDouble b) {
		double number = this.number / b.number;
		return number;
	}

	public Double retMDouble() {
		return this.number;
	}
}
