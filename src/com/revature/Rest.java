package com.revature;

public class Rest {
	    static Rest ref;  
	    String[] arguments;   
	    public static void main(String args[])
	    {       ref = new Rest();      
	    ref.func(args);    }   
	    public void func(String[] args){       ref.arguments = args;    } }
