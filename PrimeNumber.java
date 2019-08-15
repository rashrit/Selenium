package com.ce.sel;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int range = n;
		//Prime(n);
		int arr[] = new int[1000];
		boolean list;
		
		// Code to return first 100 Prime Numbers
		for (int p=0, k=1; k<100000;k++) {
			list = PrimeCheck(k);
			if (list) {
				arr[p] = k;
				p++;
				n--;
			}
			if (n==0)
				k=100000;
		}
		
		for (int j=0; j<range; j++) {
			System.out.println("Prime Number Series " + "element " + (j+1) +" - " +arr[j]);
		}

	}
	
	public static void Prime(int a) {
		boolean flag = true;
		
		for (int i=2; i<a; i++) {
			if (a%i == 0)
				flag = false;
			
		}	
			if (flag)
				System.out.println("Given number " +a+" is Prime Number");
			else
				System.out.println("Given number " +a+" is NOT a Prime Number");
		
	}
	
	public static boolean PrimeCheck(int b) {
		boolean flag1 = true;
		
		for (int i=2; i<b; i++) {
			if (b%i == 0)
				flag1 = false;
			
		}	
			return flag1;
		
	}
	

}
