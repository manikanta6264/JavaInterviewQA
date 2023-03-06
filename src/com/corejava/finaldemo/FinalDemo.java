package com.corejava.finaldemo;

/*
 * A fInal is a keywerd to make a variable, method or class as a final
 * 
 * => Once we declared variable with final value can't be changed
 * => Once we declared method with final that method we can't override
 *    but we can overload method
 * => Once we declared class with final that class never be participated in inheritence
 * 
 */
//public class FinalDemo extends Parent {

public class FinalDemo extends Parent{

	final String s1 = "Java";

	final String s2;

	//Initialization block
	{
		s2 = "Test";
	}
	
	// static block

	// We can overload final methods
	final void add(int a, int b) {
		System.out.println(a + b);
	}

	final void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		FinalDemo demo = new FinalDemo();
		/*
		 * We can't reassign final variable agian once initialized
		 * 
		 * for testing un comment below line
		 */
//		demo.s1 = "Java TEst";

		System.out.println(demo.s2);
		demo.add(10, 20);
		demo.add(10, 10, 30);
	}
	
	// We can't override final mehods
//	@Override
//	final void multiply(int a, int b) {
//		System.out.println(a+b);
//	}
}
