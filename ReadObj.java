//deserialization
import java.io.*;
class ReadObj 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis=new FileInputStream("file1.obj");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		A a1=(A)o;
		a1.funA();
		Integer in=(Integer)ois.readObject();
		int i=in.intValue();
		System.out.println(i);
		String s=(String)ois.readObject();
		System.out.println(s);
		ois.close();
	}
}
