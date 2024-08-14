public class SuperMain {

	public static void main(String[] args) {
	/* Super = Keyword refers to the superclass (parent) of an object
	 *        very similar to the "this" keyword.
	 * 	
	 */
		Hero hero1 = new Hero("Batman",42,"$$$");
		Hero hero2 = new Hero("Superman",46,"everything");
		System.out.println("Hero 1 :");
		System.out.println(hero1.toString());
		System.out.println("Hero 2 :");
		System.out.println(hero2.toString());
//		System.out.println(hero1.name);
//		System.out.println(hero1.age);
//		System.out.println(hero1.power);
	}

}
