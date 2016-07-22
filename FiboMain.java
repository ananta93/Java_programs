//fibonacci series of certain range
class Fibo
{
	void set()
	{
		int a,b,c=0;
		a=0;
		b=1;
		System.out.println(a);
		System.out.println(b);
		while(c<=100)
		{
			c=a+b;
			if(c<100)
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
class FiboMain 
{
	public static void main(String[] args) 
	{
		Fibo ob=new Fibo();
		ob.set();
	}
}
