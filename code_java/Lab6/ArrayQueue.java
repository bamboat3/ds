


public class ArrayQueue implements Queue{

	int front,rear,size,numElement;
	
	Integer[] arr;
	
	
	public ArrayQueue(int x) {	
		this.front = 0;
		this.rear = 1;
		this.size = x;
		arr = new Integer[x];
		this.numElement = 0;
	}

	public static void main(String[] args) {
		ArrayQueue queue = new ArrayQueue(8);
		
		queue.enqueue(5);
		queue.enqueue(2);
		queue.enqueue(6);
		queue.enqueue(8);
		queue.enqueue(9);
		queue.enqueue(12);
		queue.enqueue(21);
		queue.enqueue(7);
		
		queue.display();
		System.out.println("Dequeue:");
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		queue.display();
		
	}//end main
	
	@Override
	public void enqueue(int x) {
		
		rear = (rear+1)%size;
		arr[rear] = x;
		
		numElement++;
		
		if(front==0)
			front = rear;
		
	}

	@Override
	public int dequeue() {
		int x = arr[front];
		arr[front]=null;
		front = (front+1)%size;
		numElement--;
		
		return x;
	}

	@Override
	public int front() {
		
		return arr[front];
	}

	@Override
	public boolean isEmpty() {
		
		return (numElement == 0);
	}

	@Override
	public void display() {
		System.out.println("Display Queue: ");
		
		
		for(int i=0;i<size;i++)
		{
		
						
			System.out.println(arr[i]+" @ index= "+i);
		}
		
		System.out.println();
		System.out.println("front = index "+front);
		System.out.println("rear = index "+rear);
	}

	@Override
	public boolean isFull() {

		return (numElement==size);
	}

	
	
}//end class
