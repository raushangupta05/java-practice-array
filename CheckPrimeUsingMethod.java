package com.Qspider.array;

public class CheckPrimeUsingMethod {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 3, 5, 7, 9, 11, 13, 15, 20, 17, 19 };

		for (int i = 0; i < arr.length; i++) {
			int number = arr[i];
			if (isPrime(number)) {
				System.out.println(number + " is a Prime");
			} else {
				System.out.println(number + " is not a Prime");
			}

		}

	}

	public static boolean isPrime(int num) {
		for (int j = 2; j < num / 2; j++) {
			if (num % j == 0) {
				return false;

			}
		}
		return true;
	}
}
