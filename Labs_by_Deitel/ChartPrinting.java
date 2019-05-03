package home;
import java.util.Scanner;
public class ChartPrinting {
	public static void main(String[] args){
		int number1,number2,number3,number4,number5;
		Scanner input = new Scanner(System.in);
			do {System.out.printf("Enter the value of number %d: ",1);
			 number1=input.nextInt();
			}while(number1>31||number1<0);
			do {System.out.printf("Enter the value of number %d: ",2);
			 number2=input.nextInt();
			}while(number2>31||number2<0);
			do {System.out.printf("Enter the value of number %d: ",3);
			 number3=input.nextInt();
			}while(number3>31||number3<0);
			do {System.out.printf("Enter the value of number %d: ",4);
			 number4=input.nextInt();
			}while(number4>31||number4<0);
			do {System.out.printf("Enter the value of number %d: ",5);
			 number5=input.nextInt();
			}while(number5>31||number5<0);
			for(int count=0;count<number1;count++) {
				System.out.print("*");
			}
			System.out.println("");
			for(int count=0;count<number2;count++) {
				System.out.print("*");
			}
			System.out.println("");
			for(int count=0;count<number3;count++) {
				System.out.print("*");
			}
			System.out.println("");
			for(int count=0;count<number4;count++) {
				System.out.print("*");
			}
			System.out.println("");
			for(int count=0;count<number5;count++) {
				System.out.print("*");
			}

	}
}
