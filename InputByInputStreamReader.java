//Input By Input StreamReader
import java.io.*;
class InputByInputStreamReader 
{
	public static void main(String[] args) throws IOException 
	{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter the name of the student : ");
		String name=br.readLine();
		System.out.println("Enter the Roll_No. of the Student : ");
		int roll=Integer.parseInt(br.readLine());
		System.out.println("Enter the gender of the Student : ");
		char gen=(char)br.read();
		System.out.println("Enter the Branch of the student : ");
		br.skip(2);
		String branch=br.readLine();
		System.out.println("Enter the address of the student : ");
		String addr=br.readLine();
		System.out.println("Welcome "+name+", Your Roll_No. is "+roll+", Your gender is '"+gen+"' , your branch is "+branch+" and your address is "+addr);
	}
}
