class ExceptionDemo 
{
	void fun1()throws Exception
	{
		try
		{
		int x=10/0;
		}
		catch(Exception ex)
		{
			System.out.println("Error message is "+ex.getMessage());
			ex.printStackTrace();
			System.out.println("Error message is "+ex.toString());
		}
	}
	public static void main(String[] args)throws Exception 
	{
		System.out.println("Hello World!");
        ExceptionDemo oe=new ExceptionDemo();
        oe.fun1();
	}
}
