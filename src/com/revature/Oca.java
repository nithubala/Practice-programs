package com.revature;

import java.time.LocalDate;
import java.time.Period;

public class Oca {

	
	public static void main(String names) {

	LocalDate date=LocalDate.of(2015,3,26);
	Period p=Period.ofDays(1);
	System.out.println(date.plus(p));}

}
