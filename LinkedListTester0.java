import java.util.*;

public class LinkedListTester0 {
   public static void main(String[] args) {
      try {
         LinkedList list = new LinkedList();
         Random rand = new Random();
 
         Scanner input = new Scanner(System.in);
         // Asks how many nodes the user wants
         System.out.print("How many nodes? ");
         int count = input.nextInt();
      
         // Creates a linked list of random integers in the range 0 to 1000
         for (int i = 0; i < count; i++)
            list.insertFirst(rand.nextInt(1001));
         
         System.out.println("\nBefore: ");
         list.traverse();
         if (list.isEmpty())
            System.out.print("Empty");
         
         list.deleteFirst();
         System.out.println("\n\nAfter: (delete first node)");
         list.traverse();
         if (list.isEmpty())
            System.out.print("Empty");
   
         list.insertLast(rand.nextInt(1001));
         System.out.println("\n\nAfter: (insert last node)");
         list.traverse();
         
         list.deleteLast();
         System.out.println("\n\nAfter: (delete last node)");
         list.traverse();
         if (list.isEmpty())
            System.out.print("Empty");
            
         System.out.println("\n\nDo you want to delete the entire list? [Yes] [No]");
         Scanner input1 = new Scanner(System.in);
         String ans0 = input1.nextLine();
         if (ans0.equals("Yes")) {
            list.deleteList();
            System.out.println("Your list is successfully deleted!");
            
            System.out.println("\nWant to check? [Yes] [No]");
            Scanner input2 = new Scanner(System.in);
            String ans1 = input2.nextLine();
            if (ans1.equals("Yes")) {
               list.traverse();
               
               if (list.isEmpty())
                  System.out.print("Empty");
            }
            else
               System.out.println("Well Done!");
         }
         else
            System.out.println("Your list is not deleted.");
      }
      
      catch (Exception e) {
         e.printStackTrace();
      }
   }  
}  