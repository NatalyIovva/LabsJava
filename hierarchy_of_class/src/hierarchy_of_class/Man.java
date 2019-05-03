package hierarchy_of_class;

import java.util.Scanner;

class Man {
	private int age;
	private double height;

	Man() {
		setAge();
		setHeight();
	}

	Man(int age, double height) {
		this.age = age;
		this.height = height;
	}

	public void setAge() {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter your age: ");
			age = scanner.nextInt();

		} while (age <= 0);
		scanner.close();
	}

	public void setHeight() {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter your height: ");
			height = scanner.nextDouble();

		} while (height <= 0);
		scanner.close();
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public void showMan() {
		System.out.printf("\nThe man with age %d and height %.2f", this.age, this.height);
	}
}
