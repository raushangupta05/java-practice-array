package com.Qspider.array;

public class ReverseAArray {

	public static void main(String[] args) {

		int count = 0;
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + ",");

		}
		// if we don't want to use length() method then we can use for each loop
		// which will count the element

		for (int j : arr) {
			count++;
		}
		System.out.println();
		System.out.print("Total elements in array is :" + count);

	}
}
