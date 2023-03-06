/**
 * 
 */
package com.corejava.staticdemo;


/**
 * @author Manikanta
 *
 */
public class StaticKeywordInfo extends Parent{

	/**
	 * 
	 * Static block
	 * static inner class
	 * static variables
	 * static methods
	 * 
	 * => The static blocks can be used for initializing static variables or calling any static method in java.
	 * => Static keyword can be applied at variables, methods and nested class
	 * => Static variables are class level variables
	 * => A variable is made static it is common for all the objects
	 * => Static variable in java is variable belongs to class not to the object(Instance)
	 *  and initialized only When the start of the execution
	 *
	 * => We can overload static methods 
	 */
	
	//Static block
	static {
		System.out.println("Executed Static block");
	}

	//static variables
	private static String s1 = "Private Static Variable";
	static String s2 = "Static Variable";
	public static String s3 = "Public static variable";

	//Nested static class
	static class NestedClass {

		NestedClass() {
			System.out.println("Nssted Static Class constructor()");
		}
		private static String s4 = "Private Static Variable from static class";
		static String s5 = "Static Variable  from static class";
		public static String s6 = "Public static variable  from static class";
		static void show() {
			System.out.println(s4);
			System.out.println(s5);
			System.out.println(s6);
			System.out.println("Static class and Static method");
		}

		void show1() {
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println("Static class and non-static method");
		}
	}

	
	// We can overload static methods
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		StaticKeywordInfo mainObj = new StaticKeywordInfo();
		StaticKeywordInfo.NestedClass object = new StaticKeywordInfo.NestedClass();
		object.show1();
		
		mainObj.add(10, 20);
		
		mainObj.add(10, 20, 30);
		
	}
	
	// we cant override parent class static methods. for testing un coment @Override annotation 
//	@Override
	static void subtract(int a, int b) {
		System.out.println(a -b);
	}

}
