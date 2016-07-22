//input two strings then merge into one then sort the string 
//ex: if "ace" and "bdf" are two strings then output should be "abcdef"

import java.util.Scanner;

class MergeSortString {
	public static void main(String[] args) {
		
		String str;
		System.out.println("Enter the value for the first string");
		
		Scanner ob=new Scanner(System.in);
		str=ob.next();
		
		System.out.println("Enter the value for the second string");
		str=str.concat(ob.next());

		byte b[] = str.getBytes();
	
		// Merge Sort Logic
		for(int i=0; i<b.length; i++)	{
			for(int j=0; j<b.length-1; j++) {
				if(b[j]>b[j+1]) {
					byte temp = b[j+1];
					b[j+1] = b[j];
					b[j] = temp;
				}
			}
		}

		String str3=new String(b);
		System.out.println(str3);
	}
}