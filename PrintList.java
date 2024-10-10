package Grocery;

public class PrintList {
	public static void printList() {
		
		//Title display
		System.out.println("Displaying your grocery list:");
		
		//Cycles through each item 
		for(int i = 0; i < GroceryList_Main.numberOfItemsInList; i++) {
			
			//Displays index number (plus 1 to account for computer starting from 0)
			System.out.print( (i + 1) + ". ");
				
			//If checked, mark with "x"
			if(GroceryList_Main.checked[i]) {
				System.out.print("x ");
			}
			//If not checked mark with "-"
			else {
				System.out.print("- ");
			}
		
			//Additional bells and whistles
			System.out.println(" " + GroceryList_Main.items[i] + "\n");
		
		
			}		
		}
	}
