package Grocery;

public class RemoveItem {
    public static void removeItem() {
    	
    	//Prompt user to input the name of the item/number of item to remove from the list
        System.out.println("Please input the name or number of the item you wish to remove from the list: ");
        
        //Integer to store an invalid index value 
        int Invalidindex = -1;
        
        //If user inputs an number
        if (GroceryList_Main.scanner.hasNextInt()) {
        	
        	//Taking user input
            int itemNumber = GroceryList_Main.scanner.nextInt();
            GroceryList_Main.scanner.nextLine(); 
            
            //Check if the entered item number is valid (greater than 0/ greater than or equal to number of items in array)
            if (itemNumber > 0 && itemNumber <= GroceryList_Main.numberOfItemsInList) {
                
            	//Accounts for computer starting from 0 
            	Invalidindex = itemNumber - 1; 
            } 
            
            //User enters invalid number
            else {
                System.out.println("Hey!! That wasn't a valid number!");
                return;
            }
        } 
        
        //If user inputs a word
        else {
        	
        	//Receives user input as string
            String nameItem = GroceryList_Main.scanner.nextLine();
            
            //Cycle through array to see if item already exists
            for (int i = 0; i < GroceryList_Main.numberOfItemsInList; i++) {
            	
            	//If item has been previously added, its time to remove it
                if (GroceryList_Main.items[i].equalsIgnoreCase(nameItem)) {
                	Invalidindex = i;
                    break;
                }
            }
        }

        //If index value is valid
        if (Invalidindex != -1) {
            String removedItem = GroceryList_Main.items[Invalidindex];
            System.out.println("Very well, \"" + removedItem + "\" has been removed from your list!");

            // Items are shifted to the left to fill the gap by copying the right hand item to the left hand item
            for (int i = Invalidindex; i < GroceryList_Main.numberOfItemsInList - 1; i++) {
                GroceryList_Main.items[i] = GroceryList_Main.items[i + 1];
                GroceryList_Main.checked[i] = GroceryList_Main.checked[i + 1];
            }

            // Removing the last item
            GroceryList_Main.items[GroceryList_Main.numberOfItemsInList - 1] = null;
            
            //Item has been removed and is therefore unchecked
            GroceryList_Main.checked[GroceryList_Main.numberOfItemsInList - 1] = false;

            //Number of items in total is decremented
            GroceryList_Main.numberOfItemsInList--;
        } 
        //If index value is invalid
        else {
            System.out.println("Whatever you just entered... it wasn't on your list!");
        }
    }
}