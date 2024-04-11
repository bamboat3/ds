
public interface Queue {
	void enqueue(Customer x);
	Customer dequeue();
	Customer front();
	boolean isEmpty();
	boolean isFull();
	void display();
}
