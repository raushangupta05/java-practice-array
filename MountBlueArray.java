package com.Qspider.array;

import java.util.Arrays;
import java.util.Scanner;

public class MountBlueArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of seat");
		int size = sc.nextInt();
		System.out.println("Enter the numbers");
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				if (arr[i] == 0 && arr[(i + 1)] == 0 && arr[(i + 2)] == 0) {
					arr[i] = 1;
					count++;
				}
			}

			else if (i == 1) {
				if (arr[i] == 0 && arr[(i + 1)] == 0 && arr[(i + 2)] == 0 && arr[(i - 1)] == 0) {
					arr[i] = 1;
					count++;
				}
			}

			else if (i >= 2 && i <= arr.length - 3) {
				if (arr[i] == 0 && arr[(i + 1)] == 0 && arr[(i + 2)] == 0 && arr[(i - 1)] == 0 && arr[(i - 2)] == 0) {
					arr[i] = 1;
					count++;
				}
			}

			else if (i == arr.length - 2) {
				if (arr[i] == 0 && arr[(i + 1)] == 0 && arr[(i - 1)] == 0 && arr[(i - 2)] == 0) {
					arr[i] = 1;
					count++;
				}

			}

			else if (i == arr.length - 1) {
				if (arr[i] == 0 && arr[(i - 1)] == 0 && arr[(i - 2)] == 0) {
					arr[i] = 1;
					count++;
				}

			}

		}

		System.out.println(Arrays.toString(arr));
		System.out.println(count);
		sc.close();

	}

}
