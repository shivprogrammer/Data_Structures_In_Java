package ds;

public class BasicQueue<X> {
    private X[] data;
    private int front;
    private int end;
    
    public BasicQueue() {
        this(1000);
    }
    
    public BasicQueue(int size) {
        this.front = -1;
        this.end = -1;
        data = (X[])new Object[size];
    }
    
    public int size() {
        if (front == -1 && end == -1) {
            return 0;
        }
        else {
            return end - front + 1;
        }
    }
    
    public void enqueue(X newItem) {
        front = 0;
        data[end++] = newItem;
        queuePointer++;
        
    }
    
    public X dequeue() {
        front++;
        return data[front - 1];
        
    }
    
    public boolean search(X item) {
        
    }
    
    public X access(X item) {
        
    }
}
