class Prime 
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);
		int count=0;
		for (int i=1;i<=num;i++)
		{
			if (num%i==0)
			count++;
		}
		if(count==2)
			System.out.println("The number is prime");
		else 
			System.out.println("The number is not prime");
	}
}
