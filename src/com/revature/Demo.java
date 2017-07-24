package com.revature;

public class Demo {
	private String name = "Fluffy";
	 { System.out.println("setting field"); }
	 public Demo() {
	 name = "Tiny";
	 System.out.println("setting constructor");
	 }
	 public static void main(String[] args) {
	  Demo d= new Demo();
	 System.out.println(d.name); } 


}

