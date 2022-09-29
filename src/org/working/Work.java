package org.working;

public class Work extends SingleInheritance {
	public void CollegeAddress () {
		System.out.println("chennai");
	}
	public static void main(String[] args) {
		Work p=new Work();
		p.CollegeName();
		p.StudentName();
		p.CollegeAddress();
	}
}
