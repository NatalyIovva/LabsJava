package home;

import java.util.Scanner;

public class CommissionCalculator {
	public static void main(String[] args){
		double seles =0;
		double salary=200;
		double commision=0.9;
		double[] values = {239.99,129.75,99.95,350.89};
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of salesperson:");
		int salespeopleNumber = input.nextInt();
		while(salespeopleNumber!=-1) {
			System.out.print("Enter quantity of types of items:");
			int Qtypes =input.nextInt();
			while(Qtypes!=0) {
				System.out.print("Enter number of items:");
				int item = input.nextInt()-1;
				System.out.print("Enter quantity of items:");
				int quantity = input.nextInt();
				seles+= values[item]*quantity;
				Qtypes--;
			}
           System.out.printf("Person Number: %d%nSalary: %.2f%n",salespeopleNumber,seles+salary);
			
		}
	}
}
