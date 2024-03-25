
public class CircularLinkedList {

	 private Node head = null;
	    private Node tail = null;
	    
	    
	    public void addNode(int value) {
	        Node newNode = new Node(value);

	        if (head == null) {
	            head = newNode;
	        } else {
	            tail.nextNode = newNode;
	        }

	        tail = newNode;
	        tail.nextNode = head;
	    }//end addNode
	    
	    
	    
	    
	 
	   public void display() 
	    {
	    	Node currentNode = head;
	    	
	    	if(currentNode!=null)
	    	{
	    		do {
	    			System.out.print(currentNode.value+" ");
	    			currentNode=currentNode.nextNode;
	    		
	    		}while(currentNode!=head);
	    	}else
	    	{
	    		System.out.println("Empty List");
	    	}
	    	
	    }//end display()
	    
	   
	   public Node searchKey(int givenKey) {
		    Node currentNode = head;
		    if (currentNode != null) {
		        do {
		            if (currentNode.value == givenKey) {
		                // key found at address p
		                return currentNode;
		            }
		            currentNode = currentNode.nextNode;
		        } while (currentNode != head);
		    }
		    return null; // not found
		}//end
	   
	   public void insertBefore(int givenKey,int newValue) 
	   {
		   Node newNode , currentNode, nextNode;
		   
		   nextNode = null; // initialize
		   currentNode = head;
		   newNode = new Node(newValue);
		   
		   do {
			   nextNode = currentNode;
			   currentNode = currentNode.nextNode;
			   if ( currentNode.value == givenKey ) break;
			   } while ( currentNode != head );
		   
		   if ( currentNode.value == givenKey ) {
			// node with key givenKey has address q
			   nextNode.nextNode = newNode;
			newNode.nextNode = currentNode;
			}
	   }//end insertBefore
	   
	   
	   public void insertAfter(int givenKey,int newValue) 
	   {
		  //TASK: COMPLETE THE CODE 
		
		   
	   }//end insertAfter
	   
	   public void deleteNode(int givenKey) 
	   {
		   
		   Node  currentNode, nextNode;
		   
		   nextNode = null; // initialize
		   currentNode = head;
		 
		   
		   do {
			   nextNode = currentNode;
			   currentNode = currentNode.nextNode;
			   if ( currentNode.value == givenKey ) break;
			   } while ( currentNode != head );
		   
		   if ( currentNode.value == givenKey )
		   {
			   if ( currentNode == currentNode.nextNode )
			   {
				   
				   System.out.println("List now empty");
			   }
			   else 
			   {
				nextNode.nextNode = currentNode.nextNode;
				if(currentNode == head)
					head = nextNode;
			   }//end else
		   }//end if
		   
	   }//end deleteNode
	   

	   public void deleteNodeAll() 
	   {
		   
		   Node  currentNode, nextNode;
		   
		   nextNode = null; // initialize
		   currentNode = head;
		 
		   
		   do {
			  nextNode = currentNode;
			  currentNode = currentNode.nextNode;
			   
			   } while ( currentNode != head );
		   
		   head = null;
		   
	   }//end deleteNodeAll
	   
	   
}//end class
