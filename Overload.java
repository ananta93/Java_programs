//Demostrate Method Overloading
class OverloadDemo{
	void test(){
		System.out.println("No Parameters");
	}
	void test(int a ){
		System.out.println("a = "+a);
	}
	void test(int a,int b){
		System.out.println("a = "+a+" ,b = "+b);
	}
	double test(double  a){
		System.out.println("a = "+a);
		return a*a;
	}
}
class Overload{
	public static void main(String[] args){
		OverloadDemo od=new OverloadDemo();
		double result;
		od.test();
		od.test(10);
		od.test(10,20);
		result=od.test(15.0);
		System.out.println("Result = "+result);
		int x=(int)Math.sqrt(81);// Since Math.sqrt() returns a double value, we need to type cast this to get the int result
		System.out.println("x = "+x);
		//Using abs() overloaded by Math Class to handle alll numeric types
		int y=(int)Math.abs(10.5f); //Java's standard library includes an absolute value method called 'abs()' prsent within 'Math Class' which handles all numericc values
		System.out.println("y = "+y);
	}
}