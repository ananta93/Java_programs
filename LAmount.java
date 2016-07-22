/*2.	In an organization there are three types of employees – Manager, Worker and others.
Each has corresponding department ID and unique employeeID. 
The organization has provided the leave encashment facility as per the following guidelines –
i)	A worker will get Rs 300/- per day.
ii)	A manager will get Rs 200/- per half day.
iii)	Other employees will get Rs 200/- per day.
Automate this system in Java to find the leave encashment amount for the user entered no. of days. 
*/

import java.util.*;
class Employee {
	int emp=400;
	int wrk=300;
	int otr=200;
}
class Worker extends Employee {
	private int wleave;
	public void amount(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of leave days : ");
		wleave=sc.nextInt();
		System.out.println("The leave encashment amount of the Manager is : "+(300*wleave));
	}
}
class Manager extends Employee {
	private int mleave;
	public void amount(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of leave days : ");
		mleave=sc.nextInt();
		System.out.println("The leave encashment amount of the Manager is : "+(400*mleave));
	}
}
class Others extends Employee {
	private int oleave;
	public void amount(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of leave days : ");
		oleave=sc.nextInt();
		System.out.println("The leave encashment amount of the Manager is : "+(200*oleave));
	}
}

class LAmount {
	public static void main(String[] args) 
	{
		int deptid,empid;
		Worker ob1=new Worker();
		Manager ob2=new Manager();
		Others ob3=new Others();
		System.out.print("DEPTID 1-2 : Manager\nDEPTID 3-7 : Workers\nDEPTID 8-10 : Others\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the department id between 1 to 10 : ");
		deptid=sc.nextInt();
		System.out.print("EMPID 100-200 : Manager\nEMPID 200-700 : Workers\nEMPID 800-1000 : Others\n");
		System.out.print("Enter the Employee id between 100 to 1000 : ");
		empid=sc.nextInt();
		if(1<=deptid&&deptid<3&&100<=empid&&empid<200){
			ob2.amount();
		}
		else if(3<=deptid&&deptid<8&&200<=empid&&empid<700){
			ob1.amount();
		}
		else if(8<=deptid&&deptid<=10&&700<=empid&&empid<=1000){
			ob3.amount();
		}
		else
			System.out.println("No Employee id found in your selected option");
	}
}

class EmployeePersister 
{
	int deptid,empid;
		Worker ob1=new Worker();
		Manager ob2=new Manager();
		Others ob3=new Others();
		System.out.print("DEPTID 1-2 : Manager\nDEPTID 3-7 : Workers\nDEPTID 8-10 : Others\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the department id between 1 to 10 : ");
		deptid=sc.nextInt();
		System.out.print("EMPID 100-200 : Manager\nEMPID 200-700 : Workers\nEMPID 800-1000 : Others\n");
		System.out.print("Enter the Employee id between 100 to 1000 : ");
		empid=sc.nextInt();
		if(1<=deptid&&deptid<3&&100<=empid&&empid<200){
			ob2.amount();
		}
		else if(4<=deptid&&deptid<6&&200<=empid&&empid<300){

		}
}
