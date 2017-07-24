package com.revature;

import java.nio.charset.MalformedInputException;

public class Check {
	public void findAnswer(boolean check) {
		 int answer;
		 int onlyOneBranch = 0;
		 if (check) {
		 onlyOneBranch = 1;
		 answer = 1;
		 } else {
		 answer = 2;
		 }


		 System.out.println(answer);
		 System.out.println(onlyOneBranch);
}
}
