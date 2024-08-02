public class LinkedListTester {
   public static void main(String[] args) {
      // create an empty linked list
      LinkedList list = new LinkedList();
      
      // insert the first Node
      list.insertFirst(5);
      
      list.insertFirst(14);
      list.insertFirst(8);
      list.insertFirst(15);
      list.insertFirst(1);
      
      list.traverse();
      
      /*
      *if (list.isEmpty())
      *   System.out.print("The list is empty!");
      *else
      *   System.out.print("The list is not empty!");
      */
   }
}
