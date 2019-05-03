package home;
import java.util.Scanner;
public class SquareofAsterisks {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n;
		do{
			System.out.print("Enter the size of the side of a square: ");
			n=input.nextInt();
		}while(n>20||n<1);
		
		for(int i = 0; i<n; i++,System.out.println("")) {
			for(int j = 0; j<n; j++) {
				if(i==0||i==(n-1)) {
					System.out.print("*");
				}
				if((i!=0&&i!=(n-1))&&(j==0||j==(n-1))) {
					System.out.print("*");
				}
				if((i!=0&&i!=(n-1))&&(j!=0&&j!=(n-1))){
						System.out.print(" ");
					}
			}
		}
	}

}
