package com.revature;

public class Mock {
	 public static void main(String[] args) { 
         Shape rectangle = new Rectangle(5);  // A
         System.out.println(","+rectangle.hasEdges()); // B
        
         
       } 
  }
  
  class Shape { 
       public Shape() { 
         System.out.print("Shape"); 
       } 
       public Shape(int edge) { 
         System.out.print("ShapeEdge"); 
       } 
       boolean hasEdges() { 
         return false; 
       } 
  } 
  class Rectangle extends Shape { 
    public Rectangle(int age) { 
    	
      System.out.print("Rectangle"); 
    } 
    public boolean hasEdges() { // C
      return true; 
      
      
    }
/*private int myValue = 0;
    
    public void showOne(int myValue){
        myValue = myValue;
    }
    
    public void showTwo(int myValue){
        this.myValue = myValue;
    }    
    public static void main(String[] args) {
        Mock ct = new Mock();
        ct.showOne(100);
        System.out.println(ct.myValue);
        ct.showTwo(200);
        System.out.println(ct.myValue);
    }*/
    
	}

	
	
	
	