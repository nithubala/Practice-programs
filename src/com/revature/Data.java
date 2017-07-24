package com.revature;

public class Data {
	short one =1;
 
	 static String seq="c";
	 static{seq +="k";}
	 {seq+="n";}
	 public static void main(String[] args) {
		Data d1=new Data();
		Data d2=new Data();
		System.out.println(d1.seq);
		
	}
	 

	

}
