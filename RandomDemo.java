import java.io.*;
class RandomDemo 
{
	int x;
	String str;
	float a;
	public static void main(String[] args) 
	{
		try
		{
			RandomDemo rd=new RandomDemo();
			RandomAccessFile raf=new  RandomAccessFile("rfile","rw");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the value for x : ");
			rd.x=Integer.parseInt(br.readLine().trim());
			System.out.println("Enter a String : ");
			rd.str=br.readLine().trim();
			System.out.println("Enter the value for a : ");
			rd.a=Float.parseFloat(br.readLine().trim());
			raf.writeInt(rd.x);
			raf.writeUTF(rd.str);
			raf.writeFloat(rd.a);
			raf.close();
			RandomAccessFile raf1=new  RandomAccessFile("rfile","r");
			raf1.seek(0);
			long size=raf1.length();
			while (raf1.getFilePointer()<size)
			{
				int i=raf1.readInt();
				String s=raf1.readUTF();
				float f=raf1.readFloat();
				System.out.println("i= "+i+"s="+s+"f="+f);
			}
			raf1.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
			
	}
}
