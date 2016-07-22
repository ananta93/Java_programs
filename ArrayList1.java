import java.util.*;
class ArrayList1 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(1);
		System.out.println(al);
		al.add(2);
		System.out.println(al);
		for(int i=3; i<6;i++)
			al.add(i);
		System.out.println(al);
		al.add(null);
		System.out.println(al);
		al.add(5,"replaced");
		System.out.println(al);
		System.out.println("The value we got is : "+al.get(5));
		ArrayList al2=new ArrayList();
		al.remove("replaced");
		System.out.println(al);
		al.remove(4);
		System.out.println(al);
		al.add(22);
		System.out.println(al);
		Object o2=al.clone();
		System.out.println("This is a copy : "+o2);
		al2.addAll(al);
		System.out.println(al2);
		System.out.println(al);
	}
}
