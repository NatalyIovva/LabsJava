package hierarchy_of_class;

import java.util.Scanner;

/* Create hierarchy of class Side - Square - Board - Stool.
Stool define height.Class Square must have the method which define area of square.
Class Stool must have the method which define if human can sit on the stool.
It is known,that the human older than 35 years old can't sit on the stool 
with area smaller than 0.25 sq. m. The human tallest than 1.75 m can't sit on the stool
with height smaller than 0.5 m. and higher than 1.20 m, but human lower than 1.75 m. 
can't sit on the stool higher then 1 m. and lower than 0.1 m.
 Create method MAIN, in which create 5 stools and define if 3 different persons would 
be able to sit on those 5 stools.
*/


class StoolTest {

	public static void showTrue(Man man, Stool st) {
		man.showMan();
		System.out.print(" can sit on ");
		st.showStool();
	}

	public static void showFalse(Man man, Stool st) {
		man.showMan();
		System.out.print(" can't sit on ");
		st.showStool();
	}

	public static void vvod(Stool s) {
		Scanner scanner = new Scanner(System.in);
		double height;
		do {
			System.out.println("Enter height(double): ");
			height = scanner.nextDouble();

		} while (height <= 0);
		s.setHeight(height);
		double side;
		do {
			System.out.println("Enter side(double): ");
			side = scanner.nextDouble();

		} while (side <= 0);
		s.setSide(side);
		double stool_leg;
		do {
			System.out.println("Enter height of stool legs(double): ");
			stool_leg = scanner.nextDouble();

		} while (stool_leg <= 0);
		s.setStool_leg(stool_leg);
		scanner.close();
	}

	public static void main(String[] args) {
		Stool st1 = new Stool();
		vvod(st1);
		Stool[] st = new Stool[5];
		st[0] = new Stool(0.05, 0.5, 1.0);
		st[1] = new Stool(0.04, 0.4, 0.25);
		st[2] = new Stool(0.08, 0.8, 0.88);
		st[3] = new Stool(0.02, 0.6, 1.2);
		st[4] = new Stool(0.05, 0.5, 0.5);
		Man[] man = new Man[3];
		man[0] = new Man(35, 1.75);
		man[1] = new Man(30, 2.10);
		man[2] = new Man(40, 1.60);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if (st[j].canSitdow(man[i]))
					showTrue(man[i], st[j]);
				else
					showFalse(man[i], st[j]);
			}
		}
	}

}
