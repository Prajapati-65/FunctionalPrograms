package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Utility;

/**
 * @author OmPrajapati
 *
 */
public class CoinToss {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter a number");
		int inputNumber = utility.inputInteger();
		int heads = 0;
		for (int i = 0; i < inputNumber; i++) {
			double random = Math.random();
			if (random > 0.5) {
				System.out.println("Head ");
				heads++;
			} else {
				System.out.println("Tails");
			}
		}
		System.out.println("Percentage of heads : " + (double) heads / inputNumber);
		System.out.println("Percentage of tails :  " + ((double) inputNumber - heads) / inputNumber);
	}
}
