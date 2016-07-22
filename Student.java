/* 3.	Write an inner class named ‘result’ within a class ‘student’ with following members –
Student – rollno, name
	getDetails(){ create an object of result class to get the marks of the student}
		result – PTT, DBMS, OS, Maths
	Write the complete program to find SGPA of the student for the user entered marks.
*/

import java.util.*;
class Student {
	int roll;
	String name;
	void getDetails(){
		SResult s=new SResult();
		s.display();
	}
	class SResult {
		void display(){
			System.out.println("hello");
		}
	}
}
class StudentMarks {
	public static void main(String[] args){
		Student s=new Student();
		s.getDetails();
	}
}