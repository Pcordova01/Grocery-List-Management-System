package Grocery;

public class AddItem {
    public static void addItem() {
    	
    	//Prompt user to enter name of the item
        System.out.println("Please input the name of the item you wish to add to the list:");
        String nameItem = GroceryList_Main.scanner.nextLine();
        
        //Cycle through array to see if item already exists
        for (int i = 0; i < GroceryList_Main.numberOfItemsInList; i++) {
        	
        	//If item is already inputed, let the user know, then takes them to main menu
            if (GroceryList_Main.items[i].equalsIgnoreCase(nameItem)) {
                System.out.println("You already have \"" + nameItem + "\" on your list!\n");
                return;
            }
        }

        //Item added to the end of the list
        GroceryList_Main.items[GroceryList_Main.numberOfItemsInList] = nameItem;
        
        //Item marked as "not checked off"
        GroceryList_Main.checked[GroceryList_Main.numberOfItemsInList] = false; 
        
        //Number of items in the list is incremented 
        GroceryList_Main.numberOfItemsInList++;
        
        System.out.println("\"" + nameItem + "\"" + " has been added to your grocery list...");
    }
}