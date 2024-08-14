

public class Mathmathical {

	public static void main(String[] args) {
		double x= 3.14;
		double y = -10;
		
		double z = Math.max(x, y);
		System.out.println("Max: "+z);

		double w = Math.min(x, y);
		System.out.println("Min: "+w);
		
		double a = Math.abs(y);
		System.out.println("Abs: "+a);
		
		double s = Math.sqrt(y);
		System.out.println("Square root: "+s);
		
		double r = Math.round(x);
		System.out.println("Round: "+r);
		
		double c = Math.ceil(x);
		System.out.println("Ceil : "+c);
	}

}
