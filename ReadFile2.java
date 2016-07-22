import java.io.*;
class ReadFile2 
{
	public static void main(String[] args) 
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the file name of the file : ");
			String fname=br.readLine().trim();
			FileInputStream fis=new FileInputStream(fname);
			int size=fis.available();
			byte ba[]=new byte[size];
			fis.read(ba);
			String fdata=new String(ba);
			System.out.println(fdata);
			fis.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
