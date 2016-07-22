import java.util.*;
import java.io.*;
class ScannerTest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the student");
		String name=sc.next();
		System.out.println("Enter the Roll number of the student");
		int roll=sc.nextInt();
		System.out.println("Enter the gender of the student");
		char gen=sc.next().charAt(0);
		System.out.println("Enter the branch of the student");
		String branch=sc.next();
		System.out.println("Welcome "+name.toUpperCase()+" your Roll number is "+roll+" your gender is '"+gen+"' Your Branch is "+branch);
	}
}