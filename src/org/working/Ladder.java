
package org.working;

public class Ladder {
	
	public static void main(String[] args) {
		int age=24;
		if (age<18) {
			System.out.println("1st condition is true");
		}else if (age==10) {
			System.out.println("2nd condition is true");
		} else if (age<20) {
			System.out.println("3rd condition is true");
		}else {
			System.out.println("all conditions are false");
		}
	}

}
