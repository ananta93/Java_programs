class TypeCast 
{
	public static void main(String[] args) 
	{
		int i=6;
		float j=7;
		System.out.println(j);//j=7.0
		//float k=7.0;
		//system.out.println(k);
		float k=(float)7.0;
		long l=8;
		System.out.println(l);
		int x=97;
		//int x=l;//error
		byte b=97;
		//b=x;
		b=(byte)x;
		float c=7.8f;
		char ch=(char)b;
		System.out.println(ch);
		char ch1='A';
		System.out.println(ch1);
		int y=(int)ch1;
		System.out.println(y);
	}
}
