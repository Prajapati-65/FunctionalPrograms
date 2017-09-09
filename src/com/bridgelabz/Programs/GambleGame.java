package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Utility;

/**
 * @author OmPrajapati
 *
 */
public class GambleGame {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the $state");
		int $state = utility.inputInteger();
		System.out.println("Enter the $Goal");
		int $Goal = utility.inputInteger();
		System.out.println("Enter no. of times: ");
		int noOfTimes = utility.inputInteger();
		int bet = 0;
		int win = 0;
		for (int i = 0; i < noOfTimes; i++) {
			int sum = $state;
			while (sum > 0 && sum < $Goal) {
				bet++;
				if (Math.random() < 0.5) {
					sum++;
				} else {
					sum--;
				}
			}
			if (sum == $Goal) {
				win++;
			}
		}
		System.out.println(win + " wins of : " + noOfTimes);
		System.out.println("Percent of games won = " + 100.0 * win / noOfTimes);
		System.out.println("Avg  bets : = " + 1.0 * bet / noOfTimes);
	}
}
