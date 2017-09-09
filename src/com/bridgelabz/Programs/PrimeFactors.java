package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Utility;

public class PrimeFactors 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter a integer number");
		int inputNumber=utility.inputInteger();
		for(int i=2;i<=inputNumber;i++)
		{  
			if(utility.isPrime(i))
			{
			   System.out.print(i+" ");
			}
		}
	    System.out.println();
	}
}
