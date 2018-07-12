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
        if ((end + 1) % data.length == front) {
            throw new IllegalStateException("The Queue is Full");
        }
        else if (front == -1) {
            front = 0;
            end = 0;
            data[end] = newItem;
        }
        else {
            end++;
            data[end++] = newItem;
        }
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
