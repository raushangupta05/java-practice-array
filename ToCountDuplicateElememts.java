package com.Qspider.array;

public class ToCountDuplicateElememts {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 2, 3, 2, 4, 5, 3 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;

				}

			}

		}
		// if want to count unique then
		int unique = arr.length - 1 - count;

		System.out.println(count);
		System.out.println("unique count is " + unique);

	}

}
