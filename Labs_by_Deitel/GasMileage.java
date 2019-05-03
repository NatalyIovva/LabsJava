package home;

import java.util.Scanner;

public class GasMileage {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter milles or -1:");
		int milles = input.nextInt();
		while(milles!=-1) {
		System.out.print("Enter gallons:");
		int gallons = input.nextInt();
		double result =(double)milles/gallons;
		System.out.printf("%nMilles: %d%nGallons: %d%nMiles per gallon: %.2f%n",milles,gallons,result);
		System.out.print("Enter milles or -1:");
		milles = input.nextInt();
		}
	}

}
