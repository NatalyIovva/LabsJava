package home;
import java.util.Scanner;
public class factorial_b {
	public static void main(String[] args){
		int number;
		double e;
		Scanner input = new Scanner(System.in);
		do{
			System.out.print("Enter number:");
			number = input.nextInt();
		}while(number<=0);
		e=1/factorial(number);
		while((number-1)!=0){
			number--;
			e+=(double)1/factorial(number);
		}
		e+=1;
		System.out.printf("e=%.6f%n",e);
		
	}
public static double factorial(int number) {
	double factorial;
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
	return(factorial);
}

}

