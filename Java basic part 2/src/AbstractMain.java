
public class AbstractMain {

	public static void main(String[] args) {
		
		/* abstract = abstract classes cannot be instaniated, but they can have a subclass
		 *            abstract methods are declared without an implementation.
		 */
		
//		Vehicle1 vehicle = new Vehicle1();
		Car1 car = new Car1();
		
        car.go();

	}

}
