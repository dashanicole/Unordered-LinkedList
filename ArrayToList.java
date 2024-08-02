import java.util.*;

public class ArrayToList {
   public static void main(String[] args) {
      LinkedList list = new LinkedList();
      
      int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      
      list.toList(data);
      list.traverse();
      
      /*
      Scanner input = new Scanner(System.in);
      System.out.print("\nSearch for? ");
      int target = input.nextInt();
      System.out.println("The " + target + " is in Node " + list.searchNode(target));      
      */
      
      Scanner input1 = new Scanner(System.in);
      System.out.print("\nValue: ");
      int val = input1.nextInt();
      
      System.out.print("Index: ");
      int ind = input1.nextInt();
      
      list.set(val,ind);
         
         //System.out.print("\nWould you like to change more? ");
         //String ans = input1.nextLine();
         //if (!ans.equals("Yes"))
         //   enter = false;  
      
      list.traverse();
   }
}
