package longestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Scanner for input from user
		Scanner s = new Scanner(System.in);

		// Asking for the size of the array
		System.out.println("How many numbers to you want in our list (Must be less than 100)");
		int n = s.nextInt();

		while (n < 0 || n > 99) {
			System.out.println("Your list must be less than 100 and not negative (Please enter amount)");
			n = s.nextInt();
		}
		
		//creating object and passing n
		LISubsequence lis = new LISubsequence(n);
		
		//calling solution
		lis.lisSolution();

	}

}
