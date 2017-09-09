package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Utility;

/**
 * @author OmPrajapati
 *
 */
public class CouponNumbers {
	
	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("Enter any number :");
		int n = u.inputInteger();
		int max = 1000;
		int random = (int) (Math.random() * max);
		StringBuffer sb = new StringBuffer();
		while (random > 0) 
		{
			sb.append(random);
			random = random / n;
		}
		String couponCode = sb.toString();
		System.out.println("Coupon Code: " + couponCode);
	}
}
