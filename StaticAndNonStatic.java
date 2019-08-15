package com.ce.sel;

public class StaticAndNonStatic {
	
	String name = "Tom"; //Non Static var
	static int age = 2; //static var

	public static void main(String[] args) {
		
	//to call static methods and vars
		//1. Direct Calling
		staticMethod();
		System.out.println(age);
		//2. Calling by classname
		StaticAndNonStatic.staticMethod();
		System.out.println(StaticAndNonStatic.age);
		
		
		//to call Non static methods and vars
		//1. Create an object reference and then call by Object
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.nonstaticMethod();
		System.out.println(obj.name);
		//Can we access Static method by Object ref? Yes, but not a good practice
		obj.staticMethod();
		System.out.println(obj.age);
	}
	
	public void nonstaticMethod() {
		System.out.println("Non Static Method");
	}
	
	public static void staticMethod() {
		System.out.println("Static Method");
	}

}
