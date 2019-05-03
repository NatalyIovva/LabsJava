package home;
import java.util.Scanner;
public class factorial_a {
	public static void main(String[] args){
		int number,factorial;
		Scanner input = new Scanner(System.in);
		do{
			System.out.print("Enter number:");
			number = input.nextInt();
		}while(number<=0);
		factorial = number;
		if(number==1) {
			factorial=1;
		}
		else {
			do {
				number--;
				factorial*=number;
			}while(number!=1);
		}
		
		System.out.printf("%d!=%d",number,factorial);
	}


}

