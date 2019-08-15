package com.ce.sel;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int n;
		//int fact = 1;
		System.out.println("Enter the Nth Element");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int k = Fact(n);
		System.out.println(k);

	}
	
	public static int Fact(int a) {
		
		int fact = 1;
		for (int i=1; i<a; i++) {
			
			fact = fact*(i+1);
		}
		return fact;
	}
	
}


