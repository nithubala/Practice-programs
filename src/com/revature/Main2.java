package com.revature;

public class Main2 {
	 void method() {
		    try {
		      myMethod();
		      return;
		    } finally {
		      System.out.println("finally 1");
		    }
		  }

		  void myMethod() {
		    System.out.println("myMethod");
		    throw new StackOverflowError();
		  }

		  public static void main(String args[]) {
		    Main2 var = new Main2();
		    var.method();
		  }
		}



