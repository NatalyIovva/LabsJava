package home;

import java.util.Scanner;

public class SalaryCalculator {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Name of employer #1:");
		String emp1 = input.nextLine();
		System.out.print("Enter Name of employer #2:");
		String emp2 = input.nextLine();
		System.out.print("Enter Name of employer #3:");
		String emp3 = input.nextLine();
		System.out.print("Enter hours for employer #1:");
		int hour1 = input.nextInt();
		System.out.print("Enter hour for employer #2:");
		int hour2 = input.nextInt();
		System.out.print("Enter hour for employer #3:");
		int hour3 = input.nextInt();
		int straightTime = 100;
		double sal1=0;
		sal1=((double)hour1/40-1)*(straightTime+straightTime/2)+straightTime;
		System.out.printf("Name: %s%nSalary: %.2f%n", emp1,sal1);
		double sal2=0;
		sal2=((double)hour2/40-1)*(straightTime+straightTime/2)+straightTime;
		System.out.printf("Name: %s%nSalary: %.2f%n", emp2,sal2);
		double sal3=0;
		sal3=((double)hour3/40-1)*(straightTime+straightTime/2)+straightTime;
		System.out.printf("Name: %s%nSalary: %.2f%n", emp3,sal3);
	}
}
