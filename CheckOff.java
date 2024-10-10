package Grocery;

public class CheckOff {

	public static void checkOff(){
		
		//Prompt user to input the name/number of the item they want to check off
		System.out.println("Please input the name/number of the item or number of the item you wish to check off");
	
        //Integer to store an invalid index value 
        int indexToRemove = -1;
        
        //If user inputs an number
        if (GroceryList_Main.scanner.hasNextInt()) {
        	
        	//Taking user input
            int itemNumber = GroceryList_Main.scanner.nextInt();
            GroceryList_Main.scanner.nextLine(); 
            
            //Check if the entered item number is valid (greater than 0/ greater than or equal to number of items in array)
            if (itemNumber > 0 && itemNumber <= GroceryList_Main.numberOfItemsInList) {
                
            	//Accounts for computer starting from 0 
            	indexToRemove = itemNumber - 1; 
            } 
            //Tell user that the number they put wasn't valid
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
            	
            	//If item has been previously added, its time to check it off
                if (GroceryList_Main.items[i].equalsIgnoreCase(nameItem)) {
                    indexToRemove = i;
                    break;
                }
            }
        }
	
        //valid input
        if (indexToRemove != -1) {
        	
        	//Marking item as checked
        	GroceryList_Main.checked[indexToRemove] = true;
        	
        	//Telling user that their item has been checked off
            System.out.println("\"" + GroceryList_Main.items[indexToRemove] + "\" has been checked off.");
        } 
        //If index value is invalid
        else {
            System.out.println("Whatever you just entered... it wasn't on your list!");
        }
	
	}
	
	
	
}
