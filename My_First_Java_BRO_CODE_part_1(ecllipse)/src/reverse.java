
public class reverse {

	public static void main(String[] args){
		String x=" Water ";
		String y="kool-Aid";
		String temp;
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("Ater swapping the variables");
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}

}
