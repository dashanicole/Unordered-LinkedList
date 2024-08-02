public class Node2 {
   private int value;
   private Node2 next;
   
   Node2(int num) { value = num; next = null; }
   
   public int getValue() { return value; }
   public Node2 getNext() { return next; }
   
   public void setValue(int num) { value = num; }
   public void setNext(Node2 nxt) { next = nxt; }
   
   public String toString() { return value + ", "; }
}