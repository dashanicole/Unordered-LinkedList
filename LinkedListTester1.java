import java.util.*;

public class LinkedListTester1 {
   public static void main(String[] args) {
      LinkedList listA = new LinkedList();
      
      listA.insertFirst(10);
      listA.insertFirst(20);
      listA.insertFirst(10);
      listA.insertFirst(40);
      listA.insertFirst(50);
      listA.insertFirst(10); 
      
      System.out.println("List A: (original list)");
      listA.traverse();
      System.out.println();
      System.out.println(listA.delete(10) + " node/s deleted!");
      listA.traverse();
      /*
      Scanner input = new Scanner(System.in);
      System.out.print("\nValue: ");
      int val = input.nextInt();
      System.out.print("Index: ");
      int ind = input.nextInt();
      list.changeNode(val,ind);
      
      list.traverse();   
      */
      
      LinkedList listB = listA.copyNode();
      System.out.println("\n");
      
      System.out.println("List B: (copied list)");
      listB.traverse();  
   }
}