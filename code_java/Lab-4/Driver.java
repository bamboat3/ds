import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CircularLinkedList cll = new CircularLinkedList();
			cll.addNode(1);
		    cll.addNode(2);
		    cll.addNode(3);
		    cll.addNode(4);
		    cll.addNode(6);
		    cll.addNode(7);
		    cll.addNode(9);
		    

		    cll.display();
		    System.out.println();
		    System.out.println("Enter Key to Search");
		    int givenKey = scanner.nextInt();
		    
		    System.out.println(" Searched Key Founded = "+cll.searchKey(givenKey));
		    
		    
	
		    System.out.println("Enter Key to insert before");
		     givenKey = scanner.nextInt();
		     System.out.println("Enter new Key to insert");
		     int newValue = scanner.nextInt();
		     cll.insertBefore(givenKey,newValue);
		     
		     cll.display();
			 System.out.println();
			 
			  System.out.println("Enter Key to insert after"); //suppose 7
			     givenKey = scanner.nextInt();
			     System.out.println("Enter new Key to insert"); //suppose 8
			     newValue = scanner.nextInt();			     
			     cll.insertAfter(givenKey,newValue);
			     
			     cll.display();
				 System.out.println();
				 
				  System.out.println("Enter Key to delete a node"); //suppose 7
				     givenKey = scanner.nextInt();
				 cll.deleteNode(givenKey);
				 
				 cll.display();
				 System.out.println();
				 
				 System.out.println("Do you want to delete all nodes? (Y)es or (N)o"); 
			     String userInput = scanner.next();
				 
			     if(userInput.equalsIgnoreCase("y"))
			     {
			    	 cll.deleteNodeAll();
			     }
			     
			     cll.display();
				 System.out.println();
	}//end main

}//end class
