package arrayTasks;

public class ArrayTask05FindIndexNumber {

	public static void main(String[] args) {
		/*
		 * Given the following arrays: 
		 * String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case" };
		 * double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
		 * int[] itemIDs = {12345 , 12346, 12347, 12348, 12349, 12350};
		 * find out the first index number of "Gloves"
		 * find out if "iPad" is contained in the item list 
		 * Print the report of each
		 * shopping item `name` - `price` - `#ID`
		 */
		String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
		double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
		int[] itemIDs = {12345 , 12346, 12347, 12348, 12349, 12350};
		
		int index = 0;
		
		for (String item : items) {
			if(item.equals("Gloves")) {
				System.out.println("Index Number Of Glover = " + index);
			}
			if(item.equals("iPad")) {
				System.out.println("iPad is in the item list");
			}
			index++;
		}
		
		System.out.println("Items Report");
		for(int i = 0; i < items.length; i++) {
			System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
		}

	}

}
