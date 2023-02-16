package arrayTasks;

public class ArrayTask16Print2DArray {

	public static void main(String[] args) {
		/*
		 * Given the Array:

```java
String[][]items={
   {"Apple","Banana","Grape","Avocado"},
   {"Paper Towels","Toilet Papers","Tissues","Diapers"},
   {"Coke","Fanta","Arizona Tea","Pepsi","Water"}
   };
```

   - print the following output: (add `\t` between two words)

```text
Apple           Banana          Grape           Avocado
Paper Towels    Toilet Papers   Tissues         Diapers
Coke            Fanta           Arizona Tea     Pepsi           Water
```

   - print the following output: (add `\t` between two words)

```text
Avocado         Grape           Banana          Apple
Diapers         Tissues         Toilet Papers   Paper Towels
Water           Pepsi           Arizona Tea     Fanta           Coke
```
- print the following output: (add `\t` between two words)

```text
Coke            Fanta           Arizona Tea     Pepsi           Water
Paper Towels    Toilet Papers   Tissues         Diapers
Apple           Banana          Grape           Avocado
		 */
		
		String[][]items={
				   {"Apple","Banana","Grape","Avocado"},
				   {"Paper Towels","Toilet Papers","Tissues","Diapers"},
				   {"Coke","Fanta","Arizona Tea","Pepsi","Water"}
				   };
		for (String[] item : items) {
			
			for (String str : item) {
				if(str.indexOf(" ") > -1) {
					System.out.print(str + "\t");
				} else {
					System.out.print(str + "\t\t");
				}
			}
			System.out.println();
		}
		
		System.out.println("======================================================================");
		
		for (String[] item : items) {
			
			for (int i = item.length - 1; i >= 0; i--) {
				if(item[i].indexOf(" ") > -1) {
					System.out.print(item[i] + "\t");
				} else {
					System.out.print(item[i] + "\t\t");
				}
			}
			System.out.println();
		}
		
		System.out.println("======================================================================");
		
		for (int i = items.length - 1; i >= 0; i--) {
			String[] item = items[i];
			
			for (String str : item) {
				if(str.indexOf(" ") > -1) {
					System.out.print(str + "\t");
				} else {
					System.out.print(str + "\t\t");
				}
			}
			System.out.println();
		}

	}

}
