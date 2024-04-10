
public interface Queue {

	void enqueue(int x);
	int dequeue();
	int front();
	boolean isEmpty();
	boolean isFull();
	void display();
}
