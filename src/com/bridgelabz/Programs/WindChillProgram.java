package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Utility;

/**
 * @author OmPrajapati
 *
 */
public class WindChillProgram {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the  temperature : ");
		int temp = utility.inputInteger();
		System.out.println("Enter the speed of the air : ");
		int speed = utility.inputInteger();
		utility.calculateWindChill(temp, speed);
	}
}
