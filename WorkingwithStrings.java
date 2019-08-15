package com.ce.sel;

public class WorkingwithStrings {

	public static void main(String[] args) {
		
		/*String is a Class in which object instance can be created with using new keyword
		or wihout using new keyword*/
		//Examples--
		
		String s1 = new String("Hello");
		String s2 = "Hello";
		
		/* though s1 and s2 contains same text, if we compare s1 with s2 returns false
		   because these are 2 different instances of object reference */
		System.out.println("with New and Direct assignment " + (s1==s2));
		
		String s3 = new String("Hello");
		String s4 = "Hello";
		
		/* s2 and s4 contains same text, if we compare s2 with s2 returns true
		   because when not used new keyword, new object instance will not be created
		   if ASCII value of both Strings Match */
		System.out.println("with Direct assignment and ASCII value match " + (s2==s4));
		System.out.println("with Direct assignment and ASCII value match " + s2.equals(s4));
		
		/* Whereas s1 and s3 remains as 2 different object ref as both are created using
		 new keywords, though have same ASCII value strings */
		System.out.println("with both using New keyword " +(s1==s3));
		System.out.println("with Direct assignment and ASCII value match " + s1.equals(s2));
	}

}
