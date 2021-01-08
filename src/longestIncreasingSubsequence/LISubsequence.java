package longestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.Random;

public class LISubsequence {

	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public LISubsequence(int n) {
		setN(n);
	}

	public void lisSolution() {
		// Creating the ourList array
		ArrayList<Integer> ourList = new ArrayList<Integer>();
		ArrayList<Integer> maxList = new ArrayList<Integer>();
		ArrayList<Integer> tempList = new ArrayList<Integer>();

		// Random number variable
		Random randNum = new Random();

		// Filling our array with random numbers
		for (int i = 0; i < n; i++) {
			ourList.add(randNum.nextInt(100 - 0) + 0);
		}

		// Printing out ourList
		System.out.println("\nOur List");
		System.out.println("--------");
		System.out.println(ourList);
		
		//Finding the LIS
		for (int i = 0; i < n - 1; i++) {

			if (ourList.get(i) < ourList.get(i + 1)) {
				tempList.add(ourList.get(i));
			} else {
				tempList.add(ourList.get(i));

				if (tempList.size() > maxList.size()) {
					maxList.clear();
					for (int j = 0; j < tempList.size(); j++) {
						maxList.add(tempList.get(j));
					}
				}
				tempList.clear();
			}
		}

		//Printing out the LIS and it's size
		System.out.println("\nLongest Increasing Subsequence");
		System.out.println("--------------------------------");
		System.out.println(maxList);
		System.out.println("List Size: " + maxList.size());
	}

}
