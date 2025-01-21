package com.Qspider.array;

public class FindMaximumLengthWordInString {

	public static void main(String[] args) {

		String st = "Hello i am Raushan";
		int len = 0;
		String maxWord = "";

		String[] str = st.split(" ");

		for (int i = 0; i < str.length; i++) {
			if (str[i].length() > len) {
				len = str[i].length();
				maxWord = str[i];
			}

		}
		System.out.println(len);
		System.out.println(maxWord);

	}

}
