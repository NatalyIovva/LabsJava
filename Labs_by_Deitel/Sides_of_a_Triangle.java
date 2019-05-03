package home;
import java.util.Scanner;
public class Sides_of_a_Triangle {
	public static void main(String[] args){
		int sideA,sideB,sideC;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value for first side of a Triangle:");
		sideA=input.nextInt();
		System.out.print("Enter value for second side of a Triangle:");
		sideB=input.nextInt();
		System.out.print("Enter value for third side of a Triangle:");
		sideC=input.nextInt();
		if(sideA>0 && sideB>0 && sideC>0) {
				if((sideB+sideC>sideA)&&(sideC+sideA>sideB)&&(sideA+sideB>sideC)) {
						System.out.println("Triangle exist.");
					
				}
				else {
					System.out.println("Triangle don't exist.");
				}
		}
		else {
			System.out.println("Triangle don't exist.");
		}
	}
}
