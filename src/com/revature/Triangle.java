package com.revature;

public class Triangle {
	
	
	 public int base;
	    public int height;
	    public double area = 0;
	    
	    public Triangle(int pBase, int pHeight){
	        this.base = pBase; this.height = pHeight;
	       updateArea();
	        
	    }
	    public void updateArea(){
	        double a = base*height/2;
	        System.out.println("result:"+a);
	    }
	public static void main(String[] args) {
		new Triangle(2, 4);
		
		
	}
}


