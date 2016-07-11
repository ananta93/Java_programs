import java.util.Scanner;
class BinaryEquiv 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int rem=0,i=0,rev=0,d=0;
		int a[]=new int[100];
		System.out.print("The binary equivalent of the number is : ");
		while (num!=0)
		{
			rem=num%2;
			num=num/2;
			System.out.print(rem);
		}
	}
}
