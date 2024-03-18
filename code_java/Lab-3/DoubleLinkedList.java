
public class DoubleLinkedList {

		//head node;
		Node head = null;
		//tail node;
		Node tail = null;
		
	public DoubleLinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	
		
	// Function to add a node in the front of doubly linked list
	public void addNodeFront(int val) {	    
	    // Creating a new node
	    Node current = new Node(val, head, null);	    
	    // checking if head is null
	    if(head != null ) 
	    {// Assigning current to head.prev
	        head.prev = current;
	    }	    
	    // Assigning current to head
	    head = current;	    
	    // Cheking if tail is null
	    if(tail == null) 
	    { // Assigning current to tail
	        tail = current;
	    }	    
	    System.out.println("New node added: " + val);
	}//addNodeFront
	
	// Function to add a node in the back of doubly linked list
	public void addNodeBack(int val) {	         
	    // Creating a new node
	    Node current = new Node(val, null, tail);	    
	    // Cheking if tail is null
	    if(tail != null) 	    {
	        // Assigning current to tail.next
	        tail.next = current;
	    }	    
	    // Assigning current to tail
	    tail = current;	    
	    // Cheking if head is null
	    if(head == null) 
	    { // Assigning current to head
	        head = current;
	    }	    
	    System.out.println("New node added: " + val);
	}//end addNodeBack
	
	public void iterateForward(){
        Node current = head;	        
	    while(current != null){
	        System.out.print(current.data+" ");
	        current = current.next;
	    }
	    System.out.println();
	}//end iterateForward
	
	public void iterateBackward(){        
	    Node current = tail;	    
	    while(current != null){
	        System.out.print(current.data+" ");
	            current = current.prev;
	        }
	    System.out.println();
	    }//end iterateBackward
	
	
	// Function to remove the front node
	public int removeNodeFront() {
	        
	        // assigning head to current
	        Node current = head;
	    
	        // assigning the next pointer to the head
	        // and setting the prev pointer of head to null
	        head = head.next;
	        head.prev = null;
	    
	        System.out.println("deleted: " + current.data);
	    
	        // Returning the deleted item
	        return current.data;
	    }//end removeNodeFront()
	
	// Function to remove the last node
	public int removeNodeBack() {
	        
	        // assigning tail to current
	        Node current = tail;
	    
	        // assigning the prev pointer to the tail
	        // and setting the next pointer of tail to null
	        tail = tail.prev;
	        tail.next = null;
	    
	        System.out.println("deleted: " + current.data);
	    
	        // Returning the deleted item
	        return current.data;
	    }//end removeNodeBack

	public void display() {		
		Node current = head;		
		while(current!=null) {			
			System.out.print(current.get()+" ");			
			current = current.getNext();
		}}//end display
	
public Node getNext() {
	return tail.next;
}

public void delete(int key) {
	Node current = head;	
	while(current!=null) {
		if(current.data==key)
		{	if(current.prev!=null)
			{ current.prev.next = current.next;
			}
		else{head = current.next;}
			
			if(current.next!=null) {
				current.next.prev = current.prev;}			
			break;
		}		
		current = current.next;
	}//end while
}


public void clear() {
    Node current = head;
    while (current != null) {
        Node nextNode = current.next;
        current.prev = null;
        current.next = null;
        current = nextNode;
    }
    head = null;
}

}//end class
