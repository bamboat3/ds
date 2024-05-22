public class MaxHeapPriorityQueue {
    private int[] H = new int[50];
    private int size = -1;

    // Function to return the index of the parent node of a given node
    private int parent(int i) {
        return (i - 1) / 2;
    }

    // Function to shift up the node in order to maintain the heap property
    private void shiftUp(int i) {
        while (i > 0 && H[parent(i)] < H[i]) {
            // Swap parent and current node
            swap(parent(i), i);
            // Update i to parent of i
            i = parent(i);
        }
    }

    // Function to insert an element into the priority queue (heap)
    public void insert(int p) {
        size++;
        H[size] = p;
        // Shift Up to maintain heap property
        shiftUp(size);
    }

    // Function to extract the element with maximum priority from the priority queue (heap)
    public int extractMax() {
        if (size < 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int result = H[0];
        H[0] = H[size];
        size--;
        // Shift down the replaced element to maintain the heap property
        shiftDown(0);
        return result;
    }

    // Function to shift down the node in order to maintain the heap property
    private void shiftDown(int i) {
        int maxIndex = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left <= size && H[left] > H[maxIndex]) {
            maxIndex = left;
        }
        if (right <= size && H[right] > H[maxIndex]) {
            maxIndex = right;
        }
        if (i != maxIndex) {
            swap(i, maxIndex);
            shiftDown(maxIndex);
        }
    }

    // Helper method to swap elements in the array
    private void swap(int i, int j) {
        int temp = H[i];
        H[i] = H[j];
        H[j] = temp;
    }

    // Function to print the heap (for debugging purposes)
    public void printHeap() {
        for (int i = 0; i <= size; i++) {
            System.out.print(H[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MaxHeapPriorityQueue pq = new MaxHeapPriorityQueue();
        pq.insert(45);
        pq.insert(20);
        pq.insert(14);
        pq.insert(12);
        pq.insert(31);
        pq.insert(7);
        pq.insert(11);
        pq.insert(13);
        pq.insert(7);

        pq.printHeap();

        System.out.println("Extracted max: " + pq.extractMax());
        pq.printHeap();

        System.out.println("Extracted max: " + pq.extractMax());
        pq.printHeap();
    }
}//end class
