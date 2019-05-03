import java.util.Scanner;
public class InvoiceTest {
	public static void main(String[] args){
		Invoice invoice1 = new Invoice ("20I","Black",0, 0.0);
		Invoice invoice2 = new Invoice ("201I","White",0, 0.0);
		
		// display initial invoice of each object
	      System.out.printf("%s %s%n",
	    	 invoice1.getPartNumber(), invoice1.getPartDescription()); 
	      System.out.printf("%s %s%n",
	    	 invoice2.getPartNumber(), invoice2.getPartDescription()); 
	      
	      // create a Scanner to obtain input from the command window
	      Scanner input = new Scanner(System.in);
	      System.out.print("Enter quantity of invoice1: "); // prompt
	      int quantity1 = input.nextInt(); // obtain user input
	      invoice1.setQuantity(quantity1);
	      System.out.print("Enter price for invoice1: "); // prompt
	      double price1 = input.nextDouble(); // obtain user input
	      invoice1.setPrice(price1);
	      
	      //display invoice
	      System.out.printf("invoice1:%n quantity %d%n price %.2f%nInvoice amount: %.2f%n",
	    		  invoice1.getQuantity(),invoice1.getPrice(),invoice1.getInvoiceAmount());
	      
	      System.out.print("Enter quantity of invoice2: "); // prompt
	      int quantity2 = input.nextInt(); // obtain user input
	      invoice2.setQuantity(quantity2);
	      System.out.print("Enter price for invoice2: "); // prompt
	      double price2 = input.nextDouble(); // obtain user input
	      invoice2.setPrice(price2);
	      
	      //display invoice
	      System.out.printf("invoice2:%n quantity %d%n price %.2f%nInvoice amount: %.2f",
	    		  invoice2.getQuantity(),invoice2.getPrice(),invoice2.getInvoiceAmount());
	      
	}

}
