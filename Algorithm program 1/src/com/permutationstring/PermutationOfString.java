package com.permutationstring;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class PermutationOfString {
	public static void findPermutations(String str) {
		if (str == null || str.length() == 0) {
			return;
		}

		List<String> partial = new ArrayList<>();
		partial.add(String.valueOf(str.charAt(0)));    
		for (int i = 1; i < str.length(); i++) {
			for (int j = partial.size() - 1; j >= 0 ; j--) {
				String s = partial.remove(j);
				for (int k = 0; k <= s.length(); k++) {
					partial.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
				}
			}
		}

		System.out.println(partial);
	}

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		findPermutations(str);
	}
}
