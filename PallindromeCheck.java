//Program to check a number is palindrome or not
import java.util.Scanner;
class PallindromeCheck 
{
	public static void main(String[] args) 
	{
		int temp,rem,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		temp=num;
		while(num>0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==temp)
			System.out.println("The number is pallindrome ");
		else
			System.out.println("The number is not pallindrome ");
	}
}
