/**
 * 
 */
package com.corejava.qa;

/**
 * @author Manikanta
 *
 */
public class StaticKeywordInfo {

	/**
	 * Static block
	 * static inner class
	 * static variables
	 * static methods
	 */
	static {
		System.out.println("Executed Static block");
	}

	private static String s1 = "Private Static Variable";
	static String s2 = "Static Variable";
	public static String s3 = "Public static variable";

	static class NestedClass {

		NestedClass() {
			System.out.println("Nssted Static Class constructor()");
		}
		private static String s1 = "Private Static Variable from static class";
		static String s2 = "Static Variable  from static class";
		public static String s3 = "Public static variable  from static class";
		static void show() {
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println("Static class and Static method");
		}

		void show1() {
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println("Static class and non-static method");
		}
	}


	public static void main(String[] args) {
		StaticKeywordInfo mainObj = new StaticKeywordInfo();
		StaticKeywordInfo.NestedClass object = new StaticKeywordInfo.NestedClass();
		object.show1();
	}

}
