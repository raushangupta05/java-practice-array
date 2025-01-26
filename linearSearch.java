package com.Qspider.array;

public class linearSearch {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int no = 7;
		for (int i : arr) {
			if (i == no) {
				System.out.println("linear search");
			}
		}
	}
}
