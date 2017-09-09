package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Utility;

/**
 * @author OmPrajapati
 *
 */
public class TwoDArray {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("1 2D arrays of Integers : ");
		System.out.println("2 2D arrays of Double : ");
		System.out.println("3 2D arrays of boolean : ");
		System.out.println();
		System.out.println("Enter Your Choice : ");
		System.out.println();
		int inputNumber = utility.inputInteger();
		switch (inputNumber) {
		case 1:
			int a[][] = utility.readArrayInt();
			utility.displayInt(a);
			break;
		case 2:
			double d[][] = utility.readArrayDouble();
			utility.displayDouble(d);
			break;
		case 3:
			boolean b[][] = utility.readArrayBoolean();
			utility.displayBoolean(b);
			break;
		case 4:
			System.exit(0);
		default:
			System.out.println("Wrong Input");
			break;
		}
	}
}
