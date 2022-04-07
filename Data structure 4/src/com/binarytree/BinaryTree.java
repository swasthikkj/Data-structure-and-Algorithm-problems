package com.binarytree;

import java.math.BigInteger;

import java.util.Scanner;

public class BinaryTree {
	Scanner scan = new Scanner(System.in);
	public int[] testCases(int input) {
		int[] testCase = new int[input];
		for(int i = 0; i < input; i++) {
			System.out.println("Enter " + (i+1) + " case :");
			int nodeNos = scan.nextInt();
			testCase[i] = nodeNos;
		}

		return testCase;
	}

	public void totalTrees(int[] testCases) {
		System.out.println("no of trees in each case :");
		for(int nodes: testCases) {
			int trees = factorial(2*nodes)/(factorial(nodes+1)*factorial(nodes));
			System.out.println(trees);
		}
	}

	public int factorial(int n){
		if (n == 0)
			return 1;
		return n*factorial(n-1);
	}

	public static void main(String[] args) {
		BinaryTree trees = new BinaryTree();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of test cases :");
		int input = scan.nextInt();
		int[] testCases = trees.testCases(input);
		trees.totalTrees(testCases);
	}
}