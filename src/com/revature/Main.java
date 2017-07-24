package com.revature;

public class Main {
	 private String color; 
       public Main() { 
         this.color=("white"); 
       } 
       public Main(String b) { 
         this.color="yellow"; 
       } 
       void test(String a)
       {
    	 this.color="red";  
       }
       public static void main(String[] args) { 
    	   String colo="black";
    	   String A="null";
    	   
        Main e = new Main(colo); 
        
        e.test(A);
       System.out.println("Color:" + e.color); 
       } 
     } 
      
