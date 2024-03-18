
public class Node {
	 public Node(int val, Node next, Node prev) {
		// TODO Auto-generated constructor stub
		 this.data = val;
		 this.prev = prev;
		 this.next = next;	}

	// stores data 
    public int data;    
    // pointer to the next node
    public Node next;    
    // pointer to the previous node
    public Node prev;  
    
    public int get() {return data;}
    public Node getNext() {return next;}
}//end class
