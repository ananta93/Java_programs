import java.io.*;
class Readkeyboarddata 
{
	public static void main(String[] args) 
	{
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter the data : ");
		try
		{
			String s1=dis.readLine();
			System.out.println(s1);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
