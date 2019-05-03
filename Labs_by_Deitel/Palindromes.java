package home;
import java.util.Scanner;
public class Palindromes {
	public static void main(String[] args){
		int number,n=0,copyNumber,part1,part2;
		Scanner input = new Scanner(System.in);
			System.out.print("Enter five-digit integer: ");
		number=input.nextInt();
		copyNumber=number;
		do {
			if(copyNumber%10!=0) {
				copyNumber=(copyNumber-(copyNumber%10))/10;n++;
			}
		}while(copyNumber!=0);
		if(n!=5) {
			System.out.println("Error the number isn't five-digit integer!!");
		}
		else {
			part1=number%100;
			part2=(number-number%1000)/1000;
					if((part1%10==(part2-part2%10)/10)&&((part1-part1%10)/10==part2%10)) {
						System.out.println("The number is Palindrome!");
					}
					else {
						System.out.println("The number isn't Palindrome!");
					}
			
		}

		
		
	}

}
