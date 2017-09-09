package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Utility;

/**
 * @author OmPrajapati
 *
 */
public class PowerOfTwo {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter a integer number ");
		int inputNumber = utility.inputInteger();
		if (inputNumber < 31) {
			for (int i = 0; i < inputNumber; i++) {
				int power = utility.poworOfTwo(i);
				System.out.println("Power of 2^" + i + " is: " + power);
			}
		} else {
			System.out.println("Please enter the number between 0 - 31 ");
		}
	}
}
