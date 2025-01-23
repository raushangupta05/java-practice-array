package com.Qspider.array;

public class IfSumIslessThenTargetThenheckForNextAndSumIt {
//	public class IndexvalueIfSumIsGiven {

	public static void main(String[] args) {

		int arr[] = { 8, 6, 4, 7, 9 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] < 18) {
					if ((j + 1) < arr.length && arr[i] + arr[j] + arr[j + 1] == 18) {
						System.out.println(i + " " + j + " " + (j + 1));

					}

				}

			}
		}
	}

}
