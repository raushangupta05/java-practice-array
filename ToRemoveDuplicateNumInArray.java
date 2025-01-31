package com.Qspider.array;

public class ToRemoveDuplicateNumInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 8, 3, 5, 4, 3, 2, 1, 4, 5, 7, 6 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = 12;
				}

			}
		}

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != 12) {
				System.out.print(arr[j] + ",");

			}

		}

	}
}
