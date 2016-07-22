//program to find the number of objects created out  of a class using static modifier
class NoOfObjects 
{
	static int count=0;
	NoOfObjects(){
		count++;
	}
	public static void main(String[] args) 
	{
		NoOfObjects ob1=new NoOfObjects();
		NoOfObjects ob2=new NoOfObjects();
		NoOfObjects ob3=new NoOfObjects();
		System.out.println("The number objects created is : "+ count);
	}
}
