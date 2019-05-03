
public class Employee {
private String name;
private String lastName;
private double salary;
public Employee(String name,String lastName,double salary) {
setName(name);
setLastName(lastName);
setSalary(salary);
}
public void setName(String name){
	 this.name = name;
		}
public void setLastName(String lastName){
	 this.lastName = lastName;
		}
public void setSalary(double salary){
	if(salary>0) {
		this.salary = salary;
	}
		}
public String getName() {
	return name;
}
public String getLastName() {
	return lastName;
}
public double getSalary() {
	return salary;
}
}
