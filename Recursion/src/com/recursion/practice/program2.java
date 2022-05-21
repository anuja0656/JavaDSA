package com.recursion.practice;

import java.util.Scanner;

public class program2 {
	
	static int naturalNumber(int n) {
		if(n==1) return 1;
		int partialAns=naturalNumber(n-1);
		return n+partialAns;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("Error");
		}
		else {
			System.out.println(naturalNumber(n));
		}
	}
}
