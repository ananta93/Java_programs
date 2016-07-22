import java.io.*;
class A implements Serializable
{
	int i,j;
	public void funA()
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println("Inside FunA()");
	}
}
class WriteObj 
{
	public static void main(String[] args)throws Exception 
	{
		FileOutputStream fos=new FileOutputStream("file1.obj",true);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		A a1=new A();
		a1.i=437;
		a1.j=440;
		oos.writeObject(a1);
		a1.i=18;
		a1.j=22;
		a1.funA();
		Integer in=new Integer(9);
		String s="Hello";
		oos.writeObject(in);
		oos.writeObject(s);
		oos.close();
	}
}
