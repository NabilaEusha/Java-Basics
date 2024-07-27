import src.ArrayList;
import src.String;
public class ForEach {

	public static void main(String[] args) {
		/*
		 * for-each = traversing technique to iterate through the element in an 
		 *            array/collection
		 *            less steps, more readable
		 *            less FLEXIBLE
		 */
		
//		String[] animals = {"cat","dog","rat","bird"};
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");
		
		for(String i: animals) {//for(dataType i (in): variable
			System.out.println(i);
		}
	}

}
