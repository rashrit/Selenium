package com.ce.sel;

public class ArraysClass {

	public static void main(String[] args) {
		 // One dimensional Array
		int arr[] = new int[5];
		for (int i=0;i<arr.length;i++) {
			arr[i] = i*2;
			System.out.println(arr[i]);
		}
		
		 // Two dimensional Array
		int arr2[][] = new int[4][4];
		for (int i=0;i<arr2.length;i++) {
			for (int j=0;j<arr2[0].length;j++)
			arr2[i][j] = i*2;
			//System.out.println(arr2.length);
			}
		for (int k=0;k<arr2.length;k++) {
			for (int l=0; l<arr2[0].length;l++) {
				System.out.print(arr2[k][l]);
		}
			
		System.out.println();
		}
		
		 // Object  Array
		Object arr3[]= new Object[5];
		arr3[0] = "Tom";
		arr3[1] = 35;
		arr3[2] = 12.5;
		arr3[3] = 'C';
		arr3[4] = true;
				
		for (int k=0;k<arr3.length;k++) {
				System.out.print(arr3[k]+"~~~");
		}
	}

}
