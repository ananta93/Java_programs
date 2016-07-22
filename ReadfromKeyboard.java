import java.io.*;
class ReadfromKeyboard 
{
	public static void main(String[] args) 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the data : ");
		try
		{
			String s1=br.readLine();
			System.out.println(s1);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
