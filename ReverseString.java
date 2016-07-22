//reverse a string
import java.util.*;
class ReverseString
{
	public static void main(String args[])
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		//StringBuffer s=sc.next();
		int l=s.length();
		System.out.println("the reversed string is ");
		for (int i=l-1;i>=0 ;i-- )
		{
			System.out.print(s.charAt(i));
		}
		//System.out.println("The reversed string is "+s.reverse());
	}
}