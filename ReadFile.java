//Reading data from a file using a byte oriented class
import java.io.*;
class ReadFile 
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fis=new FileInputStream("file1.txt");
			int size=fis.available();
			byte ba[]=new byte[size];
			fis.read(ba);
			String data=new String(ba);
			System.out.println(data);
			fis.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
