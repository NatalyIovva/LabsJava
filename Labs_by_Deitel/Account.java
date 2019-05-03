package home;

public class Account {
	  private String name; // instance variable    
	  private double balance; // instance variable
	  
	// Account constructor that receives two parameters
	  public Account (String name,double balance) {
		  this.name = name;
		  if(balance>0.0)
			  this.balance=balance;
	  }
	  public void deposit(double depositAmount){ 
		  if (depositAmount > 0.0) // if the depositAmount is valid        
			  balance = balance + depositAmount; // add it to the balance
		  }
	// method returns the account balance
		public double getBalance(){
		return balance;
		}
		// method that sets the name
		public void setName(String name){
		 this.name = name;
			}
			// method that returns the name
			 public String getName(){
				 return name; // give value of name back to caller
			}
}

