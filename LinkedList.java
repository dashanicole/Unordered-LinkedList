public class LinkedList {
   private Node2 headPtr = null;
   
   // The constructor creates an empty list
   LinkedList() { headPtr = null; }
   
   // Determine if the List is empty
   public boolean isEmpty() { return headPtr == null; }
   
   // Insert one Node containing data at the head
   // of the list.  This will be explained in a few pages.
   public void insertFirst(int data) {
      // creates a new Node
      Node2 newFirst = new Node2(data);
      // the value in headPtr is copied into the new Node
      newFirst.setNext(headPtr);
      // the reference to the new node is copied into headPtr
      headPtr = newFirst;
   }
   
   public void insertLast(int data) {
      // create a new node
      Node2 newNode = new Node2(data);
      
      // if list is empty
      if (headPtr == null)
         headPtr = newNode;
      else {
         // search for the last node
         Node2 p = headPtr;
         
         while (p.getNext() != null) 
            p = p.getNext();
         
         // link new node after it
         p.setNext(newNode);
      }     
   }
   
   public void deleteFirst() {
      if (headPtr != null)
         headPtr = headPtr.getNext(); 
      // headPtr now points at second node, or
      // is null if there was no second node.
   }
   
   public void deleteLast() {
      
      if (headPtr == null)
         return;
      else if (headPtr.getNext() == null) 
         headPtr = null;
      else {
         Node2 p = headPtr;
  
         // search for the next to last node
         while (p.getNext().getNext() != null) 
            p = p.getNext();
      
         // unlink the last node
         p.setNext(null);     
      }
   }
   
   public void traverse() {
      Node2 p = headPtr;
      
      while (p != null) {
         System.out.print(p); // print the node
         p = p.getNext(); // advance the pointer
      }
   }
   
   public void deleteList() { headPtr = null; } // delete all the nodes
   
   public void toList(int[] array) { // transfer array to list
      if (headPtr == null) { 
         for (int i = array.length-1; i >= 0; i--) { 
            Node2 arr = new Node2(array[i]); // copying arrays to nodes
            arr.setNext(headPtr);
            headPtr = arr;   
         }
      }
   }
   
   public int searchNode(int data) { // search node
      Node2 p = headPtr;
      int node = 1;
      
      while (p != null) { // locate the node's index
         if (p.getValue() == data) 
            return node;
         
         node++;
         p = p.getNext();
      }
     
      return -1; // return if no index
   }
   
   public void changeNode(int value, int index) { // change the node's value
      Node2 p = headPtr;
      
      for (int i = 1; i <= index; i++) p = p.getNext();
      
      p.setValue(value); // set a new value
   }
   
   public LinkedList copyNode() { // copy nodes to other list
      Node2 p = headPtr;
      LinkedList copy = new LinkedList();
      int len = 0;
      
      while (p != null) { // count the number of nodes
         len++;
         p = p.getNext();
      }
      
      p = headPtr;
      
      for (int i = len; i > 0; i--) { // copy in order
         for (int j = i; j > 1; j--) p = p.getNext();
         
         copy.insertFirst(p.getValue()); // insert a value
         p = headPtr;
      }
      
      return copy; // return the copied list
   }
   
   public int delete(int victim) { // delete nodes
      Node2 target = headPtr, prev = null;
      int len = 0, node = 0;
      
      if (target == null)
         return node; // return if null
         
      while (target != null) { // count the number of nodes
         len++;
         target = target.getNext();
      }
      
      target = headPtr;
      
      for (int i = 0; i < len;) { // make sure all the nodes read 
         while (target != null && target.getValue() != victim) {
            prev = target;
            target = target.getNext();
            i++; //incrementation
         }
         
         if (target == null)
            return node; // return if null
         else if (target.getValue() == victim) {
            if (i == 0) 
               headPtr = headPtr.getNext();
            else 
               prev.setNext(target.getNext()); // skipped the chosen node  
            
            target = target.getNext(); 
            node++; // incrementation 
            i++;
         }
      }
      
      return node; // return the number of nodes deleted
   }
}
