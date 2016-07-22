// Constructor overloading
class Dim{
	double width,height,depth;
	Dim(){
		width=10;
		height=15;
		depth=20;
	}
	Dim(Dim ob){
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}
	Dim(double l){
		width=height=depth=l;
	}
	Dim(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
	double volume(){
		return width*height*depth;
	}
}
class OverloadCons{
	public static void main(String[] args){
		Dim ob1=new Dim();
		Dim ob2=new Dim(10);
		Dim ob3=new Dim(5,10,15);
		Dim ob=new Dim(ob3);
		double vol;
		vol=ob1.volume();
		System.out.println("The volume of the first dimension is "+vol);
		vol=ob.volume();
		System.out.println("The volume of the second(object as parameter) dimension is "+vol);
		vol=ob2.volume();
		System.out.println("The volume of the third dimension is "+vol);
		vol=ob3.volume();
		System.out.println("The volume of the fourth dimension is "+vol);
	}
}