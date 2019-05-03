
public class Invoice {
private String partNumber;
private String partDescription;
private int quantity;
private double price;
public Invoice(String partNumber,String partDescription,int quantity,double price){
	setPartNumber(partNumber);
	setPartDescription(partDescription);
	setQuantity(quantity);
	setPrice(price);
}
public double getInvoiceAmount() {
	if(quantity<0)quantity=0;
	if(price<0)price=0.0;
double invoiceAmount = quantity * price;
return invoiceAmount;
}
public void setPartNumber(String partNumber) {
	this.partNumber = partNumber;
}
public void setPartDescription(String partDescription) {
	this.partDescription = partDescription;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public void setPrice(double price) {
	this.price = price;
}
public String getPartNumber() {
	return this.partNumber;
}
public String getPartDescription() {
	return this.partDescription;
}
public int getQuantity() {
	return this.quantity;
}
public double getPrice() {
	return this.price;
}
}
