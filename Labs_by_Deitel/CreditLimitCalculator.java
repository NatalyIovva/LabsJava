package home;

import java.util.Scanner;

public class CreditLimitCalculator {
	public static void main(String[] args){
		int newBalance=0;
		int accountNumber=0;//account number
		int balanceSMonth=0;// balance at the beginning of the month 
		int items=0;//total of all items charged by the customer this month 
		int credits=0;//total of all credits applied to the customer’s account this month
		int limit=1000;//allowed credit limit
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter account number or -1:");
		accountNumber = input.nextInt();
		while(accountNumber!=-1) {
			System.out.print("Enter balance at the beginning of the month:");
			balanceSMonth = input.nextInt();
			System.out.print("Enter total of all items charged by the customer this month:");
			items = input.nextInt();
			System.out.print("Enter total of all credits applied to the customer’s account this month:");
			credits = input.nextInt();
			newBalance=balanceSMonth+items-credits;
			
			if(newBalance>limit) {
				System.out.println("Credit limit exceeded");
			}
			else {
				System.out.printf("New balence: %d%n",newBalance);
			}
			System.out.print("Enter account number or -1:");
			accountNumber = input.nextInt();
	}
}
}