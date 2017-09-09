package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Utility;

/**
 * @author OmPrajapati
 *
 */
public class EuclideanDistance {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter x number :");
		int valueOfx= utility.inputInteger();
		System.out.println("Enter y number :");
		int valueOfy = utility.inputInteger();
		utility.distance(valueOfx,valueOfy);
	}
}
