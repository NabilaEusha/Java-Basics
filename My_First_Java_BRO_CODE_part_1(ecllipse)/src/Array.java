

public class Array {

	public static void main(String[] args) {
		
		String[] cars= {"Camaro","Corvette","Tesla","BMW"};
		
		cars[0]= "Mustang";
	
		System.out.println(cars[0]);
		
		String[] flowers= new String[4];
		flowers[0]="Lily";
		flowers[1]="Rose";
		flowers[2]="Jasmine";
		flowers[3]="Daisy";
		
		for(int i = 0; i<=3;i++) {
			System.out.println(flowers[i]);
		}
		

	}

}