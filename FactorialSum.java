import java.util.*;
class FactorialSum
{
	public static void main(String[] args) 
	{
		int n;
		int sum=0;
		int fact=1;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for (int i=1;i<=n ;i++ )
		{
			fact=n*(n-1);
			n=n-1;
			sum=sum+fact;
		}
		System.out.println(sum);
	}
}
