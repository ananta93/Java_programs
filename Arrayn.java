//wap input n number of elements in an array then add all the numbers
import java.util.*;
class Arrayn 
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Eneter the size of the array : ");
		int n=ob.nextInt();
		int a[]=new int[n];
		int sum=0;
		for (int i=0;i<a.length ;i++ )
		{
			a[i]=ob.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum : "+sum);
	}
}
