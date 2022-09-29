package org.working;

public class Nested {
public static void main(String[] args) {
	int age=17;
	String citizen="indian";
	//outer if
	if (citizen=="indian") {
	//inner if
		if (age>=18) {
			System.out.println("eligible for voting");
		}else {
			System.out.println("canditate is indian but less than 18yrs age");
		}  
		
	}else {
			System.out.println("canditate is not an indian");
		
		
	}
}
}
