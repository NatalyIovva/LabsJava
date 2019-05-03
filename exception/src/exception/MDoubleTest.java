package exception;
import java.util.Scanner;
/*
 create your own exception
 create a method that can raise this exception
 write a method to catch and handle an exception thrown by another method
 Create a MDouble class that behaves as double, but does not allow values NEGATIVE_INFINITY and NaN
 getting these values is considered exceptional. Write instead of NEGATIVE_INFINITY 99999, NaN 0
 Consider the task given two arrays of arbitrary values of type MDouble get the third array l[i]=K[i]/M[i]
 */


public class MDoubleTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter number of elements: ");
		int N = scanner.nextInt();
		MDouble[] K = new MDouble[N];// create a one-dimensional array
		MDouble[] M = new MDouble[N];// create a one-dimensional array
		MDouble[] L = new MDouble[N];// create a one-dimensional array
		double num;
		for (int i = 0; i < N; i++) {
			L[i] = new MDouble(0);// reset the resulting array
		}
		for (int i = 0; i < N; i++) {
			System.out.println((i + 1) + " Enter number K: ");
			num = scanner.nextDouble();
			K[i] = new MDouble(num);// enter value into array К
			System.out.println((i + 1) + " Enter number M: ");
			num = scanner.nextDouble();
			M[i] = new MDouble(num);// enter value into array М

			try {
				double a = K[i].share(M[i]);// calculate the value for the array L
				System.out.println("");
				L[i].setMDouble(a);// enter value into array L
			} catch (MDoubleException ex) {
				System.out.println(ex.getMessage());// display error message
				System.out.println(ex.getNumber());
			}
		}
		scanner.close();
		// output data from arrays
		for (int i = 0; i < N; i++) {
			System.out.print(" " + K[i].retMDouble());
		}
		System.out.println("");
		for (int i = 0; i < N; i++) {
			System.out.print(" " + M[i].retMDouble());
		}
		System.out.println("");
		for (int i = 0; i < N; i++) {
			System.out.print(" " + L[i].retMDouble());
		}
	}

}
