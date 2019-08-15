package com.ce.sel;

import java.util.ArrayList;

public class CollectionSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList l1 = new ArrayList(5);
		l1.add('A');
		ArrayList l2 = new ArrayList(4);
		l2.add('E');
		l2.add('I');
		l2.add('O');
		l2.add('U');
		l1.addAll(l2);
		
		for (int i=0;i<5;i++) {
			System.out.print(l1.get(i));
			
		}

	}

}
