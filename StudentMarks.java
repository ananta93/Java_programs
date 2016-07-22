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
	float ptt,dbms,os,maths,sgpa;
	Scanner sc=new Scanner(System.in);
	void getDetails(){
		SResult s=new SResult();
		s.display();
	}
	class SResult {
		void display(){
			System.out.println("Enter the roll number of the student : ");
			roll=sc.nextInt();
			System.out.println("Enter the name of the student : ");
			name=sc.next();
			System.out.println("Enter the mark in PTT : ");
			ptt=sc.nextFloat();
			System.out.println("Enter the mark in dbms : ");
			dbms=sc.nextFloat();
			System.out.println("Enter the mark in OS : ");
			os=sc.nextFloat();
			System.out.println("Enter the mark in maths : ");
			maths=sc.nextFloat();
			sgpa=(ptt+dbms+os+maths)/(4*10);
			System.out.println("Hi "+name+" your roll number is "+roll+" and your sgpa of the student is "+sgpa);
		}
	}
}
class StudentMarks {
	public static void main(String[] args){
		Student s=new Student();
		s.getDetails();
	}
}