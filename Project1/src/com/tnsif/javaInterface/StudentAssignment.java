package com.tnsif.javaInterface;

public class StudentAssignment {
	
	public String StudentResult(){
		return "Student obj is created";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAssignment obj = new StudentAssignment();
		String result = obj.StudentResult();
		System.out.println(":-"+result);

	}
}
