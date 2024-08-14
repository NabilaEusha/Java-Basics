
public class Arraylist2D {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("Pasta");
		bakeryList.add("Bread");
		bakeryList.add("DOnuts");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("toamto");
		produceList.add("cucumber");
		produceList.add("onion");
		
		ArrayList<String> drinkList = new ArrayList();
		drinkList.add("tea");
		drinkList.add("coffee");
		drinkList.add("juice");
		drinkList.add("soda");
		
		System.out.println("Produce List--"+produceList);
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);
		
		System.out.println("Total grocery list: "+groceryList);
		
		System.out.println("At index 01: "+groceryList.get(1));
		

	}

}
