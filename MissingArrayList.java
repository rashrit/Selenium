package com.ce.sel;
import java.util.Arrays;

public class MissingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr1 = {1,12,8,7,11};
		Arrays.sort(arr1);
		int k = arr1[arr1.length-1];
		//System.out.println(k);
		int i = 0;
		for(int j=1;j<k;j++)
		{
			if(arr1[i] != j)
			{
				System.out.println("Missing Element is " + j);
			}else
			{
				i++;
			}	
			
		}
		
		}

} 
