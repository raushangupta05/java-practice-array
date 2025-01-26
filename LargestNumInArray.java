package com.Qspider.array;

public class LargestNumInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 12, 34, 55, 42, 12, 233 };
		int largest = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];

			}
		}
		System.out.println(largest);
	}

}
