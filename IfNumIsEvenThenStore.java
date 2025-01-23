package com.Qspider.array;

public class IfNumIsEvenThenStore {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 58, 13, 9 };
		int abb[] = { 45, 46, 96, 69 };
		int even[] = new int[arr.length + abb.length];

		int pos = 0;

		for (int i : arr) {
			if (i % 2 == 0) {
				even[pos] = i;
				pos++;
			}
		}

		for (int i : abb) {
			if (i % 2 == 0) {
				even[pos] = i;
				pos++;
			}

		}
		for (int i : even) {
			System.out.print(i + ",");
		}

	}
}
