package home;
import java.util.Scanner;
public class SmallestValue {
	public static void main(String[] args){
		int minNumber=9999,number;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of values : ");
		int n= input.nextInt();
		for(int counter=0;counter<n;counter++) {
			System.out.printf("Enter the value %d: ",counter+1);
			number= input.nextInt();
			if(minNumber>number)minNumber = number;
		}
		System.out.printf("The smallest number is %d", minNumber);
	}

}
