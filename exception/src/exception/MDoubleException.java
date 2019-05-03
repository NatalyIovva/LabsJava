package exception;


public class MDoubleException extends Exception {// create error class
	private double number;
	static final long serialVersionUID = 1;

	public double getNumber() {
		return number;
	}

	public MDoubleException(String message, double number) {
		super(message);
		this.number = number;
	}
}
