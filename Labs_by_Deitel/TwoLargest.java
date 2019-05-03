package home;

import java.util.Scanner;

public class TwoLargest {
	public static void main(String[] args){
		int number=0;
		int maxNumber1=-999;
		int maxNumber2=0;
		Scanner input = new Scanner(System.in);
		for (int i=0;i<10;i++) {
			System.out.printf("Enter number %d: ",i+1);
			number = input.nextInt();
			if(maxNumber1<number) {
				if(number<maxNumber2) {
					maxNumber1 = number;
				}
				else {
					maxNumber2 = number;
				}
			}
		}
		System.out.printf("The largest number1 is %d", maxNumber2);
		System.out.printf("The largest number2 is %d", maxNumber1);
	}

}
