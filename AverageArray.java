//program to find average of all user entered numbers till the user enters an alphabet in java
import java.util.*;
class AverageArray 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the numbers");
		Scanner sc=new Scanner(System.in);
		String input;
		float a[];
		a=new float[10];
		float sum=0.0f;
		int count=0;
		float avg=0.0f;
		for(byte i=0;i<a.length;i++){
			input=sc.next();
			if(Character.isLetter(input.charAt(0))){
				break;
			}
			else
			{
				a[i]=Float.parseFloat(input);
				count++;
			}
		}
		for(byte i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		avg=sum/count;
		System.out.println("The average of the number is : "+avg);
	}
}
