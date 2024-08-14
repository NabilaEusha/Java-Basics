
public class Printff {

	public static void main(String[] args) {
		// printf() = an optional method to control , format and display text to the console window
		//            two arguments = format string +(object/ variable/ value)
		//            % [flags] [precision] [width] [Conversion = character]
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 50;
		double myDouble = 1000;
		
		// [Conversion = character]
//		System.out.printf("%b", myBoolean);
//		System.out.printf("%c", myChar);
//		System.out.printf("%s", myString);
//		System.out.printf("%d", myInt);
//		System.out.printf("%f", myDouble);
		
		// [width]
		// minimum number of characters to be written as output
//		System.out.printf("Hello %11s", myString);
		
		// [precision]
		// sets number of digits of precision when outputting floating point values
//		System.out.printf("You have this much money %.2f", myDouble);
		
		// [flags]
		//adds an effect to output based on the flag added to format specifier 
		// - : left- justify
		// + : output a plus (+) or minus (-) sign for  numeric value
		// 0 : numeric values are zero-padded
		// , : coma grouping separator if numbers > 1000
		
		System.out.printf("You have this much money %20f\n", myDouble);
		System.out.printf("You have this much money %-20f\n", myDouble);
		System.out.printf("You have this much money %+f\n", myDouble);
		System.out.printf("You have this much money %020f\n", myDouble);
		
	}

}
