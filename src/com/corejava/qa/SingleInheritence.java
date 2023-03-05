package com.corejava.qa;

/**
 * 
 * @author Manikanta
 *
 */
public class SingleInheritence {

	public static void main(String[] args) {
		
		/** We can access both methods and varaibles from parent and child through
		 * child class object
		 */
		
		Child ch = new Child();
		ch.m1();
		ch.m2();
		
		/** We can access only parent class methods and variables through parent class
		 * object
		 */
		Parent p = new Parent();
		p.m1();
		
		/**
		 * We can access only parent class methods through Parent class object with child reference
		 */
		Parent p1 = new Child();
		p1.m1();
		
	}
}
