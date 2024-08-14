

public class OverloadedMethods {

	public static void main(String[] args) {
		// Overloaded methods = methods that share the same name but have different parameters
		   //                   method name + parameters = method signiture
		
		double x = add(1,2);
		System.out.println(x);

	}
	
	static int add(int a , int b) {
		System.out.println("This is overloaded method no #1");
		return a+b;	
	}
	static int add(int a , int b,int c) {
		System.out.println("This is overloaded method no #2");
		return a+b+c;	
	}
	static double add(double a , double b) {
		System.out.println("This is overloaded method no #3");
		return a+b;	
	}
	static double add(double a , double b,double c) {
		System.out.println("This is overloaded method no #4");
		return a+b+c;	
	}

}
