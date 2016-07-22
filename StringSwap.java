//Write a program in Java to take first name and last name from user and print both in one line as last name followed by first name.
import java.util.*;
class StringSwap
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name");
		String fname=sc.next();
		System.out.println("Enter the last name");
		String sname=sc.next();
		System.out.println("Your full name is "+sname+" "+fname);
	}
}
