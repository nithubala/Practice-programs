package com.revature;

public class Throw {
	  static int someInt=10;
	  public static void changeIt(int i){
	   // someInt = 20;
		  System.out.println(i);
	  }
	  public static void main(String[] args){
	    Throw n = new Throw();
	    n.changeIt(20);
	    System.out.println(someInt);
	    
	  }
	}

