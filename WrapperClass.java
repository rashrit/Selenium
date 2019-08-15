package com.ce.sel;

public class WrapperClass {

	public static void main(String[] args) {
		
		//before wrapper class
		String x = "100";
		System.out.println(x+20);
		
		//after parsing or using wrapper class to convert string value to Interger
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer, Double, Boolean
		String k = "10.22";
		double d = Double.parseDouble(k);
		System.out.println(d);
		
		String l = " ";
		boolean b = Boolean.parseBoolean(l);
		System.out.println(b);
		
		//convert int to String
		int j = 200;
		String s = String.valueOf(j);
		System.out.println(s+20);
		

	}

}
