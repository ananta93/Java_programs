/*A plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. 
The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. 
Implement it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits from 2D.*/


import java.util.*;
class Shape2D {
	int x,y,area;
	Scanner sc=new Scanner(System.in);
	void area2D(){
		System.out.println("Enter the length of the shape :");
		x=sc.nextInt();
		System.out.println("Enter the length of the shape :");
		y=sc.nextInt();
		area=x*y;
	}
	void calculate2D(){
		System.out.println("The total cost of the sheet is "+(40*area));
	}
}
class Shape3D extends Shape2D {
	int z,volume;
	void area3D(){
		System.out.println("Enter the height of the shape :");
		z=sc.nextInt();
		volume=area*z;
	}
	void calculate3D(){
		System.out.println("The total cost of the box is "+(60*volume));
	}
	public static void main(String[] args){
		Shape3D d=new Shape3D();
		d.area2D();
		d.calculate2D();
		d.area3D();
		d.calculate3D();
	}
}