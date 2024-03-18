import java.util.Scanner;

public class Driver {

	
	
	public Driver() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		 // Creating a doubly linked list
        DoubleLinkedList dl = new DoubleLinkedList();
        
     // Adding nodes to the doubly linked list  
        dl.addNodeBack(2);  
        dl.addNodeBack(4);  
        dl.addNodeBack(6);  
        dl.addNodeBack(8);  
        dl.addNodeBack(10);  
        
        //Displays the nodes present in the list  
        dl.display(); 
       
        //now add Node to Front
        System.out.println();
        System.out.println("Enter value at the Front of the List");
        int val = scanner.nextInt();
        
        dl.addNodeFront(val);
        
        System.out.println("Updated LIST : ");
        
        //Displays the nodes present in the list  
        dl.display(); 
        
        System.out.println();
        System.out.println("Enter value at the Back of the List");
         val = scanner.nextInt();
        dl.addNodeBack(val);
        
        System.out.println("Updated LIST : ");
        
        //Displays the nodes present in the list  
        dl.display();
        
        
        System.out.println();
        System.out.println("Remove value from the Front of the List");                        
        dl.removeNodeFront();
        
        System.out.println("Updated LIST : ");
        
        //Displays the nodes present in the list  
        dl.display(); 
        
        System.out.println();
        System.out.println("Remove value from the Back of the List");        
        dl.removeNodeBack();
        
        System.out.println("Updated LIST : ");
        
        //Displays the nodes present in the list  
        dl.display();
        
        
        System.out.println();
        System.out.println("Iterate iterateBackward");        
        dl.iterateBackward();
        System.out.println("Iterate iterateForward");        
        dl.iterateForward();
       
      
        System.out.println();
        System.out.println("Delete specific value from the above list");
        val = scanner.nextInt();
        dl.delete(val);
        
        System.out.println("Updated LIST : ");        
        //Displays the nodes present in the list  
        dl.display();
        
        System.out.println();
        System.out.println("Delete all nodes one by one (Y)es or (N)o");
        String input = scanner.next();
        
        if(input.equalsIgnoreCase("y"))
        {
        	dl.clear();
        	
        	System.out.println("Updated LIST : ");        
            //Displays the nodes present in the list  
            dl.display();
        }
        
        
	}

}
