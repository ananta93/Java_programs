//finding the day of a given date
/**
***@auther : Ananta Chandra Das
***version : 1.04
***alaxa corporation©
*/

//odd days can take any value {0,1,2,3,4,5,6} N%7
//"century leap year" (divided by  " 400 " ) and "leap year" (divided by " 4 ") are the two major components to do the task
/**

STEP-1
--------
->divide the day into 4 parts
->part no.1 contains the total no. of years which have contributed in the formation of complete century years
->part no.2 contains all the completed years which do not contribute a complete century year
->part no.3 contains all those completed months which do not contribute a complete century year
->part no.4 contains all those days including the day on which we are finding the day which do not form the complete month

e.g.  :
		15.08.1947

		part 1| part 2| part3|part 4|
		------| ------| -----|------|
		1900  |  46   |  16  |   15 |
			  |       |      |      |
			  |       |      |      |
		------------------------------
			1 |  1    |  2   |  1   |   total 1+1+2+1=5 (friday)

			*****reference followings

*/

//STEP-2 : find the total number of odd days for each part

//Step-3 :add the total no. of odd days of each part and get the final number

import java.lang.*;
import java.util.*;
import java.io.*;
class DayDate
{	
	public static void main(String args[])throws Exception
	{
		int d,m,y,dt;
		int m2;
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the date : ");
		d=ob.nextInt();
		for(;d>31;d++)
		{
			System.out.println("Invalid Date :A month contains maximum 31 Days.\n");
			System.out.print("Enter a valid date : ");
			d=ob.nextInt();
			d=d-1;
		}
		//d=d-1;
		System.out.print("Enter the Month : ");
		m=ob.nextInt();
		/*if (m==2&&d>29)
			{
				System.out.println("Invalid Date :February contains 28 days.\n");
				System.out.print("Enter a valid date : ");
				d=ob.nextInt();
				System.out.print("Enter a valid month : ");
				m=ob.nextInt();
			}*/
		for(int i=1000;i<=9999;i++)
		{
			if (m==4&&d>30)
			{
				System.out.println("Invalid Date :April contains 30 days.\n");
				System.out.print("Enter a valid date : ");
				d=ob.nextInt();
				System.out.print("Enter a valid Month : ");
				m=ob.nextInt();
			}
			if (m==6&&d>30)
			{
				System.out.println("Invalid Date :June contains 30 days.\n");
				System.out.print("Enter a valid date : ");
				d=ob.nextInt();
				System.out.print("Enter a valid month : ");
				m=ob.nextInt();
			}
			if (m==9&&d>30)
			{
				System.out.println("Invalid Date :September contains 30 days.\n");
				System.out.print("Enter a valid date : ");
				d=ob.nextInt();
				System.out.print("Enter a valid month : ");
				m=ob.nextInt();
			}
			if (m==11&&d>30)
			{
				System.out.println("Invalid Date :November contains 30 days.\n");
				System.out.print("Enter a valid date : ");
				d=ob.nextInt();
				System.out.print("Enter a valid month : ");
				m=ob.nextInt();
			}
		}
		for(;m>12;m++)
		{
			System.out.println("Invalid Month :A year contains maximum 12 Months.\n");
			System.out.print("Enter a valid month : ");
			m=ob.nextInt();
			m=m-1;
		}
		System.out.print("Enter the year : ");
		y=ob.nextInt();							// y=1992
		if (y<=1000||y>=9999)
		{
			System.out.print("The entered year should be within the range 1000 to 9999 .\n");
			System.out.print("Please Enter the year once Again : ");
			y=ob.nextInt();
		}
		for(int i=1000;i<=9999;i++)
		{
		if (m==2&&d>29)
			{
				if(y%4==0)
				{
					System.out.println("Invalid Date :A leap year contains 29 Days in February .\n");
					System.out.print("Enter a valid date : ");
					d=ob.nextInt();
					System.out.print("Enter a valid month : ");
					m=ob.nextInt();
					System.out.print("Enter the year : ");
					y=ob.nextInt();
				}
				else
				{
					System.out.println("Invalid Date :February contains 28 days.\n");
					System.out.print("Enter a valid date : ");
					d=ob.nextInt();
					System.out.print("Enter a valid month : ");
					m=ob.nextInt();
					System.out.print("enter the year : ");
					y=ob.nextInt();
				}
			}
		}
		System.out.print("\n"+d+"."+m+"."+y+" is a ");
		{
			if(y%4==0)
				m2=1;
			else
				m2=0;
		}
		//System.out.println(m2);

		int y_r;
		y_r=y%100;                    	//92
		y=y-y_r;        						// 	System.out.printlny; o/p = 1900  (1992-92)

		int ch_y=y%400;
		{
			if(ch_y==100)
				y=5;
			else if(ch_y==200)
				y=3;
			else if(ch_y==300)
				y=1;
			else
				y=0;
		}                                  //take y
		//System.out.printlny;
		//calculation for part no.2 of STEP-1

		{
			y_r=y_r-1;
			int yr_d=y_r/4;
			y_r=y_r+yr_d;
			y_r=y_r%7;                     //take y_r
		}
	// System.out.printlny_r;

	 /*
		no. of odd days of a month
		==========================
		jan-3       jul-3
		feb-0,1     aug-3
		mar-3       sep-2
		apr-2       oct-3
		may-3       nov-2
		jun-2       dec-3


	*/
		{
			int m1=3;
			int m3=3;
			int m5=3;
			int m7=3;
			int m8=3;
			int m10=3;
			int m12=3;
			int m4=2;
			int m6=2;
			int m9=2;
			int m11=2;
			if(m==1)
				m=0;
			else if(m==2)
				m=m1;
			else if(m==3)
				m=m1+m2;
			else if(m==4)
				m=m1+m2+m3;
			else if(m==5)
				m=m1+m2+m3+m4;
			else if(m==6)
				m=m1+m2+m3+m4+m5;
			else if(m==7)
				m=m1+m2+m3+m4+m5+m6;
			else if(m==8)
				m=m1+m2+m3+m4+m5+m6+m7;
			else if(m==9)
				m=m1+m2+m3+m4+m5+m6+m7+m8;
			else if(m==10)
				m=m1+m2+m3+m4+m5+m6+m7+m8+m9;
			else if(m==11)
				m=m1+m2+m3+m4+m5+m6+m7+m8+m9+m10;
			else
				m=m1+m2+m3+m4+m5+m6+m7+m8+m9+m10+m11;

		}
		m=m%7;
			//System.out.println(m);
	
			//calculation for days
			//
		d=d%7;
			//System.out.printlnd;
			//total calculation
		int total=y+y_r+m+d;
		int day=total%7;
		if(day==0)
			System.out.println("sunday.");
		else if(day==1)
			System.out.println("monday.");
		else if(day==2)
			System.out.println("tuesday.");
		else if(day==3)
			System.out.println("wednesday.");
		else if(day==4)
			System.out.println("thursday.");
		else if(day==5)
			System.out.println("friday.");
		else
			System.out.println("saturday.");
	}
}
