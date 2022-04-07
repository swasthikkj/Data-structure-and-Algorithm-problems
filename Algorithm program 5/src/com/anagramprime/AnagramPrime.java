package com.anagramprime;

import java.util.ArrayList;

import java.util.Arrays;

public class AnagramPrime {
	private int key;
	private int[] primeArray;
	private ArrayList<Integer> anagram = new ArrayList();
	static final int a = 10;

	public AnagramPrime(int key) {
		this.key = key;
		this.primeArray = new int [key];
		primeNo();
	}

	private void primeNo() {
		for(int i = 2; i < (int)key; i++) {
			int count = 0;
			for(int j = 2; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}

				if (count == 2) {
					break;
				}
			}

			if(count == 1) {
				primeArray[i] = i;
			}
		}
	}

	public void anagramNo() {
		for(int prime: primeArray) {
			if(prime == 0) {
				continue;
			}

			int check = 0;
			for(int prime1: primeArray) {
				if(prime1 == 0) {
					continue;
				}

				if(prime != prime1) {
					if (checkAnagram(prime, prime1)) {
						anagram.add(prime);
						check++;
					}
				}

				if (check == 1) {
					break;
				}
			}
		}
	}

	private boolean checkAnagram(int a, int b) {
		int[] a1 = frequency(a);
		int[] b1 = frequency(b);
		if(Arrays.equals(a1, b1)) {
			return true;
		}
		return false;
	}

	private int[] frequency(int number) {
		int[] digits = new int[10];
		while (number > 0) {
			int digit = number % a;
			number = number / a;
			digits[digit]++;
		}
		return digits;
	}

	public void showPrimeAnagram() {
		for(int number: anagram) {
			System.out.print(number + " ");
		}
	}
}
