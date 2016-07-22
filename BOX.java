
//2.	Write a class file – box with three data members(length, width, height) and a method volume() .
 //Also implement the application class Demo where an objet of the box class is created with user entered 
 //dimensions and volume is printed.
 class BOX{
 double length,width,height;
 public void volume(double length,double width,double height){
 
 return length*width*height;
 }
 }
class demo extends BOX{
	BOX box=new demo();
	System.out.println(box.volume(10,10,10));
}