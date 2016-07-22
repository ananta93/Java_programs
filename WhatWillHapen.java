class Father 
{
	void marry() 
	{
		System.out.println("Arrange Marriage");
	}
}
class Son extends Father
{
	void marry() 
	{
		System.out.println("Love Marriage");
	}
}
class WhatWillHapen 
{
	public static void main(String[] args)
	{
		Father f1 = new Father();
		f1.marry();
		Son s = new Son();
		s.marry();
		Father f2 = new Son();
		f2.marry();
	}
}