package com.bridgelabz.Utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction;

/**
 * @author OmPrajapati
 *
 */
public class Utility {

	Scanner scanner = new Scanner(System.in);
	BufferedReader br;

	/**
	 * constructor to initialize bufferedReader
	 */
	public Utility() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * take input word
	 */
	public String inputString() {
		try {
			return br.readLine();
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		return "";
	}

	/**
	 * Take Integer Input
	 *
	 */
	public int inputInteger() {
		try {
			try {
				return Integer.parseInt(br.readLine());
			} catch (NumberFormatException nfe) {
				System.out.println(nfe.getMessage());
			}
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		return 0;
	}

	/**
	 * Take Double Input
	 */
	public double inputDouble() {
		try {
			try {
				return Double.parseDouble(br.readLine());
			} catch (NumberFormatException nfe) {
				System.out.println(nfe.getMessage());
			}
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		return 0.0;
	}

	
	/**
	 * @param input year
	 * @return boolean
	 */
	public boolean leapYearCheaker(int year) {
		if (year > 1000) {
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				return true;
			}
		}
		return false;
	}


	/**
	 * @param integer
	 * @return integer
	 */
	public int poworOfTwo(int integer) {
		int power = 1;
		while (integer != 0) {
			power = 2 * power;
			integer--;
		}
		return power;
	}

	/**
	 * @param input number
	 * @param create a method HarmonicNumber
	 * @return double
	 */
	public double harmonicNumber(int number) {
		double sum = 0.0;
		for (int i = 1; i <= number; i++) {
			sum = sum + (1.0 / i);
		}
		return sum;
	}

	/**
	 * 
	 */
	/**
	 * @param input number
	 * @param create a method of prime number
	 * @return boolean
	 */
	public boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	/**
	 * @param input limit
	 * @return create a method to String[] prime
	 */
	public String[] checkPrime(int limit) {
		String[] arry = new String[limit];
		int position=0;
		for(int i=2; i < limit; i++) {
             if(isPrime(i)){
            	arry[position] = String.valueOf(i);
				position++;
             }
		}
        String[] array1 = new String[position];
 		for (int k = 0; k < position; k++) {
 			array1[k] = arry[k];
 		}
 		return array1;      
	}
	

	/**
	 * @param input number
	 * @param create a method to check palindrome
	 * @return boolean
	 */
	public boolean palindromeNumber(int number) {
		int rem, sum = 0, temp;
		temp = number;
		while (number != 0) {
			rem = number % 10;
			sum = sum * 10 + rem;
			number = number / 10;
		}
		if (sum == temp)
			return true;
		return false;
	}

	/**
	 * @param input First string
	 * @param input Second string
	 * @param  create a method to Anagram
	 * @return boolean
	 */
	public boolean checkAnagram(String string1, String string2)
	{
		if (string1.length() != string2.length()) {
			return false;
		}
		char[] charArray1 = string1.toCharArray();
		Arrays.sort(charArray1);
		char[] charArray2 = string2.toCharArray();
		Arrays.sort(charArray2);
		for (int i = 0; i < charArray1.length; i++) {
			if (charArray1[i] != charArray2[i]) {
				if(charArray1[i]!=charArray2[i]) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * @param input number
	 * @return String Array
	 */
	public String[] prime(int number) 
	{
		String[] array = new String[1000];
		int position = 0;
		for (int i = 2; i <= number; i++)
		{
			boolean b = true;
			for (int j = 2; j <= i / 2; j++) 
			{
				if ((i % j) == 0) 
				{
					b = false;
					break;
				}
			}
			if (b) {
				array[position] = String.valueOf(i);
				position++;
			}
		}
		String[] array1 = new String[position];
		for (int k = 0; k < position; k++) {
			array1[k] = array[k];
		}
		return array1;
	}

	/**
	 * @param input String 
	 * @param create a method to check and print Palindrome number
	 * @return boolean
	 */
	public boolean palindrome(String s) {
		if (s.length() < 2) {
			return false;
		}
		char[] c = s.toCharArray();
		int n = c.length;
		for (int i = 0; i < n; i++) {
			if (c[i] != c[n - 1 - i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @return integer Array
	 */
	public int[][] readArrayInt() {
		System.out.println("Enter M of rows : ");
		int m = scanner.nextInt();
		System.out.println("Enter N of coloms : ");
		int n = scanner.nextInt();

		System.out.println("Enter " + m * n + " of elements : ");
		int a[][] = new int[m][n];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		return a;
	}


	/**
	 * @param input integer array
	 */
	public void displayInt(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + Utility.padRight(" ", 10));
			}
			System.out.println();
		}
	}

	/**
	 * @param create a read method for Double 2D array
	 * @return double array
	 */
	public double[][] readArrayDouble() {
		System.out.println("Enter M of rows : ");
		int m = scanner.nextInt();
		System.out.print("Enter N of coloms : ");
		int n = scanner.nextInt();

		System.out.println("Enter " + m * n + " of elements : ");
		double a[][] = new double[m][n];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = scanner.nextDouble();
			}
		}
		return a;
	}

	/**
	 * @param double integer array
	 * @param create a display method for Double 2D array
	 */
	public void displayDouble(double a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + Utility.padRight(" ", 10));
			}
			System.out.println();
		}
	}

	/**
	 * @param input String 
	 * @param input number
	 * @param create methods for Right padding
	 * @return String
	 */
	public static String padRight(String string, int number) {
		return String.format("%1$-" + number + "s", string);
	}

	/**
	 * @param input String 
	 * @param input number
	 * @param create methods for Left padding
	 * @return String
	 */
	public static String padLeft(String string, int number) {
		return String.format("%1$" + number + "s", string);
	}

	/**
	 * @return boolean array
	 */
	public boolean[][] readArrayBoolean() {

		System.out.println("Enter M of rows : ");
		int m = scanner.nextInt();
		System.out.print("Enter N of coloms : ");
		int n = scanner.nextInt();

		System.out.println("Enter " + m * n + " of elements : ");
		boolean a[][] = new boolean[m][n];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = scanner.nextBoolean();
			}
		}
		return a;
	}

	/**
	 * @param input boolean array
	 */
	public void displayBoolean(boolean a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + Utility.padRight(" ", 5));
			}
			System.out.println();
		}
	}

	/**
	 * @param input integer array
	 * @param create a method sum of three integer number is zero
	 * @return integer
	 */
	public int sumofthree(int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				for (int k = j; k < a.length; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
						count++;
					}
				}
			}
		}
		return count;
	}

	/**
	 * @param create a method read an Array
	 * @return integer array
	 */
	public int[] readArray() {
		System.out.print("Enter the size of array");
		int n = scanner.nextInt();
		int a[] = new int[n];
		System.out.print("Enter the " + n + " elements ");
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}

	/**
	 * @param input integer array
	 * @param create a method display an Array
	 */
	public void display(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	/**
	 * create a permute method
	 */
	public void permute(String st, int start, int end) {
		if (start == end) {
			System.out.println(st);
		} else {
			for (int i = start; i <= end; i++) {
				st = swap(st, start, i);
				permute(st, start + 1, end);
				st = swap(st, start, i);
			}
		}
	}
	
	/**
	 * @param input string st
	 * @param input number a
	 * @param input number b
	 * @param create a method to swap the string
	 * @return String 
	 */
	public String swap(String st, int a, int b) {
		char[] ch = st.toCharArray();
		char temp = ch[a];
		ch[a] = ch[b];
		ch[b] = temp;
		return String.valueOf(ch);
	}

	/**
	 * Simulate Stop watch Program
	 */
	long startTime = 0;
	long stopTime = 0;
	boolean running = false;
	
	public void start() {
		this.startTime = System.currentTimeMillis();
		this.running = true;
	}

	public void stop() {
		this.stopTime = System.currentTimeMillis();
		this.running = false;
	}

	/**
	 * @return boolean
	 */
	public long getElapsedTime() {
		long elapsed;
		if (running) {
			elapsed = (System.currentTimeMillis() - startTime);
		} else {
			elapsed = (stopTime - startTime);
		}
		return elapsed;
	}

	/**
	 * @param input integer firstnumber
	 * @param input integer secondnumber
	 * @param create a power function
	 * @return integer
	 */
	public int powerFunction(int firstnumber, int secondnumber) {
		if (secondnumber == 0) {
			return 1;
		}
		return (firstnumber * powerFunction(firstnumber, secondnumber - 1));
	}

	/**
	 * @param input integer a
	 * @param input integer b
	 * @param input integer c
	 * @param create a method to find root
	 */
	public void findRoot(int a, int b, int c) {
		double delta, root1, root2;
		delta = Math.pow(b, 2) - 4 * a * c;
		System.out.println(delta);
		root1 = (-1 * b + Math.sqrt(delta)) / (2 * a);
		root2 = (-1 * b - Math.sqrt(delta)) / (2 * a);
		System.out.println("Frist Root of the question is : " + root1);
		System.out.println("Second Root of the question is : " + root2);
	}

	/**
	 * @param input integer valueOfx
	 * @param  input integer valueOfy
	 * @param create a method distance between two origin
	 */
	public void distance(int valueOfx, int valueOfy) {
		int powerofx = powerFunction(valueOfx, 2);
		System.out.println("Power of number x is :" + powerofx);
		int powerofy = powerFunction(valueOfy, 2);
		System.out.println("Power of number y is :" + powerofy);
		int distance = (powerofx + powerofy);
		System.out.println("Distance between two origin is  : " + Math.sqrt(distance));
	}
	
	/**
	 * @param input integer t
	 * @param input integer v
	 * @param create a method of calculateWindChill
	 */
	public void calculateWindChill(int t, int v) {
		double windChill;
		if (t > 50) {
			System.out.println("Temperature should not be greater than 50 ");
			calculateWindChill(t, v);
			return;
		}
		if ((v > 120) || (v < 3)) {
			System.out.println("Velocity should be greater than 3 and less than 120 ");
			calculateWindChill(t, v);
			return;
		}
		windChill = 35.74 + 0.6215 * t + (0.4275 * t - 53.75) * (Math.pow(v, 0.16));
		System.out.println("WindChill : " + windChill);
	}
}
