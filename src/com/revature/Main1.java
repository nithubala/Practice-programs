package com.revature;

public class Main1 {
	public static void main(String[] args) {
	    Base base = new Base();
	    Base derived = new Derived();

	    System.out.println(base.var);
	    System.out.println(derived.var);
	    base.printVar();
	    derived.printVar();
	  }
	}


