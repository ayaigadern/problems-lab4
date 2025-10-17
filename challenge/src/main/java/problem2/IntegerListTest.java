package problem2;

import java.util.Scanner;
public class IntegerListTest
{
    static IntegerList list = new IntegerList(10);
    static Scanner scan = new Scanner(System.in);
    //-------------------------------------------------------
// Create a list, then repeatedly print the menu and do what the
// user asks until they quit
//-------------------------------------------------------
    public static void main(String[] args)
    {
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0)
        {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }
    }
    //--------------------------------------
// Do what the menu item calls for
//--------------------------------------
    public static void dispatch(int choice)
    {
        int loc;
        switch(choice)
        {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
                System.out.println("How big should the list be?");
                int size = scan.nextInt();
                list = new IntegerList(size);
                list.randomize();

                break;
            case 2:
                list.print();
                break;
            case 3:
                System.out.println("Enter element to add");
                int element= scan.nextInt();
                list.addElement(element);
                break;
            case 4:
                System.out.println("Enter element to remove its first occurence");
                int removed= scan.nextInt();
                list.removeFirst(removed);
                break;
            case 5:
                System.out.println("Enter element to remove");
                int removed_= scan.nextInt();
                list.removeAll(removed_);;
                break;
            default:
                System.out.println("Sorry, invalid choice");
        }
    }
    //----------------------------
// Print the user's choices
//----------------------------
    public static void printMenu()
    {
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("0: Quit");
        System.out.println("1: Create a new list (** do this first!! **)");
        System.out.println("2: Print the list");
        System.out.println("3: Add an element to the list");
        System.out.println("4: remove the first occurence of an element from the list");
        System.out.println("5: remove an element from the list");

        System.out.print("\nEnter your choice: ");
    }
}
