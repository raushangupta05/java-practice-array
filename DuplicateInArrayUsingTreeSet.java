package com.Qspider.array;

import java.util.TreeSet;

public class DuplicateInArrayUsingTreeSet {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 5, 6, 6, 5, 4, 3, 2 };

		TreeSet<Integer> num = new TreeSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (num.contains(arr[i])) {
				System.out.println("dupliacte is " + arr[i]);
			} else {
				num.add(arr[i]);
			}

		}

	}

}
