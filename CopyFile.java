import java.io.*;
class CopyFile 
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fis=new FileInputStream("first.txt", "UTF-8");
		}
		catch (Exception e)
		{
		}
		System.out.println("Hello World!");
	}
}
