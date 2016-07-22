//Reading data from a file
import java.io.*;
class ReadCharFile1 
{
	public static void main(String[] args) 
	{
		try
		{
			FileReader fr=new FileReader("file2.txt");
			String data="";
			int i=fr.read();//reads char and return integer
			while (i!=-1)
			{
				char ch=(char)i;//cast into equivalent char
				data=data+ch;
				i=fr.read();
			}
			System.out.println(data);
			fr.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
