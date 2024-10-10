package Grocery;

import java.util.Scanner;

public class GroceryList_Main {
	
	//Array of Strings to maintain the list of items
    public static String[] items = new String[250];
    
    //Boolean array to note if item has been "checked off" or not
    public static boolean[] checked = new boolean[250];
    
    //Keeps track of number of items on the list
    public static int numberOfItemsInList = 0;
    
    //Scanner to take in user input
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
    	//Loop to run main menu
        while(true) {
            System.out.println("Welcome to Grocery List Management!");
            System.out.println("1. Add Item to your Grocery List\n2. Remove Item from your Grocery List\n3. \"Check Off\" an item from your Grocery List\n4. Display your Grocery List\n5. Exit");
            System.out.print("\nPlease enter the number of an option above:");
            
            //If the user inputs an integer (valid input)
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine(); 
                
                if(choice == 1) {
                    AddItem.addItem();
                }
                else if(choice == 2) {
                    RemoveItem.removeItem();
                }
                else if(choice == 3) {
                    CheckOff.checkOff();
                }
                else if(choice == 4) {
                    PrintList.printList();
                }
                else if(choice == 5) {
                    PrintList.printList(); 
                    System.out.println("Okay Bye!");
                    break;
                }
                else {
                    System.out.println("That is not an option, try again!!\n");
                }
            } 
            //User enters invalid input (not an integer)
            else {
                System.out.println("That's not even a number... do better!!\n");
                scanner.nextLine(); 
            }
        }
        
        //Close the scanner
        scanner.close();
    }
}