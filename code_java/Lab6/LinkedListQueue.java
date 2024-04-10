

public class LinkedListQueue implements Queue {

	private Node front;
	private Node rear;
	
	
	
	public LinkedListQueue() {
		this.front = null;
		this.rear = null;
	}

	public static void main(String[] args) {
		
		LinkedListQueue queue = new LinkedListQueue();
		
		System.out.println("is Empty: "+queue.isEmpty());
		
		System.out.println("Enqueue values 1 7 5 2");
		queue.enqueue(1);
		queue.enqueue(7);
		queue.enqueue(5);
		queue.enqueue(2);
		
		queue.display();
		
		System.out.println("\nDequeue");
		
		System.out.println(queue.dequeue());
		
		queue.display();
		
		System.out.println("\nFront value of queue:");
		System.out.println(queue.front());
		
		queue.display();
		
	}//end main

	@Override
	public void enqueue(int x) {
		
		if(front==null) {
			front = new Node(x);
			rear = front;
		}
		else 
		{
			Node newNode = new Node(x);
			rear.nextNode = newNode;
			rear = newNode;
		}
		
	}//end enqueue

	@Override
	public int dequeue() {
		int x = -1;
		if(front!=null) 
		{
			x = front.value;			
			front = front.nextNode;
			
		}
		
		return x;
	}

	@Override
	public int front() {
		
		return front.value;
	}

	@Override
	public boolean isEmpty() {
		
		return (front==null);
	}

	@Override
	public void display() {
		System.out.println("Display Queue: ");
		Node current = front;		
		while(current!=null) {			
			System.out.print(current.value+" ");			
			current = current.nextNode;
		}
		
	}//end display

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

}//end class
