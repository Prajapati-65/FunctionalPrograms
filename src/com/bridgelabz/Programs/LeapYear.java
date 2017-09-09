package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Utility;

public class LeapYear 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter a Year : ");
		int inputyear=utility.inputInteger();
		
		boolean leap = utility.leapYearCheaker(inputyear);
		if(leap)
		{
			System.out.println("Year "+inputyear+" is leap year : ");
		}
		else
		{
			System.out.println("Year "+inputyear+" is not leap year : ");
		}
	}
}