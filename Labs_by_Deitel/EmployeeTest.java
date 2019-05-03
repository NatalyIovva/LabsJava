import java.util.Scanner;
public class EmployeeTest {
	public static void main(String[] args){
		Employee emp1 = new Employee("Ion","Popov",0.0);
		Employee emp2 = new Employee("Dima","Lisa",0.0);
		System.out.printf("Name: %s%nLast Name: %s%nSalary: %.2f%n",
				emp1.getName(),emp1.getLastName(),emp1.getSalary());
		System.out.printf("Name: %s%nLast Name: %s%nSalary: %.2f%n",
				emp2.getName(),emp2.getLastName(),emp2.getSalary());
	      // create a Scanner to obtain input from the command window
	      Scanner input = new Scanner(System.in);
	      System.out.print("Enter salary of empoyee1: "); // prompt
	      double sal1 = input.nextDouble(); // obtain user input
	      emp1.setSalary(sal1);
		  System.out.printf("Name: %s%nLast Name: %s%nSalary: %.2f%nYearly salary:%.2f%n",
				emp1.getName(),emp1.getLastName(),emp1.getSalary(),emp1.getSalary()*12);
		  System.out.print("Enter salary of empoyee2: "); // prompt
	      double sal2 = input.nextDouble(); // obtain user input
	      emp2.setSalary(sal2);
		  System.out.printf("Name: %s%nLast Name: %s%nSalary: %.2f%nYearly salary:%.2f%n",
				emp2.getName(),emp2.getLastName(),emp2.getSalary(),emp2.getSalary()*12);
		  System.out.println("After a 10% raise:");
		  sal1+=sal1*0.1;
		  emp1.setSalary(sal1);
		  System.out.printf("Name: %s%nLast Name: %s%nSalary: %.2f%nYearly salary:%.2f%n",
					emp1.getName(),emp1.getLastName(),emp1.getSalary(),emp1.getSalary()*12);
		  sal2+=sal2*0.1;
		  emp2.setSalary(sal2);
		  System.out.printf("Name: %s%nLast Name: %s%nSalary: %.2f%nYearly salary:%.2f%n",
				emp2.getName(),emp2.getLastName(),emp2.getSalary(),emp2.getSalary()*12);
	}
}
