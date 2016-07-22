/*
Define an interface Motor with a data member –capacity and two methods such as run() and consume(). 
Define a Java class ‘Washing machine’ which implements this interface and write the code to check the value of the interface data member thru an object of the class
*/
interface Motor
{
	public static final int capacity=0;;
	public abstract void run();
	public abstract void consume();
}
class Washing_Machine implements Motor 
{
	public void run(){
		System.out.println("Check you");
	}
	public abstract void consume();
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
