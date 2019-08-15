package com.ce.sel;
import java.util.*;
public class Test {
	public static void main(String[] args){
		System.out.println ("Hello");
		//int [] array = {1,2,3,4,5,6,8,7,10};
		int [] array = new int[10];
		
		
		System.out.println("Enter Array Elements");
		Scanner sc = new Scanner(System.in);
		
		for (int k=1; k<=10; k++)
			sc.nextInt();
		
		Arrays.sort(array);
		
		if(array[0] != 1)
		{System.out.println("Missing element is 1");}
		
		for (int i=1; i<array.length-1;i++){
			int nextElement = array[i]+1;
		if(array[i+1] != nextElement){
		System.out.println("Missing Element is "+nextElement);
		break;}
			
		}
		B obj = new B();
		obj.read();
		obj.jump();
		
	}
}

class A{
	void show(){System.out.println ("Show");}
	
	void read(){System.out.println ("read");}
	void jump() {System.out.println ("jump Parent");}
}

class B extends A{
	//super;
	void jump(){System.out.println ("jump Child");}
}
