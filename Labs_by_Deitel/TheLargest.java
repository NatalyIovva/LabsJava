package home;

import java.util.Scanner;

public class TheLargest {
	public static void main(String[] args){
		int number=0;
		int maxNumber=-999;
		Scanner input = new Scanner(System.in);
		for (int i=0;i<10;i++) {
			System.out.printf("Enter number %d: ",i+1);
			number = input.nextInt();
			if(maxNumber<number) {
				maxNumber = number;
			}
		}
		System.out.printf("The largest number is %d", maxNumber);
	}

}
