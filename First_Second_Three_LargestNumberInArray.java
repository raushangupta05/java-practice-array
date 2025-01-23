package com.Qspider.array;

public class First_Second_Three_LargestNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 12, 13, 45, 58, 9, 54, 53 };
		int first = 0; // 45
		int second = 0; //13
		int third = 0;//12

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			}

			else if (arr[i] > second) {
				third = second;
				second = arr[i];

			} else if (arr[i] > third) {
				third = arr[i];

			}
		}

		System.out.println(first);
		System.out.println(second);
		System.out.println(third);

	}

}
