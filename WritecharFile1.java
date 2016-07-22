//writing data into a file
import java.io.*;
class WritecharFile1 
{
	public static void main(String[] args) 
	{
		try
		{
			String data="Hello";
			FileWriter fw=new FileWriter("file2.txt",true);
			char ch[]=data.toCharArray();
			fw.write(ch);
			fw.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
