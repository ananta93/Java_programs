abstract class Abs
{
	public abstract void A();
	public void B()
	{
		System.out.println("Inside B() ");
	}
}
class Absdemo extends Abs 
{
	public void A()
	{
		System.out.println("Inside A()");
	}
	public static void main(String[] args) 
	{
		Abs ob=new Absdemo();
		ob.A();
		ob.B();
		System.out.println("Inside main");
	}
}
