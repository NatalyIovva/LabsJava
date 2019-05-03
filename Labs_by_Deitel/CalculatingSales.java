package home;
import java.util.Scanner;
public class CalculatingSales {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int quantity;
		double products;
		System.out.print("Enter product number:");
		int pNumber = input.nextInt();
		switch(pNumber) {
		case 1:products=2.98;
		System.out.print("Enter quantity of product:");
		quantity = input.nextInt();
		System.out.printf("Sales=%.2f",(double)quantity*products); break;
		case 2:products=4.50;
		System.out.print("Enter quantity of product:");
		quantity = input.nextInt();
		System.out.printf("Sales=%.2f",(double)quantity*products);break;
		case 3:products=9.98;
		System.out.print("Enter quantity of product:");
		quantity = input.nextInt();
		System.out.printf("Sales=%.2f",(double)quantity*products);break;
		case 4:products=4.49;
		System.out.print("Enter quantity of product:");
		quantity = input.nextInt();
		System.out.printf("Sales=%.2f",(double)quantity*products);break;
		case 5:products=6.87;
		System.out.print("%nEnter quantity of product:");
		quantity = input.nextInt();
		System.out.printf("Sales=%.2f",(double)quantity*products);break;
		}
				
	}

}
