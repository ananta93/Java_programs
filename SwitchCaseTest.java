//Program to print the corresponding week day for the user entered day no. (01 -31) of the current month using switch..case statement in Java
import java.util.Scanner;
class SwitchCaseTest 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the day between 1-31");
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
		switch(day){
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			case 8:
				System.out.println("Sunday");
				break;
			case 9:
				System.out.println("Monday");
				break;
			case 10:
				System.out.println("Tuesday");
				break;
			case 11:
				System.out.println("Wednesday");
				break;
			case 12:
				System.out.println("Thursday");
				break;
			case 13:
				System.out.println("Friday");
				break;
			case 14:
				System.out.println("Saturday");
				break;
			case 15:
				System.out.println("Sunday");
				break;
			case 16:
				System.out.println("Monday");
				break;
			case 17:
				System.out.println("Tuesday");
				break;
			case 18:
				System.out.println("Wednesday");
				break;
			case 19:
				System.out.println("Thursday");
				break;
			case 20:
				System.out.println("Friday");
				break;
			case 21:
				System.out.println("Saturday");
				break;
			case 22:
				System.out.println("Sunday");
				break;
			case 23:
				System.out.println("Monday");
				break;
			case 24:
				System.out.println("Tuesday");
				break;
			case 25:
				System.out.println("Wednesday");
				break;
			case 26:
				System.out.println("Thursday");
				break;
			case 27:
				System.out.println("Friday");
				break;
			case 28:
				System.out.println("Saturday");
				break;
			case 29:
				System.out.println("Thursday");
				break;
			case 30:
				System.out.println("Friday");
				break;
			case 31:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Please enter a valid date");
		}
	}
}
