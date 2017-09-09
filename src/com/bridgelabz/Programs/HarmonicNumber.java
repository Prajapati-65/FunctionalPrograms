package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Utility;

/**
 * @author OmPrajapati
 *
 */
public class HarmonicNumber {
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter Nth harmonic number : ");
		int enterNumber = utility.inputInteger();
		double results = utility.harmonicNumber(enterNumber);
		if (enterNumber > 0) {
			System.out.println("The Harmonic Value for the number is : " + results);
		} else {
			System.out.println("The number should be greater than zero");
		}
	}
}
