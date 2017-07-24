package com.revature;

public class Main4 {
	 void foo() {
		    try {
		      //String s ="red";
		    	String s=null;
		      System.out.println("1");
		      try {
		        System.out.println(s.length());
		      } catch (NullPointerException e) {
		        System.out.println("inner");
		      }
		      System.out.println("2");
		    } catch (NullPointerException e) {
		      System.out.println("outer");
		    }
		  }

		  public static void main(String args[]) {
		    Main4 obj = new Main4();
		    obj.foo();
		  }
		}


