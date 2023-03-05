package com.corejava.qa;

public class CorJavaInterviewQA {

	/**
	 * 1) What is JIT
	 * 
	 * 		Jit is abbrivation for Just in Time compiler. It increases the efficiency 
	 * of the interpreter by compiling the byte code in the run time.JIT Compiles code
	 * to Machine level dirctly for Higher speeds of code execution.
	 * 
	 * 
	 * 2) What is class loader?
	 * 
	 * 		A class loader in java is a subsytem of JVM to load the class file when program is executed.
	 * ClassLoader is the first one to  oad executable file.
	 * 
	 * 	Java has Three types of class loaders
	 *  -> Bootstrap 
	 *  -> Extension 
	 *  -> APplication ClassLoaders.
	 *  
	 * 3) What are the memory allocations available in java?
	 * 
	 * 		Class Memory
	 * 		Heap Memory
	 * 		Stack Memory
	 * 		Program Counter Memory
	 * 		Native Method Stack Memory
	 * 4) Will the program run If i write static public void main?
	 * 
	 * 	Yes, The program compile successfully Because JAva does not maintains order of specifiers.
	 * 
	 * 5) WHat is default value stored in Local Variables?
	 * 
	 * 	Neither the local v araibles nor any primitives and Object reference have any default values stored in them.
	 * 
	 * 6) Explain about final keyword?
	 * 
	 * 		"final" is a keyword in java to make a variable or method or class as a final.
	 * we have use final that can't be modified.
	 * 
	 * 7) Explain about static keyword
	 *  	"static" is a keyword in java to make variable or method or class as static.
	 *  once we declared static the value will not be change.
	 *  
	 *  	
	 *  
	 *  
	 * 
	 */
	
	CorJavaInterviewQA() {
		System.out.println("Constructor called");
	}
	
	public static void main(String[] args) {
		System.out.println(100+100+"100");
		System.out.println("100"+100+100);
	}
}
